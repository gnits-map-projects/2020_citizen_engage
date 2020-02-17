package models;

import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.xml.soap.Name;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Provide JPA operations running inside of a thread pool sized to the connection pool
 */
public class JPAComplaintRepository implements ComplaintRepository {

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public JPAComplaintRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<Complaint> add(Complaint complaint) {
        return supplyAsync(() -> wrap(em -> insert(em, complaint)), executionContext);
    }

//    public CompletionStage<Complaint> del(String Name) {
//        return supplyAsync(() -> wrap(em -> delete(em, Name)), executionContext);
//    }
//
//    public CompletionStage<Complaint> log(String EMAIL,String PASSWORD) {
//        return supplyAsync(() -> wrap(em -> login(em, EMAIL,PASSWORD)), executionContext);
//    }

    @Override
    public CompletionStage<Stream<Complaint>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Complaint insert(EntityManager em, Complaint complaint) {
        em.persist(complaint);
        return complaint;
    }

//    private  Complaint delete(EntityManager em,String Name)
//    {
//        TypedQuery<Complaint> query = em.createQuery("select p from User p where p.Name= :Name", User.class);
//        User user =query.setParameter("Name", Name).getSingleResult();
//        em.remove(user);
//        return user;
//    }

//    private  User login(EntityManager em,String EMAIL,String PASSWORD)
//    {
//        TypedQuery<User> query = em.createQuery("select p from User p where p.Email= :EMAIL and p.Password = PASSWORD", User.class);
//        User user =query.setParameter("Email", EMAIL).getSingleResult();
//        em.remove(user);
//        return user;
//    }

    private Stream<Complaint> list(EntityManager em) {
        List<Complaint> complaint = em.createQuery("select p from Complaint p", Complaint.class).getResultList();
        return complaint.stream();
    }
}

package models;

import com.google.inject.ImplementedBy;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

/**
 * This interface provides a non-blocking API for possibly blocking operations.
 */
@ImplementedBy(JPAComplaintRepository.class)
public interface ComplaintRepository {

    CompletionStage<Complaint> add(Complaint complaint);

    //CompletionStage<Complaint> del(String Name);

   // CompletionStage<Complaint> log(String EMAIL,String PASSWORD);

    CompletionStage<Stream<Complaint>> list();
}
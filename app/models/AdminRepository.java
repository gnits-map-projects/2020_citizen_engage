package models;

import com.google.inject.ImplementedBy;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

/**
 * This interface provides a non-blocking API for possibly blocking operations.
 */
@ImplementedBy(JPAAdminRepository.class)
public interface AdminRepository {

    //CompletionStage<User> add(User user);

    //CompletionStage<User> del(String Name);

    CompletionStage<Admin> adminlogin(String Adminname,String Password);

    //CompletionStage<Stream<User>> list();
}
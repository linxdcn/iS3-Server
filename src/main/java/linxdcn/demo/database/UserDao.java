package linxdcn.demo.database;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * This method will find an User instance in the database by its email.
   * Note that this method is not implemented and its working code will be
   * auto magically generated from its signature by Spring Data JPA.
   */
  public User findByEmail(String email);
  public User findById(long id);
}
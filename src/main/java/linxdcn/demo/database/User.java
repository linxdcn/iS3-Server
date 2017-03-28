package linxdcn.demo.database;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

  // An auto generated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @NotNull
  private String email;
  
  @NotNull
  private String name;

  // Public methods  
  public User() { }

  public User(long id) { 
    this.id = id;
  }
  
  public User(String email, String name) {
    this.email = email;
    this.name = name;
  }

  // Getter and setter methods
  public long getId() {
	  return id;
  }

  public void setId(long id) {
	  this.id = id;
  }
  
  public String getName() {
	  return this.name;
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public String getEmail() {
	  return email;
  }
  
  public void setEmail(String email) {
	  this.email = email;
  }
}

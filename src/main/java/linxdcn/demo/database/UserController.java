package linxdcn.demo.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	// Private fields
	@Autowired
	private UserDao userDao;

	/**
	 * GET /demo/db/create --> Create a new user and save it in the database.
	 */
	@RequestMapping("/demo/db/create")
	@ResponseBody
	public String create(String email, String name) {
		String userId = "";
		try {
			User user = new User(email, name);
			userDao.save(user);
			userId = String.valueOf(user.getId());
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created with id = " + userId;
	}

	/**
	 * GET /demo/db/delete --> Delete the user having the passed id.
	 */
	@RequestMapping("/demo/db/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			User user = new User(id);
			userDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the user:" + ex.toString();
		}
		return "User succesfully deleted!";
	}

	/**
	 * GET /demo/db/get-by-email --> Return the id for the user having the passed email.
	 */
	@RequestMapping("/demo/db/get-by-email")
	@ResponseBody
	public String getByEmail(String email) {
		String userId = "";
		try {
			User user = userDao.findByEmail(email);
			userId = String.valueOf(user.getId());
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + userId;
	}
	
	/**
	 * GET /demo/db/get-by-id --> Return the id for the user having the passed id.
	 */
	@RequestMapping("/demo/db/get-by-id")
	@ResponseBody
	public User getById(long id) {
		User user = null;
		try {
			user = userDao.findById(id);
		} catch (Exception ex) {
			
		}
		return user;
	}

	/**
	 * GET /demo/db/update --> Update the email and the name for the user in the
	 * database having the passed id.
	 */
	@RequestMapping("/demo/db/update")
	@ResponseBody
	public String updateUser(long id, String email, String name) {
		try {
			User user = userDao.findOne(id);
			user.setEmail(email);
			user.setName(name);
			userDao.save(user);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "User succesfully updated!";
	}
}

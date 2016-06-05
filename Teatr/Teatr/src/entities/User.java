package entities;

public class User {
	private int user_id;
	private String email;
	private String password;
	private String first_name;
	private String last_name;
	private String user_type; //possible options: viewer, admin, seller, manager
	private String user_status; //possible options: active/inactive 
	
	public User(int user_id, String email, String password, String first_name, String last_name, String user_type,
			String user_status) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_type = user_type;
		this.user_status = user_status;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	
	
}

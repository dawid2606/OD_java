package entities;

public class Actor {
	private int actor_id;
	private String actor_first_name;
	private String actor_last_name;
	
	
	
	public Actor(int actor_id, String actor_first_name, String actor_last_name) {
		super();
		this.actor_id = actor_id;
		this.actor_first_name = actor_first_name;
		this.actor_last_name = actor_last_name;
	}
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public String getActor_first_name() {
		return actor_first_name;
	}
	public void setActor_first_name(String actor_first_name) {
		this.actor_first_name = actor_first_name;
	}
	public String getActor_last_name() {
		return actor_last_name;
	}
	public void setActor_last_name(String actor_last_name) {
		this.actor_last_name = actor_last_name;
	}
	
	
}

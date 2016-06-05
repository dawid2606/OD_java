package entities;

public class Repertoire {
	private int position_id;
	private int spectacle_id;
	private String spectacle_time;
	private String spectacle_hour;
	private String spectacle_room;  //possible options: 'green', 'red'
	
	public Repertoire(int position_id, int spectacle_id, String spectacle_time, String spectacle_hour,
			String spectacle_room) {
		super();
		this.position_id = position_id;
		this.spectacle_id = spectacle_id;
		this.spectacle_time = spectacle_time;
		this.spectacle_hour = spectacle_hour;
		this.spectacle_room = spectacle_room;
	}
	public Repertoire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPosition_id() {
		return position_id;
	}
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	public int getSpectacle_id() {
		return spectacle_id;
	}
	public void setSpectacle_id(int spectacle_id) {
		this.spectacle_id = spectacle_id;
	}
	public String getSpectacle_time() {
		return spectacle_time;
	}
	public void setSpectacle_time(String spectacle_time) {
		this.spectacle_time = spectacle_time;
	}
	public String getSpectacle_hour() {
		return spectacle_hour;
	}
	public void setSpectacle_hour(String spectacle_hour) {
		this.spectacle_hour = spectacle_hour;
	}
	public String getSpectacle_room() {
		return spectacle_room;
	}
	public void setSpectacle_room(String spectacle_room) {
		this.spectacle_room = spectacle_room;
	}
	
	
}

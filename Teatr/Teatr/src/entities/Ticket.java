package entities;

import javax.persistence.*;

@Entity 
@Table(name="tickets")
public class Ticket {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticket_id;
	private int user_id;
	private int spectacle_id;
	private int seat_id;
	private String ticket_status;
	
	
	
	public Ticket(int ticket_id, int user_id, int spectacle_id, int seat_id, String ticket_status) {
		super();
		this.ticket_id = ticket_id;
		this.user_id = user_id;
		this.spectacle_id = spectacle_id;
		this.seat_id = seat_id;
		this.ticket_status = ticket_status;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getSpectacle_id() {
		return spectacle_id;
	}
	public void setSpectacle_id(int spectacle_id) {
		this.spectacle_id = spectacle_id;
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public String getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}
	

}

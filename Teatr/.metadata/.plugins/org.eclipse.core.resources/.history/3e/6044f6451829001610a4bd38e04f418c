package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


//@NamedQuery(name = "Seat.SELECT_ALL",
//            query = "SELECT place_number FROM seats where row_number=1")

@Entity
@Table(name="seats")
@NamedQueries({

    @NamedQuery(
    name="Seat.SELECT_ALL",
    query="SELECT s FROM Seat s "
    ),

    @NamedQuery(
    name="Seat.SelectPlacesFor1",
    query="SELECT s.place_number FROM Seat s where s.row_number=1"
    )
})

public class Seat {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seat_id;
	private int row_number;
	private int place_number;
	
	public Seat(int seat_id, int row_number, int place_number) {
		super();
		this.seat_id = seat_id;
		this.row_number = row_number;
		this.place_number = place_number;
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public int getRow_number() {
		return row_number;
	}
	public void setRow_number(int row_number) {
		this.row_number = row_number;
	}
	public int getPlace_number() {
		return place_number;
	}
	public void setPlace_number(int place_number) {
		this.place_number = place_number;
	}
	@Override
	public String toString() {
		return "Seat [seat_id=" + seat_id + ", row_number=" + row_number + ", place_number=" + place_number + "]";
	}
	
	
	
	
}

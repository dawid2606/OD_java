package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="spectacles")
@NamedQueries({
	@NamedQuery(name="Spectacle.SelectAll",
			query="SELECT s FROM Spectacle s"),
	@NamedQuery(name="Spectacle.SelectDetailsOfSpectacle",
			query="SELECT s FROM Spectacle s WHERE s.spectacle_id LIKE :spectacle_id")
}
		)
public class Spectacle {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int spectacle_id;
	private String spectacle_name;
	private String spectacle_duration;
	private String spectacle_director;
	private float normal_price;
	private float reduced_price;
	
	public Spectacle(int spectacle_id, String spectacle_name, String spectacle_duration, String spectacle_director,
			float normal_price, float reduced_price) {
		super();
		this.spectacle_id = spectacle_id;
		this.spectacle_name = spectacle_name;
		this.spectacle_duration = spectacle_duration;
		this.spectacle_director = spectacle_director;
		this.normal_price = normal_price;
		this.reduced_price = reduced_price;
	}
	public Spectacle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSpectacle_id() {
		return spectacle_id;
	}
	public void setSpectacle_id(int spectacle_id) {
		this.spectacle_id = spectacle_id;
	}
	public String getSpectacle_name() {
		return spectacle_name;
	}
	public void setSpectacle_name(String spectacle_name) {
		this.spectacle_name = spectacle_name;
	}
	public String getSpectacle_duration() {
		return spectacle_duration;
	}
	public void setSpectacle_duration(String spectacle_duration) {
		this.spectacle_duration = spectacle_duration;
	}
	public String getSpectacle_director() {
		return spectacle_director;
	}
	public void setSpectacle_director(String spectacle_director) {
		this.spectacle_director = spectacle_director;
	}
	public float getNormal_price() {
		return normal_price;
	}
	public void setNormal_price(float normal_price) {
		this.normal_price = normal_price;
	}
	public float getReduced_price() {
		return reduced_price;
	}
	public void setReduced_price(float reduced_price) {
		this.reduced_price = reduced_price;
	}
	@Override
	public String toString() {
		return "Spectacle [spectacle_id=" + spectacle_id + ", spectacle_name=" + spectacle_name
				+ ", spectacle_duration=" + spectacle_duration + ", spectacle_director=" + spectacle_director
				+ ", normal_price=" + normal_price + ", reduced_price=" + reduced_price + "]";
	}
	
	
}

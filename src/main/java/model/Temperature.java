package model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Temperature {

	@Id
	@GeneratedValue
	private int id;
	private Timestamp measure_date;
	private float temperature;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getMeasure_date() {
		return measure_date;
	}

	public void setMeasure_date(Timestamp measure_date) {
		this.measure_date = measure_date;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
}
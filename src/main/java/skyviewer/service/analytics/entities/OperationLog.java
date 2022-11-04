package skyviewer.service.analytics.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

///Entity that logs reservation batch operations
///Should only log when Post operation is successful.

@Entity
public class OperationLog {

	@Id
	@GeneratedValue
	Long Id;
	@Column
	Long numReservations;
	@Column
	Float totalFare;
	@Column
	String origin;
	@Column
	String destination;
	
	public OperationLog() {}
	public OperationLog(Long id, Long numReservations, Float totalFare, String origin, String destination) {
		super();
		Id = id;
		this.numReservations = numReservations;
		this.totalFare = totalFare;
		this.origin = origin;
		this.destination = destination;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getNumReservations() {
		return numReservations;
	}
	public void setNumReservations(Long numReservations) {
		this.numReservations = numReservations;
	}
	public Float getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(Float totalFare) {
		this.totalFare = totalFare;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "OperationLog [Id=" + Id + ", numReservations=" + numReservations + ", totalFare=" + totalFare
				+ ", origin=" + origin + ", destination=" + destination + "]";
	}
	
	
	
	
	
}

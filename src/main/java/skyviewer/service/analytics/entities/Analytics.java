package skyviewer.service.analytics.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Analytics {
	
	
	@Id
	@GeneratedValue
	Long Id;
	@Column
	Long visits;
	@Column
	Long reservations;
	@Column
	String popularDestination;
	@Column 
	String popularOrigin;
	@Column
	Float totalFare;
	public Analytics(Long id, Long visits, Long reservations, String popularDestination, String popularOrigin,
			Float totalFare) {
		super();
		Id = id;
		this.visits = visits;
		this.reservations = reservations;
		this.popularDestination = popularDestination;
		this.popularOrigin = popularOrigin;
		this.totalFare = totalFare;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getVisits() {
		return visits;
	}
	public void setVisits(Long visits) {
		this.visits = visits;
	}
	public Long getReservations() {
		return reservations;
	}
	public void setReservations(Long reservations) {
		this.reservations = reservations;
	}
	public String getPopularDestination() {
		return popularDestination;
	}
	public void setPopularDestination(String popularDestination) {
		this.popularDestination = popularDestination;
	}
	public String getPopularOrigin() {
		return popularOrigin;
	}
	public void setPopularOrigin(String popularOrigin) {
		this.popularOrigin = popularOrigin;
	}
	public Float getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(Float totalFare) {
		this.totalFare = totalFare;
	}
	@Override
	public String toString() {
		return "Analytics [Id=" + Id + ", visits=" + visits + ", reservations=" + reservations + ", popularDestination="
				+ popularDestination + ", popularOrigin=" + popularOrigin + ", totalFare=" + totalFare + "]";
	}
	
	

}

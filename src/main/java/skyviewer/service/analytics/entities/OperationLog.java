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
	
}

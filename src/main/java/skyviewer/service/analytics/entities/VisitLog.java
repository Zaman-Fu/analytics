package skyviewer.service.analytics.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

///Entity that logs site visitations.

@Entity
public class VisitLog {
	
	
	@Id
	@GeneratedValue
	Long Id;
	
	@Column
	LocalDateTime accessDateTime;

}

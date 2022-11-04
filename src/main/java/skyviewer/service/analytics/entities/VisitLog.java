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
	String pageName;
	
	@Column
	LocalDateTime accessDateTime;

	public VisitLog() {}
	
	public VisitLog(String pageName, LocalDateTime accessDateTime) {
		super();
		this.pageName = pageName;
		this.accessDateTime = accessDateTime;
	}

	public VisitLog(Long id, String pageName, LocalDateTime accessDateTime) {
		super();
		Id = id;
		this.pageName = pageName;
		this.accessDateTime = accessDateTime;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public LocalDateTime getAccessDateTime() {
		return accessDateTime;
	}
	public void setAccessDateTime(LocalDateTime accessDateTime) {
		this.accessDateTime = accessDateTime;
	}
	
	@Override
	public String toString() {
		return "VisitLog [Id=" + Id + ", pageName=" + pageName + ", accessDateTime=" + accessDateTime + "]";
	}
	
	

}

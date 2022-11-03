package skyviewer.service.analytics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import skyviewer.service.analytics.entities.Analytics;

public interface AnalyticsRepository  extends JpaRepository<Analytics,Long>{
	

}

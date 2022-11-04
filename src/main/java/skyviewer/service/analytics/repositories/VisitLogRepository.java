package skyviewer.service.analytics.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import skyviewer.service.analytics.entities.VisitLog;
import skyviewer.service.analytics.entities.VisitLogAggregate;

public interface VisitLogRepository extends JpaRepository <VisitLog,Long> {

	
	///Stuffing the aggregate rows into the POJO objects and shipping off the list of those objects
	@Query("SELECT new skyviewer.service.analytics.entities.VisitLogAggregate(v.pageName,COUNT(v.pageName)) "
			+ " FROM VisitLog AS v GROUP BY v.pageName")
	public List<VisitLogAggregate> getVisitLogAggregate();
}

package skyviewer.service.analytics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import skyviewer.service.analytics.entities.VisitLog;

public interface VisitLogRepository extends JpaRepository <VisitLog,Long> {

}

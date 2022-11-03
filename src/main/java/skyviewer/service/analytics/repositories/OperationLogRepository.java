package skyviewer.service.analytics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import skyviewer.service.analytics.entities.OperationLog;

public interface OperationLogRepository extends JpaRepository<OperationLog,Long>{

}

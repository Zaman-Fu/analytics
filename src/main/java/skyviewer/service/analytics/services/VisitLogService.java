package skyviewer.service.analytics.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skyviewer.service.analytics.entities.VisitLog;
import skyviewer.service.analytics.entities.VisitLogAggregate;
import skyviewer.service.analytics.repositories.VisitLogRepository;

@Service
public class VisitLogService {

	
	@Autowired
	VisitLogRepository repository;

	public VisitLog logVisit(String pageName) {
		
		VisitLog visit= new VisitLog(pageName,LocalDateTime.now());
		
		return repository.save(visit);
	}

	public List<VisitLogAggregate> getVisitLogAggregate() {
		
		return repository.getVisitLogAggregate();
	}
}

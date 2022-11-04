package skyviewer.service.analytics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skyviewer.service.analytics.entities.OperationLog;
import skyviewer.service.analytics.repositories.OperationLogRepository;

@Service
public class OperationLogService {

	@Autowired
	OperationLogRepository repository;

	public OperationLog logOperation(OperationLog newOperation) {
		// TODO Auto-generated method stub
		
		
		return repository.save(newOperation);
	}
}

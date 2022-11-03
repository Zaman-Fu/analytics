package skyviewer.service.analytics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skyviewer.service.analytics.repositories.OperationLogRepository;

@Service
public class OperationLogService {

	@Autowired
	OperationLogRepository repository;
}

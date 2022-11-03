package skyviewer.service.analytics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import skyviewer.service.analytics.services.OperationLogService;

@RestController
public class OperationLogController {
	
	@Autowired
	OperationLogService service;

}

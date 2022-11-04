package skyviewer.service.analytics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import skyviewer.service.analytics.entities.OperationLog;
import skyviewer.service.analytics.entities.VisitLog;
import skyviewer.service.analytics.services.OperationLogService;



///This is for admin use and could just as easily be aggregated from the reservation service. Recommend not using it for the moment.
///Partner, please use the AnalyticsController instead for now.
@RestController
public class OperationLogController {
	
	@Autowired
	OperationLogService service;
	
	
	
	@PostMapping("log/operation")
	public ResponseEntity<OperationLog> LogOperation(@RequestBody OperationLog newOperation)
	{
		OperationLog operation=service.logOperation(newOperation);
		if(operation==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
		
		return new ResponseEntity<>(operation,HttpStatus.CREATED);
	}
	
	

}

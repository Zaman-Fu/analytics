package skyviewer.service.analytics.controllers;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import skyviewer.service.analytics.entities.VisitLog;
import skyviewer.service.analytics.entities.VisitLogAggregate;
import skyviewer.service.analytics.services.VisitLogService;

@RestController
public class VisitLogController {
	
	@Autowired
	VisitLogService service;
	
	
	@PostMapping("log/visit/{pageName}")
	public ResponseEntity<VisitLog> LogVisit(@PathVariable String pageName)
	{
		VisitLog visit=service.logVisit(pageName);
		if(visit==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
	
	///Returns the total visits for every page("view") in the site.
	@GetMapping("log/visit")
	public ResponseEntity<List<VisitLogAggregate>> GetVisitLogAggregate()
	{
		List<VisitLogAggregate> visitLogAggregate= service.getVisitLogAggregate();
		
		if(visitLogAggregate==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}
		
		return new ResponseEntity<>(visitLogAggregate,HttpStatus.OK);
	}
	

}

package skyviewer.service.analytics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import skyviewer.service.analytics.entities.Analytics;
import skyviewer.service.analytics.services.AnalyticsService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AnalyticsController {

	@Autowired
	AnalyticsService service;
	@GetMapping("analytics")
	public ResponseEntity<Analytics> GetAnalytics()
	{
		Analytics analytics=service.getAnalytics();
		
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
		
	}
	@PatchMapping("analytics/visitors")
	public ResponseEntity<Analytics> PatchVisitorCount()
	{
		Analytics analytics=service.updateVisitorCount();
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	@PatchMapping("analytics/reservations")
	public ResponseEntity<Analytics> PatchReservationCount(int amountToAdd)
	{
		Analytics analytics=service.updateReservationCount(amountToAdd);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	@PatchMapping("analytics/visitors")
	public ResponseEntity<Analytics> PatchFareAmount(float amountToAdd)
	{
		Analytics analytics=service.updateFareTotal(amountToAdd);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	@PatchMapping("analytics/destination")
	public ResponseEntity<Analytics> PatchPopularDestination(String mostPopular)
	{
		Analytics analytics=service.updatePopularDestination(mostPopular);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	@PatchMapping("analytics/origin")
	public ResponseEntity<Analytics> PatchPopularOrigin(String mostPopular)
	{
		Analytics analytics=service.updatePopularOrigin(mostPopular);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	
}

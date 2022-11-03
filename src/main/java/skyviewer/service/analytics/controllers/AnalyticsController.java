package skyviewer.service.analytics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import skyviewer.service.analytics.entities.Analytics;
import skyviewer.service.analytics.services.AnalyticsService;

///TODO:In retrospect, this one object analytics is terrible,
///And it should be altered so as not to need to have to fetch information from the other two services
///Such that there are actually two entities, one counting total visits, and the other keeping track of reservation entries anonymously
///Such as: how many passengers booked with each operation, heading where, and maybe the time the operation was made.
///Will implement it the right way assuming time allows

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AnalyticsController {

	@Autowired
	AnalyticsService service;
	
	@GetMapping("analytics")
	public ResponseEntity<Analytics> GetAnalytics()
	{
		Analytics analytics=service.getAnalytics().get();
		
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
	public ResponseEntity<Analytics> PatchReservationCount(@RequestBody int amountToAdd)
	{
		Analytics analytics=service.updateReservationCount(amountToAdd);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	@PatchMapping("analytics/fares")
	public ResponseEntity<Analytics> PatchFareAmount(@RequestBody float amountToAdd)
	{
		Analytics analytics=service.updateFareTotal(amountToAdd);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	@PatchMapping("analytics/destination")
	public ResponseEntity<Analytics> PatchPopularDestination(@RequestBody String mostPopular)
	{
		Analytics analytics=service.updatePopularDestination(mostPopular);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	@PatchMapping("analytics/origin")
	public ResponseEntity<Analytics> PatchPopularOrigin(@RequestBody String mostPopular)
	{
		Analytics analytics=service.updatePopularOrigin(mostPopular);
		if(analytics==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(analytics,HttpStatus.OK);
	}
	
	
}

package skyviewer.service.analytics.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skyviewer.service.analytics.entities.Analytics;
import skyviewer.service.analytics.repositories.AnalyticsRepository;

@Service
public class AnalyticsService {
	
	@Autowired
	AnalyticsRepository repository;

	public Optional<Analytics> getAnalytics() {
		// TODO Auto-generated method stub
		return repository.findById(1l);
	}

	public Analytics updateVisitorCount() {
		// TODO Auto-generated method stub
		Analytics analytics=repository.findById(1l).get();
		analytics.setVisits(analytics.getVisits()+1);
		repository.save(analytics);
		return analytics;
	}

	public Analytics updateReservationCount(int amountToAdd) {
		// TODO Auto-generated method stub
		Analytics analytics=repository.findById(1l).get();
		analytics.setReservations(analytics.getReservations()+amountToAdd);
		repository.save(analytics);
		return analytics;
	}

	public Analytics updateFareTotal(float amountToAdd) {
		// TODO Auto-generated method stub
		Analytics analytics=repository.findById(1l).get();
		analytics.setTotalFare(analytics.getTotalFare()+amountToAdd);
		repository.save(analytics);
		return analytics;
	}

	public Analytics updatePopularDestination(String mostPopular) {
		// TODO Auto-generated method stub
		Analytics analytics=repository.findById(1l).get();
		analytics.setPopularDestination(mostPopular);
		repository.save(analytics);
		return analytics;
	}

	public Analytics updatePopularOrigin(String mostPopular) {
		// TODO Auto-generated method stub
		Analytics analytics=repository.findById(1l).get();
		analytics.setPopularOrigin(mostPopular);
		repository.save(analytics);
		return analytics;
	}

}

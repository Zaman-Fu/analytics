package skyviewer.service.analytics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skyviewer.service.analytics.entities.Analytics;
import skyviewer.service.analytics.repositories.AnalyticsRepository;

@Service
public class AnalyticsService {
	
	@Autowired
	AnalyticsRepository repository;

	public Analytics getAnalytics() {
		// TODO Auto-generated method stub
		return null;
	}

	public Analytics updateVisitorCount() {
		// TODO Auto-generated method stub
		return null;
	}

	public Analytics updateReservationCount(int amountToAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	public Analytics updateFareTotal(float amountToAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	public Analytics updatePopularDestination(String mostPopular) {
		// TODO Auto-generated method stub
		return null;
	}

	public Analytics updatePopularOrigin(String mostPopular) {
		// TODO Auto-generated method stub
		return null;
	}

}

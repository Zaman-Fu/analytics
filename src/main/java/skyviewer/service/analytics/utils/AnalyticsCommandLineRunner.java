package skyviewer.service.analytics.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import skyviewer.service.analytics.entities.Analytics;
import skyviewer.service.analytics.repositories.AnalyticsRepository;


@Component
public class AnalyticsCommandLineRunner implements CommandLineRunner{

	@Autowired
	AnalyticsRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Analytics(1l,0l,0l,"None","None",0f));
		
	}

}

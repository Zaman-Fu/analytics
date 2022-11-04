package skyviewer.service.analytics.utils;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import skyviewer.service.analytics.entities.Analytics;
import skyviewer.service.analytics.entities.VisitLog;
import skyviewer.service.analytics.repositories.AnalyticsRepository;
import skyviewer.service.analytics.repositories.VisitLogRepository;


@Component
public class AnalyticsCommandLineRunner implements CommandLineRunner{

	@Autowired
	AnalyticsRepository repository;
	
	@Autowired
	VisitLogRepository visitLogRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Analytics(1l,0l,0l,"Paris","New York",0f));
		
		visitLogRepository.save(new VisitLog(0l,"Home",LocalDateTime.now()));
		visitLogRepository.save(new VisitLog(1l,"Home",LocalDateTime.now()));
		visitLogRepository.save(new VisitLog(2l,"Home",LocalDateTime.now()));
		visitLogRepository.save(new VisitLog(3l,"Home",LocalDateTime.now()));
		visitLogRepository.save(new VisitLog(4l,"Flights",LocalDateTime.now()));
		visitLogRepository.save(new VisitLog(5l,"Flights",LocalDateTime.now()));
		
	}

}

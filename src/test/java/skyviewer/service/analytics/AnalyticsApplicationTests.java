package skyviewer.service.analytics;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import skyviewer.service.analytics.controllers.AnalyticsController;
import skyviewer.service.analytics.entities.Analytics;



@SpringBootTest
class AnalyticsApplicationTests {

	@Autowired
	private AnalyticsController controller ;
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	void GetAnalytics_ReturnsOK()
	{
		ResponseEntity<Analytics> response=controller.GetAnalytics();
		
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	void PatchAnalyticsVisitorCount_ReturnsOK()
	{
		ResponseEntity<Analytics> response=controller.PatchVisitorCount();
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	void PatchAnalyticsReservationCount_ReturnsOK()
	{
		ResponseEntity<Analytics> response=controller.PatchReservationCount(3);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	void PatchAnalyticsTotalFares_ReturnsOK()
	{
		ResponseEntity<Analytics> response=controller.PatchFareAmount(1800.5f);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	void PatchAnalyticsPopularDestination_ReturnsOK()
	{
		ResponseEntity<Analytics> response=controller.PatchPopularDestination("Djibuti");
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	@Test
	void PatchAnalyticsPopularOrigin_ReturnsOK()
	{
		ResponseEntity<Analytics> response=controller.PatchPopularOrigin("Athens");
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
	
	

}

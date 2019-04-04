package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void findPiratesByShipId(){
//		List<Pirate> found = pirateRepository.findPiratesByShipId(1L);
//		assertEquals("John", found.get(0).getFirstName());
//		assertEquals("Silver", found.get(0).getLastName());
//	}

	@Test
	public void findDistilleriesByRegion(){
		List<Distillery> found = distilleryRepository.findAllDistilleriesByRegion("Speyside");
		assertEquals(2, found.size());
	}

	@Test
	public void findAllWhiskiesForAGivenYear(){
		List<Whisky> found = whiskyRepository.findAllWhiskyByYear(1991);
		assertEquals(1, found.size());
	}

//	@Test
//	public void findAllWhiskyByDistillery(){
//		List<Whisky> found = whiskyRepository.findAllWhiskyByDistillery("Macallan");
//		assertEquals(1, found.size());
//	}


}

package com.event.service.service;

import java.util.List;

import com.event.service.model.EventDetails;
import com.event.service.repository.EventDetailsRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventDetailsService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EventDetailsService.class);

	@Autowired
	private EventDetailsRepo eventDetailsRepo;


	public List<EventDetails> getAllEventdetails() {
		LOGGER.info("entering service method getAllEventdetails");
		return eventDetailsRepo.findAll();
	}

	
	public EventDetails getEventDetailById(Long id) {
		LOGGER.info("entering service method getEventDetailById");
		return eventDetailsRepo.findById(id).orElse(null);
	}
	
}

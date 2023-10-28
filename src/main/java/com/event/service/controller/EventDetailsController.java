package com.event.service.controller;

import java.io.IOException;
import java.util.List;

import com.event.service.model.EventDetails;
import com.event.service.service.EventDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class EventDetailsController {
	private static final Logger LOGGER = LoggerFactory.getLogger(EventDetailsController.class);

	@Autowired
	private EventDetailsService eventDetailsSerice;

	@GetMapping("events")
	public ResponseEntity<List<EventDetails>> fetchAllEvents() throws IOException {

		LOGGER.info("entering controller method fetchAllEvents");
		List<EventDetails> response = eventDetailsSerice.getAllEventdetails();
		LOGGER.info("exiting controller method fetchAllEvents");
		return ResponseEntity.ok().body(response);

	}

	@GetMapping("events/{id}")
	public ResponseEntity<EventDetails> fetchEventById(@PathVariable("id") Long id) throws IOException {

		LOGGER.info("entering controller method fetchEventById");
		EventDetails response = eventDetailsSerice.getEventDetailById(id);

		if (response == null) {
			LOGGER.info("No records found for the given id");
			return ResponseEntity.notFound().build();
		}
		LOGGER.info("exiting controller method fetchEventById");
		return ResponseEntity.ok().body(response);

	}

}

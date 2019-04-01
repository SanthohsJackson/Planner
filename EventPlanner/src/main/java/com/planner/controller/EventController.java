package com.planner.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planner.data.Event;
import com.planner.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	private EventService eventService;

	@GetMapping
	public List<Event> getEvent() {
		return eventService.getAllEvents();
	}

	@PostMapping
	public Event createPet(@Valid @RequestBody Event event) {		
		return eventService.saveEvent(event);
	}

}

package com.planner.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planner.data.Event;

@RestController
@RequestMapping("/event")
public class EventController {

	@GetMapping
	public Event getEvent() {

		Event event = new Event();
		event.setName("Test Event");
		Date date = new Date();
		event.setTime(date.toString());
		return event;
	}

}

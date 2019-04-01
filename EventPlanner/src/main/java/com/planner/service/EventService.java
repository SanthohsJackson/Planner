package com.planner.service;

import java.util.List;

import com.planner.data.Event;

public interface EventService {

	public List<Event> getAllEvents();
	
	public Event saveEvent(Event event);
}

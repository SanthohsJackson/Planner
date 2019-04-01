package com.planner.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planner.data.Event;
import com.planner.repo.EventRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo eventRepo;

	public List<Event> getAllEvents() {
		return eventRepo.findAll();
	}

	public Event saveEvent(Event event) {
		event.set_id(ObjectId.get());
		return eventRepo.save(event);
	}

}

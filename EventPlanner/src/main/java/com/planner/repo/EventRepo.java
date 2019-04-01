package com.planner.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.planner.data.Event;

public interface  EventRepo  extends MongoRepository<Event, String> {

	Event findBy_id(ObjectId _id);
}

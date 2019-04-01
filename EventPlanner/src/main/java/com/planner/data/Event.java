package com.planner.data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Event {

	@Id
	private ObjectId _id;

	private String name;

	private String time;	

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}

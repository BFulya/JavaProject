package com.n11.oop.solid.log.good;

public class DbLog implements ILog {
	@Override
	public String log(String value) {
		
		return value + "recorded to Database";
	}
}

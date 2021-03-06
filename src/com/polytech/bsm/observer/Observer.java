package com.polytech.bsm.observer;

import java.util.HashMap;
import java.util.TimeZone;

public interface Observer {

	// Method to update views. Will be called by subject's method notify()
	public void update(HashMap<String, Integer> timeMap, TimeZone timeZone);
}

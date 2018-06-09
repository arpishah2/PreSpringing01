package com.springing.PreSpringing01.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DynamicMessageOfTheDayImpl implements MessageOfTheDayService {

	private final String[] messages = new String[] {
			"Sunday Morning message!",
			"Monday Morning message!",
			"Tuesday Morning message!",
			"Wednesday Morning message!",
			"Thursday Morning message!",
			"Friday Morning message!",
			"Saturday Morning message!"
	};
	
	public String getMessage() {
		
		final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);
		return messages[day-1];
	}

}

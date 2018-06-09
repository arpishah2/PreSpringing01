package com.springing.PreSpringing01;

import com.springing.PreSpringing01.service.DynamicMessageOfTheDayImpl;
import com.springing.PreSpringing01.service.MessagePrinterService;
import com.springing.PreSpringing01.service.ObjectFactory;

/**
 * Hello world!
 *
 */
public class Client 
{
	public static void main(String args[]) {
		//configuration part	we can then swap impl with DynamicMessageOfTheDayImpl.class			
		final MessagePrinterService aMessagePrinter = ObjectFactory.getInstance(MessagePrinterService.class, DynamicMessageOfTheDayImpl.class);
		aMessagePrinter.printMessage();
	}

}

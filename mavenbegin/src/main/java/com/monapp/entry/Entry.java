package com.monapp.entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.monapp.model.Instrument;
import com.monapp.model.Musicien;

public class Entry {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/context.xml");
		
		//Instrument i = (Instrument)ctx.getBean("fender");
		// i.play();  Ca donne ran tan tan en console
		
		Musicien m1 = (Musicien)ctx.getBean("musicien1");
		m1.perform();
		Musicien m2 = (Musicien)ctx.getBean("musicien2");
		m2.perform();
		

	}

}

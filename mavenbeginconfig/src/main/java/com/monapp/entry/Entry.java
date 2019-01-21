package com.monapp.entry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.monapp.config.ContextConfig;
import com.monapp.model.Guitariste;
import com.monapp.model.Instrument;
import com.monapp.model.Musicien;

public class Entry {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ContextConfig.class);
		
		Musicien m1 = (Musicien)ctx.getBean(Guitariste.class);
		m1.perform();
		
		

	}

}

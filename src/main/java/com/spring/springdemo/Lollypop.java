package com.spring.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Lollypop implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("2nd best");

	}

}

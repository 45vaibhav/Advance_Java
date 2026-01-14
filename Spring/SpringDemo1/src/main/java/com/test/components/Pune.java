package com.test.components;

import org.springframework.stereotype.Component;

import com.test.service.Address;

@Component("pune")
public class Pune implements Address {
		public Pune() {
			super();
		}
		
		@Override
		 public void streetAddress(){
			System.out.println("Pune address reached");
		}		
}

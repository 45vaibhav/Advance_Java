package com.test.components;

import org.springframework.stereotype.Component;

import com.test.service.Address;

@Component("satara")
public class Satara implements Address {
		public Satara() {
			super();
		}
		
		@Override
		 public void streetAddress(){
			System.out.println("Satara address reached");
		}		
}
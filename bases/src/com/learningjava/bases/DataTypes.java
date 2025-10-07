package com.learningjava.bases;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataTypes {
	public static void main(String[] args) {
		System.out.println("We can use Unicode for almost everything: 😊");
		
		char character = 'à';
		System.out.println(character);
		
		double d1 = 0.1;
		double d2 = 0.2;
		
		double sum = d1 + d2;
		
		System.out.printf("%.2f\n", sum);
		System.out.println(sum);
		
	//	double dPrimitivo = null;
		Double dEncapsulado = null;
		
		System.out.println(dEncapsulado);
		
		String textWithNumber = "1234";
		
		int number = Integer.parseInt(textWithNumber);
		
		System.out.println(number * 2);
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		
		System.out.println(bd1);
		System.out.println(bd2);
		
		BigDecimal bdSum = bd1.add(bd2);
		
		System.out.println(bdSum);
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now.plusMonths(1));
		
		LocalDate day = LocalDate.of(2025, 1, 31);
		
		System.out.println(day.plusMonths(2));
		
		LocalTime hour = LocalTime.now();
		
		System.out.println(hour);
		
		
		
	
}
}

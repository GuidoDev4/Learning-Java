package com.learningjava.bases;

public class SwitchExamples {
	public static void main(String[] args) {
		
		int days;
		
		for(int month = 1; month <= 12; month++) {
			switch(month) {
			case 2: 
				days = 28;
				break;
		case 4:
		case 6:
		case 9:
		case 11: 
			days = 30; 
			break;
		default: 
			days = 31;
		}
			System.out.printf("%d ", days);
		}
		
		System.out.println();
		
		for(int month = 1; month <= 12; month++) {
			switch(month) {
			case 2: 
				days = 28;
				break;
			case 4,6,9,11:
				days = 30;
				break;
			default:
				days = 31;
			}
			
			System.out.printf("%d ", days);
		}
		
		System.out.println();
		
		for(int month = 1; month <= 12; month++) {
			switch (month) {
			case 2 -> days = 28;
			case 4,6,9,11 -> days = 30;
			default -> days = 31;
			
			}
			System.out.printf("%d ", days);
		}
		
		System.out.println();
		for (int month = 1; month <= 12; month++) {
			days = switch (month) {
			case 2 -> 28;
			case 4,6,9,11 -> 30;
			default -> 31;
			};
			
			System.out.printf("%d ", days);
		}
	}

}

package Lab2;

import java.util.Scanner;

public class Exercise2 {
	Integer number;
	Scanner scanner = new Scanner(System.in);
	
	public Exercise2() {
		
	}
	
	public Exercise2(Integer number) {
		this.number = number;
	}
	
	public void numberInit() {
		System.out.println("Please choose a number between 1 and 9: ");
		
		this.number = scanner.nextInt();
	}
	
	public void ifEx2() {
		if (this.number.equals(0)) {
			System.out.println("ZERO");
		}
		else if (this.number.equals(1)) {
			System.out.println("ONE");
		}
		else if (this.number.equals(2)) {
			System.out.println("TWO");
		}
		else if (this.number.equals(3)) {
			System.out.println("THREE");
		}
		else if (this.number.equals(4)) {
			System.out.println("FOUR");
		}
		else if (this.number.equals(5)) {
			System.out.println("FIVE");
		}
		else if (this.number.equals(6)) {
			System.out.println("SIX");
		}
		else if (this.number.equals(7)) {
			System.out.println("SEVEN");
		}
		else if (this.number.equals(8)) {
			System.out.println("EIGHT");
		}
		else {
			System.out.println("NINE");
		}
	}
	
	public void switchEx2() {
		switch(this.number) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("Invalid input!");	
		}
	}
	
	public void runEx2() {
		numberInit();
		ifEx2();
		switchEx2();
	}
}

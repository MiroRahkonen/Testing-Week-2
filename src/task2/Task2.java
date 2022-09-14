/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

/**
 *
 * @author Miro Rahkonen
 */
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int function = 1;
                int earthTime,martianTime;
		Scanner scanner = new Scanner(System.in);
		
		while(function != 0) {
			System.out.println("1) Convert Martian time to Earth time and vice versa");
			System.out.println("2) Navigate to Earth or Mars");
			System.out.println("0) Exit");
			System.out.print("Choose option: ");
			function = scanner.nextInt();
			switch(function) {
				case 1:
					System.out.print("1) Martian->Earth | 2) Earth->Martian: ");
					int x = scanner.nextInt();
					if(x == 1) {
						System.out.print("Martian time in hours: ");
						martianTime = scanner.nextInt();
                                                earthTime = martianTime*3;
						System.out.println(martianTime+" hours in Martian time is "+earthTime+" hours in Earth time.\n");
					}
					else if(x == 2) {
						System.out.print("Earth time in hours: ");
						earthTime = scanner.nextInt();
                                                martianTime = earthTime/3;
						System.out.println(earthTime+" hours in Earth time is "+martianTime+" hours in Martian time.\n");
					}
					else {
						System.out.println("Invalid input.\n");
					}
					break;
					
				case 2:
					System.out.println("2.");
					break;
					
				case 0:
					System.out.println("Exiting program.");
					function = 0;
					scanner.close();
					break;
					
				default:
					System.out.println("Incorrect input.");
					break;
			}
		}
	}
}
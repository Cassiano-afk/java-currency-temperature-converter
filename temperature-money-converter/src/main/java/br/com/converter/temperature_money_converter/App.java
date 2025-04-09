package br.com.converter.temperature_money_converter;

import java.util.Scanner;


/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Type 1 to convert currencies, or 2 to convert temperature: ");
		int optionSelected = scanner.nextInt();

		if (optionSelected == 1) {
			System.out.println("Choose your currency: 1 - Dolar, 2 - Real, 3 - Euro, 4 - Libra");
			int Selectedcurrency = scanner.nextInt();
			System.out.println("Insert the value you want to convert(No special characters, please): ");

			// Método para converter as moedas

		} else if (optionSelected == 2) {
			System.out.println("Choose your temperature: 1- Celsius, 2 - Fahrenheit, 3 - Kelvin");
			int selectedMeasuramentUnit = scanner.nextInt();
			
		} else {
			System.out.println("Invalid Option, please try again");
		}
	}
	
}

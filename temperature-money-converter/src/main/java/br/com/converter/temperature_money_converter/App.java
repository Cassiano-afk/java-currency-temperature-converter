package br.com.converter.temperature_money_converter;

import java.util.Scanner;

import br.com.converter.temperature_money_converter.CurrencyConverter.Currency;
import br.com.converter.temperature_money_converter.TemperatureConverter.TemperatureUnit;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CurrencyConverter currencyConverter = new CurrencyConverter();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		while (true) {

			System.out.print("Type 1 to convert currencies, or 2 to convert temperature: ");
			int optionSelected = scanner.nextInt();

			if (optionSelected == 1) {
				System.out.println("Choose your currency:");
				System.out.println("1 - Dolar (USD), 2 - Real (BRL), 3 - Euro (EUR)");
				int selectedCurrency = scanner.nextInt();

				System.out.print("Insert the value you want to convert (no special characters): ");
				double value = scanner.nextDouble();

				System.out.println("Convert to: 1 - Dolar, 2 - Real, 3 - Euro");
				int currencyToConvert = scanner.nextInt();

				Currency from = mapToCurrency(selectedCurrency);
				Currency to = mapToCurrency(currencyToConvert);

				if (from == null || to == null) {
					System.out.println("Invalid currency option.");
					return;
				}

				double result = currencyConverter.convert(value, from, to);
				System.out.println("Converted value: " + String.format("%.2f", result));

			} else if (optionSelected == 2) {
				System.out.println("Choose your temperature unit:");
				System.out.println("1 - Celsius, 2 - Fahrenheit, 3 - Kelvin");
				int selectedTempUnit = scanner.nextInt();

				System.out.print("Insert the temperature value to convert: ");
				double tempValue = scanner.nextDouble();

				System.out.println("Convert to: 1 - Celsius, 2 - Fahrenheit, 3 - Kelvin");
				int targetTempUnit = scanner.nextInt();

				TemperatureUnit from = mapToTemperatureUnit(selectedTempUnit);
				TemperatureUnit to = mapToTemperatureUnit(targetTempUnit);

				if (from == null || to == null) {
					System.out.println("Invalid temperature option.");
					return;
				}

				double result = temperatureConverter.convert(tempValue, from, to);
				System.out.println("Converted temperature: " + String.format("%.2f", result));

			} else {
				System.out.println("Invalid Option, please try again");
			}

			// Aqui está a opção de saída após a execução
			System.out.print("Pressione 0 para sair ou qualquer outro número para continuar: ");
			int exitOption = scanner.nextInt();
			if (exitOption == 0) {
				System.out.println("Obrigado por usar nosso conversor. Até a próxima!");
				break;
			}

		}
		scanner.close();

	}

	private static Currency mapToCurrency(int option) {
		switch (option) {
		case 1:
			return Currency.USD;
		case 2:
			return Currency.BRL;
		case 3:
			return Currency.EUR;
		default:
			return null;
		}
	}

	private static TemperatureUnit mapToTemperatureUnit(int option) {
		switch (option) {
		case 1:
			return TemperatureUnit.Celsius;
		case 2:
			return TemperatureUnit.Fahrenheit;
		case 3:
			return TemperatureUnit.Kelvin;
		default:
			return null;
		}
	}
}

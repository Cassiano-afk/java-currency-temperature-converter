package br.com.converter.temperature_money_converter;

public class TemperatureConverter {

	public enum TemperatureUnit  {
		Celsius,
		Fahrenheit,
		Kelvin
	}
	
	public Double convert(double amount, TemperatureUnit from, TemperatureUnit to) {
		if (from == to) {
			System.out.println("Source and target currency are the same. No conversions needed");
			return amount;
		}
		
		double resultInCelsius;
		
		switch (from) {
			case Celsius:
				resultInCelsius = amount;
				break;
			case Fahrenheit:
				resultInCelsius = (amount - 32) * 5 / 9;
				break;
			case Kelvin:
				resultInCelsius = amount - 273.15;
				break;
			default:
				throw new IllegalArgumentException("Unknow temperature unit");
		
		}
		
		switch (to) {
			case Celsius:
				return resultInCelsius;
			case Fahrenheit:
				return (resultInCelsius * 9 / 5) + 32;
			case Kelvin:
				return resultInCelsius + 273.15;
			default:
				throw new IllegalArgumentException("Unknow temperature unit");
		
		}
		
	} 
	
}

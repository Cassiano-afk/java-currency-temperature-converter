package br.com.converter.temperature_money_converter;

public class currencyConverter {
	 
	public int currencyCalc (int a, int b, int c, int d) {
		Integer receivedValue = a;
		Integer convertedValue;
		Integer selectedCurrency = c;
		Integer currencyToConvert = d;
		
		if (selectedCurrency == 1 && currencyToConvert == 2) {
			convertedValue = receivedValue * 6;
			return convertedValue;
		} else if (selectedCurrency == 2 && currencyToConvert == 1) {
			convertedValue = receivedValue / 6;
			return convertedValue;
		} else if (selectedCurrency == 2 && currencyToConvert == 3) {
			convertedValue = receivedValue * 7;
			return convertedValue;
		} else if (selectedCurrency == 3 && currencyToConvert == 2) {
			convertedValue = receivedValue / 7;
			return convertedValue;
		} else if (selectedCurrency == 1 && currencyToConvert == 3) {
			
			return convertedValue;
		} else if (selectedCurrency == currencyToConvert) {
			System.out.println("You don't want to convert nothing. Get out of here.");
		} else {
			System.out.println("Are you some kind of idiot ?");
		}
		 
		
		
		return b;
	}

}

package br.com.converter.temperature_money_converter;

public class CurrencyConverter {
	 
	public enum Currency {
		USD, BRL, EUR
	}
	
	public Double convert(double amount, Currency from, Currency to) {
		if (from == to) {
			System.out.println("Source and target currency are the same. No conversions needed");
			return amount;
		}
		
		double rate = getExchangeRate(from, to);
		return amount * rate;
	}
	
	public double getExchangeRate(Currency from, Currency to) {
		
		if (from == Currency.USD && to == Currency.BRL) return 6.0;
        if (from == Currency.BRL && to == Currency.USD) return 1 / 6.0;
        if (from == Currency.BRL && to == Currency.EUR) return 1 / 7.0;
        if (from == Currency.EUR && to == Currency.BRL) return 7.0;
        if (from == Currency.USD && to == Currency.EUR) return 1.0; // Exemplo
        if (from == Currency.EUR && to == Currency.USD) return 1.0;
		
		throw new IllegalArgumentException("Unsuported currency conversion " + from + " to " + to);
		
	}
}

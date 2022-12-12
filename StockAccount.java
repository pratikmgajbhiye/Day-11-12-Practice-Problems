package com.BridgeLabz.Day11and12PracticeProblem;

public class StockAccount {
	String stockName;
	float LTP;
	float Quantity;

	StockAccount(String stockName, float LTP, float Quantity) {
		this.stockName = stockName;
		this.LTP = LTP;
		this.Quantity = Quantity;
	}

	public void toGetTotalValue() {
		float total = LTP * Quantity;
		System.out.println("Value of Each Stock " + stockName + " is " + LTP);
		System.out.println("Total Value Require for Investment of " + stockName + " for Number of Share " + Quantity
				+ " is " + total);
		System.out.println();
	}

	public static void main(String[] args) {
		StockAccount Jio = new StockAccount("Jio", 4115.64f, 10f);
		StockAccount Airtel = new StockAccount("Airtel", 263.90f, 100f);
		Jio.toGetTotalValue();
		Airtel.toGetTotalValue();

	}

}

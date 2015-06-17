package myUtil; // created my own package myUtil

public class CoffeeBag {
	/** Patricia Organ - 01110489 - Assignment 6 Q2
	 * */
	private final double tax = 0.10;
	private final double perPound = 5.55;
	
	
	//default constructor no values will be set but defining my own constructor
	public CoffeeBag(){
		
	}
	//2 getter methods
	public double getTax(){
		return tax;
	}
	
	public double getPerLb(){
		return perPound;
	}
	// 2 methods created for calculating with passed values
	public double CalculatePrice(int weight, int numBags){
		return ( weight * numBags * perPound);
	}
	
	public double CalculateTaxTotal(double total){
		return (total + total * tax);
	}
}// end CoffeeBag Class

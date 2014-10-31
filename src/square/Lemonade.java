package square;

public class Lemonade 
	{
	private int cups;
	private int size;
	private double priceTotal;
	
	public Lemonade(int cupCount, int cupSize) 
	{
		cups = cupCount;
		size = cupSize;
	}
	
	private double price()
	{
		double small = 1.25;
		double medium = 1.75;
		double large = 1.95;
				
		if (size == 3) 
		{
			priceTotal = cups*large;
		}
		else if (size == 2)
		{
			priceTotal = cups*medium;
		}
		else priceTotal = cups*small;
		return priceTotal;
	}
	
	public String toString()
	{
		return "The price is: " + price();
	}
}

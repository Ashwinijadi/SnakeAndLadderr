package snakeLadder;

public class SnakeLadder {
	public static void main( String args[] )   
	{
	int min = 1;  
	int max = 6;  
	System.out.println("Random value of type double between "+min+" to "+max+ ":");  
	double dice= Math.random()*(max-min+1)+min;   
	System.out.println("dice : "+dice);  
	} 
}

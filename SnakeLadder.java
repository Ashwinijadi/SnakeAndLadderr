package snakeLadder;

public class SnakeLadder {
	//Constants
			public static final int SNAKE=1;
			public static final int LADDER=2;
		    public static void main(String[] args){	
				//Variable
		    int dice;
		    int check ;
		    int dicePosition=0;
		    int min = 1;  
			int max = 6;
			System.out.println("Random value of type double between "+min+" to "+max+ ":");  
			while(dicePosition<100) {
			
			dice = (int)(Math.random()*(max-min+1))+min;   
					System.out.println("dice is "+dice);
					 check = (int)(Math.random()*(2-1+1))+1;   
					System.out.println("check is "+check);
		    switch (check) {
		     case LADDER:{
		    	            dicePosition=dice+dicePosition;
		    	            System.out.println("got ladder");
		    	            break;}
		    
		     case SNAKE:{
		    	            System.out.println("got snake");
		    		        dicePosition=dicePosition-dice;
		    		    	if(dicePosition<0) {
		    		    	dicePosition=0;
		    		    }
			            break;}
		     default:{
		    	 System.out.println("no play");}
		    }
					}
			System.out.println("Player is at the position:"+dicePosition);
			if(dicePosition>100){				
				dice = (int)(Math.random()*(max-min+1))+min;   
				System.out.println("dice is "+dice);
				 check = (int)(Math.random()*(2-1+1))+1;   
				System.out.println("check is "+check);
		     dicePosition=dicePosition-dice;}
			System.out.println("Player is at the position:"+dicePosition); 
		    }
		    }

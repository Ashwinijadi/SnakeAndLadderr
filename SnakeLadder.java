package snakeLadder;

public class SnakeLadder {
	//Constants
public static final int SNAKE=1;
public static final int LADDER=2;
public static void main(String[] args){	
	//Variable
int chance=0;
int count1=0;
int count2=0;
int dicePosition1=0;
int dicePosition2=0; 
int dice = (int)(Math.random()*(6-1+1)+1);
System.out.println("Random value is:");  
 while(dicePosition1!=100 && dicePosition2!=100)
 {
		if(chance%2==0) {
			chance=dicePosition1;
			count1++;
	dice = (int)(Math.random()*(6-1+1)+1);   
			System.out.println("dice is "+dice);
		int check = (int)Math.random()*(2-1+1)+1;   
			System.out.println("check is "+check);
			 switch (check) {
		     case LADDER:{
		    	            dicePosition1=dice+dicePosition1;
		    	            System.out.println("got ladder");
		    	            break;}
		    
		     case SNAKE:{
		    	            System.out.println("got snake");
		    		        dicePosition1=dicePosition1-dice;
		    		    	if(dicePosition1<0) {
		    		    	dicePosition1=0;
		    		    }
			            break;}
		     default:{
		    	 System.out.println("no play");}
		    }
		}
else {
	chance=dicePosition2;
	count2++;
dice = (int)(Math.random()*(6-1+1)+1);   
		System.out.println("dice is "+dice);
		int check = (int)Math.random()*(2-1+1)+1;   
		System.out.println("check is "+check);
switch (check) {
 case LADDER:{
	            dicePosition2=dice+dicePosition2;
	            System.out.println("got ladder");
	            break;}

 case SNAKE:{
	            System.out.println("got snake");
		        dicePosition2=dicePosition2-dice;
		    	if(dicePosition2<0) {
		    	dicePosition2=0;
		    }
            break;}
 default:{
	 System.out.println("no play");}
}
} 		
chance++;
}
 if(dicePosition1>=100){	
		count1++;
		dice = (int)(Math.random()*(6)+1);   
		System.out.println("dice is "+dice);
		int check = (int)(Math.random()*(2-1+1))+1;   
		System.out.println("check is "+check);
        dicePosition1=dicePosition1-dice;}
 if(dicePosition2>=100){	
		count2++;
		dice = (int)(Math.random()*(6)+1);   
		System.out.println("dice is "+dice);
		int check = (int)(Math.random()*(2-1+1))+1;   
		System.out.println("check is "+check);
        dicePosition2=dicePosition2-dice;}
System.out.println("Player is at the position:"+dicePosition1);
System.out.println("Player is at the position "+dicePosition2);
System.out.println("Number of times dice is rolled "+count1);
System.out.println("Number of times dice is rolled "+count2);
if(dicePosition1>dicePosition2) {
	System.out.println("player1 is winner");}
else if(dicePosition2>dicePosition1) {
	System.out.println("player2 is winner");}
}
}




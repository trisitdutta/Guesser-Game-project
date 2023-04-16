
import java.util.Scanner;

class Player {
    
	int guessNo;
	String str;
	
	Player(String str)
	{
	  this.str = str;
	  System.out.println(str);
	}
	
	public int chooseNumber() {
		
	  Scanner sc = new Scanner(System.in);
	  guessNo = sc.nextInt();
	   return guessNo;
	}
	
}

class Guesser {
	
    int guessNo;
	public int guessANumber() {
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Hey Guesser, please guess a number");
	   guessNo = sc.nextInt();
	    return guessNo;
	}
	
}

class Umpire {
	
	int guesserValue;
	int p1Value;
	int p2Value;
	int p3Value;
	
	public void getNoFromGuesser() {
		
	  Guesser guesser = new Guesser();
	  guesserValue = guesser.guessANumber();
	}
	
	public void getNoFromPlayers() {
	  
	 Player p1 = new Player("Hey Player1, guess the number");
	 p1Value = p1.chooseNumber();
	 Player p2 = new Player("Hey Player2, guess the number");
	 p2Value = p2.chooseNumber();
	 Player p3 = new Player("Hey Player3, guess the number");
	 p3Value = p3.chooseNumber();
	}
	
	public void calculateResult() {
	  
		System.out.println("The No guess by Guesser = "+ guesserValue);
		System.out.println("The No guess by Player1 = "+ p1Value);
		System.out.println("The No guess by Player2 = "+ p2Value);
		System.out.println("The No guess by Player3 = "+ p3Value);
		
		boolean bool = true;
		
		if(guesserValue==p1Value)
		{
		  System.out.println("Player1 is the winner");
		  bool = false;
		}
		if(guesserValue==p2Value)
		{
		  System.out.println("Player2 is the winner");
		  bool = false;
		}
		if(guesserValue==p3Value)
		{
		  System.out.println("Player3 is the winner");
		  bool = false;
		}
		if(bool)
		{
		  System.out.println("All are Loosers");
		}
	}
	
	
}

public class LaunchGame {

	public static void main(String[] args) {
	 
       Umpire umpire = new Umpire();
       umpire.getNoFromGuesser();
       umpire.getNoFromPlayers();
       umpire.calculateResult();
	}

}

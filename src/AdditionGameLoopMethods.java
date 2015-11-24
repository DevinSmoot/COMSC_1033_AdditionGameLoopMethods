import java.util.Scanner;

public class AdditionGameLoopMethods {
	public static void main(String[] args) {
		//Call the addition game method.
		AdditonGameMethod();
	}//End main method
	
	public static void AdditonGameMethod() {
		int[] gameVariables = {5,2,0,4,0,0,0,0,0};
		// Set up my for loop to go through the number of rounds
		for( gameVariables[4] ++;gameVariables[4] <= gameVariables[3];gameVariables[4] = gameVariables[4] + 1){
			System.out.print("Round " + gameVariables[4] + " of " + gameVariables[3] + ". ");//Prints the round information
			gameVariables = getAndCheckStudentAnswer(gameVariables);//Calls getAndCheckStudentAnswer method to take and check answer
			if(gameVariables[7] == 1){//Checks if answer was correct and updates score to array and prints to console
				System.out.print("Your score was " + gameVariables[2] + " and is now ");//Prints score to console
				gameVariables[2] = gameVariables[2] + gameVariables[0];//Stores the score to array
				System.out.print(gameVariables[2] + ". ");
				if(gameVariables[4]<gameVariables[3]){//Checks to make sure the game should continue
					System.out.print("Your hardness was " + gameVariables[0] + " and is now ");
					gameVariables[0] = gameVariables[0] * gameVariables[1];
					System.out.println(gameVariables[0] + ".");
				}//End IF
			}else{//ELSE for incorrect answer; updates score to array and console
				System.out.print("Your score is " + gameVariables[2] + ". ");
				if(gameVariables[4]<gameVariables[3]){//Checks to make sure the game should continue
					System.out.print("Your hardness was " + gameVariables[0] + " and is now ");
					if(gameVariables[0]>5){
						gameVariables[0] = gameVariables[0] / gameVariables[1];
					}
					System.out.println(gameVariables[0] + ".");
				}//End IF
			}//End Else
		}//End IF
		System.out.print("\nThe game is complete. ");
		System.out.println("Your final score was " + gameVariables[2] );
	}//End AdditionGameMethod
	
	public static int[] getAndCheckStudentAnswer(int[] gameVariables) {
		gameVariables[5] = (int)(Math.random()*gameVariables[0]);//Number1 generation
		gameVariables[6] = (int)(Math.random()*gameVariables[0]);//Number2 generation
		System.out.print("Add " + gameVariables[5] + " and " + gameVariables[6] +": ");//Print math problem to console
		Scanner input = new Scanner(System.in);//Initialize scanner for input
		//Take input and validate that input is an integer
		do {
			while (!input.hasNextInt()) {
	           System.out.println("That's not a number! Please enter a number.");
	           input.next(); // this is important!
	        }//End WHILE
		 gameVariables[8] = input.nextInt(); // this is important!
		}while (gameVariables[8] <= 0);//End DO
		if(gameVariables[8] == (gameVariables[5] + gameVariables[6])){
			System.out.print("Correct. ");
			gameVariables[7]=1;
		}else{
			System.out.println("Nice try, but the correct answer was " 
					+ (gameVariables[5] + gameVariables[6]) + ".");
			gameVariables[7]=0;
		}//End IF
		return gameVariables;
	}//End getAndCheckStudentAnswer method
}//End of program
package codsoft;

import java.util.Scanner;

public class NumberGame {
	
	public static int randomNumber() {
		int randomNum = (int)(Math.random()*100)+1;
		
		Scanner src = new Scanner(System.in);
		int usernum;
		int count=0;
		
		do {
			System.out.println("\nGuess number Between 0 to 100");
			usernum= src.nextInt();
			
			if(usernum> randomNum)
				System.out.println("\nNumber is too high");
			
			else if(usernum<randomNum)
				System.out.println("\nNumber is too low");
			
			else
				System.out.println("Correct Number guessed");
			
			count++;
		}while(usernum!=randomNum);
		return count;
		
	}
	
	public static int calculateScore(int guesses) {
		// Calculate score based on number of guesses
		int baseScore = 100; // Maximum score
		int deduction = (guesses - 1)*10; // Deduct 10 points for each guess after the first one
		int finalScore = baseScore - deduction;
		return finalScore;
	}
	public static void main(String[] args) {
		int count = randomNumber();
		System.out.println("You guessed number in: "+count+"guesses");
		
		int finalscore = calculateScore(count);
		System.out.println("Your Score is: "+finalscore);

	}

}

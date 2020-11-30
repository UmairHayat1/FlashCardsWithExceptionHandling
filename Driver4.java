package myPackage;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
public class Driver4 
{
	private static long spent;

	public static void main(String[] args) 
	{ 
		//This code is for a loop and the boolean is setting the condition
		Scanner input = new Scanner(System.in); 
		boolean playAgain = true;
		while (playAgain) //Playagian will be what is given in the loop
			{
			//This is giving values to the objects and pulling from the other classes
			Driver4  objP = new Driver4 ();
			Driver4  objS = new Driver4 ();
			
			System.out.print("Enter your name:");
			String mName = input.nextLine();
			
			
			char operation; //This will ask you a question and if the condition is not met it will end the operation
			boolean tryAgain = true;
			
			do 
			{
			/* case 'A':
                 operation = "Addition"; // stores the value
                 computedAnswer = operandOne + operandTwo; //accepts and passes on the answer
                 userAnswer = fc.validNumber("\n " + operandOne +
                         " + " + operandTwo + " = ");
                
                 summary += operandOne + " + " + operandTwo + " = " +
                     userAnswer + " A: " + computedAnswer;
                
                 if(computedAnswer == userAnswer) //loop setting condition
                 {
                     correct++; //adds value 
                     score += 33;
                     summary += " correct \n "; //shows what will display if correct
                     System.out.print("\n Correct");
                 }
               
                 else
                 {
                    
                     summary += " incorrect \n ";
                     System.out.print("\n Inorrect");
                 }
             break;
             case 'S':                  
                 operation = "Subtraction";
                 computedAnswer = operandOne - operandTwo;
                 userAnswer = fc.validNumber("\n " + operandOne +
                         " - " + operandTwo + " = ");

                 summary += operandOne + " - " + operandTwo + " = " +
                     userAnswer + " A: " + computedAnswer;
                
                 if(computedAnswer == userAnswer)
                 {
                     correct++;
                     score += 33;
                     summary += " correct \n ";
                     System.out.print("\n Correct");
                 }
                
                 else
                 {
                     summary += " incorrect \n";
                     System.out.print("\n Inorrect");
                 }
             break;
             case 'M':
                 operation = "Multiplication";
                 computedAnswer = operandOne * operandTwo;
                 userAnswer = fc.validNumber("\n " + operandOne +
                         " * " + operandTwo + " = ");
       
                 summary += operandOne + " * " + operandTwo + " = " +
                     userAnswer + " A: " + computedAnswer;
                
                 if(computedAnswer == userAnswer)
                 {
                     correct++;
                     score += 33;
                     summary += " correct \n ";
                     System.out.print("\n Correct");
                 }
                 
                 else
                 {
                    
                     summary += " incorrect \n";
                     System.out.print("\n Inorrect");
                 }
             break;
             case 'D':
                 operation = "Division";
                 computedAnswerD = operandOne / operandTwo;
                 userAnswerD = fc.validNumber("\n " + operandOne +
                         " / " + operandTwo + " = ");
           
                 summary += operandOne + " / " + operandTwo + " = " +
                     userAnswerD + " A: " + computedAnswerD;
                
                 if(computedAnswerD == userAnswerD)
                 {                        
                     correct++;
                     score += 33;
                     
                     summary += " correct \n ";
                     System.out.print("\n Correct");
                 }
                
              
                 else
                 {       
				//This is the main component of the code allowing you to select which type of problems you would want to solve
				System.out.print("Enter operation using A, S, M, or D: ");
				operation = input.next().charAt(0);
				if (operation == 'A' || operation == 'S' || operation == 'M' || operation == 'D' || operation == 'a' || operation == 's' || operation == 'm' || operation == 'd')
					tryAgain = false;
				else 
					System.out.println("Operation must be A, S, M, D. Try again");
			} 	while (tryAgain);
	
				//This is going to ask you how many problems you want to do.
				int NumberOfProblems = 0;
				boolean trydifferentnumber = true;
				
				//The following code is what will be displaced in the window
				String Operationname = "";*/
			do
			{
				try
				{
				//this loop is what is generating the amount of problems you wish to work on and ending the loop when the amount of questions is met
				System.out.print("Enter number of problems:");
				NumberOfProblems = input.nextInt();
				if (NumberOfProblems > 0)
				trydifferentnumber = false;
					else 
				throw new IllegalArgumentException("numOfProb < 1");
				}
				catch (Exception e1) 
				{
					System.out.println("Incorrect value entered. Try again");
					input.nextLine();			
				}
			} 	while(trydifferentnumber);
			
			
				int low = 0;                //This is where you will enter a low values.
				boolean tryagainlow = true;
			
			do
			{
				try
				{
					System.out.print("Enter low number:");
					low = input.nextInt();
					if (low >= 0)
						tryagainlow = false;
					else 
						throw new IllegalArgumentException("low < 1");
				}
				catch (Exception e1) 
				{
					System.out.println("Incorrect value entered. Try again");
					input.nextLine();			
				}
			} while(tryagainlow); //This is where the high values will be added
			int high = 0;
			boolean tryagainhigh = true;
			
			do
			{
				try
				{
					//This will give you an error if you select a low number that has a bigger value than the high value
					System.out.print("Enter high number:");
					high = input.nextInt();
					if (high >= low)
						tryagainhigh = false;
					else 
						throw new IllegalArgumentException("high < 1");
				}
				catch (Exception e1) 
				{
					System.out.println("Incorrect value entered. Try again");
					input.nextLine();			
					}
			} while(tryagainhigh);
			int right = 0;
			
			//This will capture how long the code will take you to do
			long startTime = System.currentTimeMillis();
			
			
			
			//This code is calling from the driver class
			
			objP.sethigh(high);
			objP.setright(right);
			objP.switchstatement(input);
			objP.setoperation(operation);
			objP.setNumberOfProblems(NumberOfProblems);
			objP.setOperationname(Operationname);
			objP.setlow(low);
			
			//This will get time and date
			LocalDate date = java.time.LocalDate.now(); 
			LocalTime time = java.time.LocalTime.now();
			
			//this is calling to the session class
			objS.getScore(NumberOfProblems, right);
			objS.getSession(spent, Operationname, low, high, NumberOfProblems, right, mName, date, time);
			
			objP.probImage(); //calls from the session class
			//This will end the timer
			long endTime = System.currentTimeMillis();
			long spent = endTime - startTime;	
			spent = Math.round(spent *  .001); 
			
			//Following code will update the code in the driver and session class
			right = objP.right();
			
			Operationname = objP.Operationname();
			objS.setOperationname(Operationname);
			
			
			  // This is what will be shown in the display at the end 
	          // System.out.print("\n Summary\n");
	          // System.out.print(" " + name + " "+ new Date() + " " + operation + " Range: " +
	          // lowValue + " - " + highValue + " #Prob: " + numberOfProblems +
	          // " Correct: " + correct + " Score: " + score + " Time: " + duration);
	          //System.out.print("\n " + summary);
	          //System.out.print("\n Would you like to try another set of problems? Y/N? "); //Provides to option to repeat the project
	          //char ch = fc.sc.next().charAt(0);
	          // ch = Character.toUpperCase(ch); 
	          //if(ch == 'N') // This is where the project will not repeat if N is chosen
	             //  break;        
			//This is what will allow the the code to repeat
			boolean retry = true;
            char yesorno;
            do 
            	 /*  //These will calculate when you ended the quiz and how long the quiz took
                endTime = System.currentTimeMillis();
                duration = (endTime - startTime) / 1000;
               
                // This is what will be shown in the display at the end 
                System.out.print("\n Summary\n");
                System.out.print(" " + name + " "+ new Date() + " " + operation + " Range: " +
                        lowValue + " - " + highValue + " #Prob: " + numberOfProblems +
                        " Correct: " + correct + " Score: " + score + " Time: " + duration);
                System.out.print("\n " + summary);
                System.out.print("\n Would you like to try another set of problems? Y/N? "); //Provides to option to repeat the project
                char ch = fc.sc.next().charAt(0);
               
                ch = Character.toUpperCase(ch); 
                
                if(ch == 'N') // This is where the project will not repeat if N is chosen
                    break;          
            }
            while(true); // Do while loops ends here
            System.out.print("\n Thank you for playing! Play again soon.");
        }
     }*/
            {
            System.out.print("Would you like to try another set of problems? Y/N? ");
            yesorno = input.next().charAt(0);
                if(yesorno == 'N' || yesorno == 'n')
                    {
                    playAgain = false;
                    retry = false;
                    System.out.println("Thanks for playing! Play again.");
                    }
                else if(yesorno == 'Y' || yesorno == 'y')  //this will decide if you want to continue the code
                {
                    playAgain = true;
                    retry = false;
                }
                else
                {
                    System.out.println("enter Y or N");
                }
            }
            while(retry);
		}
			input.close();
	}


	private void setoperation(char operation) {
		// TODO Auto-generated method stub
		
	}

	private void switchstatement(Scanner input) {
		// TODO Auto-generated method stub
		
	}

	private int right() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String Operationname() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setOperationname(String operationname) {
		// TODO Auto-generated method stub
		
	}
	private void probImage() {
		// TODO Auto-generated method stub
		
	}

	private void getSession(long spent, String operationname, int low, int high, int numberOfProblems, int right,
			String mName, LocalDate date, LocalTime time) {
		// TODO Auto-generated method stub
		
	}

	private void getScore(int numberOfProblems, int right) {
		// TODO Auto-generated method stub
		
	}

	private void setright(int right) {
		// TODO Auto-generated method stub
		
	}

	private void setNumberOfProblems(int numberOfProblems) {
		// TODO Auto-generated method stub
		
	}

	private void sethigh(int high) {
		// TODO Auto-generated method stub
		
	}

	private void setlow(int low) {
		// TODO Auto-generated method stub
		
	}
}
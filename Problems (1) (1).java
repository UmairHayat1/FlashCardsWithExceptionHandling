import java.util.Scanner;
public class Problems {

	Scanner input = new Scanner(System.in);
	
	//adding values to the variables
		private String[] probImage;
		
		private String Operationname;
		private String operation;
		private int NumberOfProblems;
		private String corinc;
		private int probScore;
		private int response;
		private int correct;
		private int num1;
		private int num2;
		private int right;
		private int number;

		private int operandOne;
		

		Problems (int _no, char ch, int mn, int mx) {}
	
	//these are just the methods being set
	
	public void setright(int right) {
		this.right = right;
	}
	public void setnumber(int number) {
		this.number = number;
	}
	public void setresponse(int response) {
		this.response = response;
	}
	public void setcorrect(int correct) {
		this.correct = correct;
	}
	public void setnum1(int num1) {
		this.num1 = num1;
	}
	public void setnum2(int num2) {
		this.num2 = num2;
	}
	public void setoperation(char operation) {
		this.operation = operation;
	}
	public void setOperationname(String Operationname) {
		this.Operationname = Operationname;
	}
	public void setNumberOfProblems(int NumberOfProblems) {
		this.NumberOfProblems = NumberOfProblems;
	}
	public void setprobScore(int probScore) {
		this.probScore = probScore;
	}
	public void setlow(int low) {
	}
	public void sethigh(int high) {
	}
	

	//further setting values to the methods
	
	public int low() {
		int low = 0;
		return low;
	}
	public int high() {
		int high = 0;
		return high;
	}
	public int right() {
		return right;
	}
	public int number() {
		return number;
	}
	public int response() {
		return response;
	}
	public int correct() {
		return correct;
	}
	public String Operationname() {
		return Operationname;
	}
	public String operation() {
		return operation;
	}
	public int NumberOfProblems() {
		return NumberOfProblems;
	}
	public int probScore() {
		return probScore;
	}
	public int num1() {
		return num1;
	}
	public int num2() {
		return num2;
	}
	
	//This is where is the switch statement is kept
	public void switchstatement (Scanner input) 
	
	{
	
	
	probImage = new String [NumberOfProblems]; //Arrays being created
	
	corinc = " ";
	int low = 0;
	int high = 0;
	Object computedAnswer;
	Object userAnswer;
	Object summary;
	String operandTwo;
	Object fc;
	int score;
	int computedAnswerD;
	int userAnswerD;
	boolean trydifferentanswer;
	int answer;
	int i;
	switch(operation) //must match the number of problems
		{
		
		
		 case 'A':
             operation = "Addition"; // stores the value
             computedAnswer = operandOne + operandTwo; //accepts and passes on the answer
             userAnswer = ((Object) fc).validNumber("\n " + operandOne +
                     " + " + operandTwo + " = ");
            
             summary += operandOne + " + " + operandTwo + " = " +
                 userAnswer + " A: " + computedAnswer;
            
             if(computedAnswer == userAnswer) //loop setting condition
             {
                 correct++; //adds value 
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
             userAnswer = ((Object) fc).validNumber("\n " + operandOne +
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
             userAnswerD = ((Object) fc).validNumber("\n " + operandOne +
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
                 summary += " incorrect \n ";
                 System.out.print("\n Inorrect");
             }
				{
					try
					{
						answer = input.nextInt();
						if (answer >= 0)
							trydifferentanswer = false;
						else 
							throw new IllegalArgumentException("answer < 1");
					}
					catch (Exception e1) 
					{
						System.out.println("Incorrect value entered. Try again");
						System.out.print(num1 + " * " + num2 + " = ");
						input.nextLine();			// Clears the input line
					}
				} while(trydifferentanswer);
				int correct = num1 * num2;
				right = getResponse(answer, correct, right);
				if (answer == correct)
				{
					corinc = "Correct";
				}
					else
						corinc = "Incorrect";
					probImage[i] = num1 + " * " + num2 + " = " + correct + " A: " + right + " " + corinc;
				}
				
		break;
				boolean trydifferentanswer1;
				String dividend;
				int answer1;
				{
					try
					{
						answer1 = input.nextInt();
						if (answer1 >= 0)
							trydifferentanswer1 = false;
						else 
							throw new IllegalArgumentException("answer < 1");
					}
					catch (Exception e1) 
					{
						System.out.println("Incorrect value entered. Try again");
						System.out.print(dividend + " / " + num2 + " = ");
						input.nextLine();			// Clears the input line
					}
				} while(trydifferentanswer1);
				int correct = divided / num2;
				right = getResponse(answer1, correct, right);
				if (answer1 == correct)
				{
					corinc = "Correct";
				}
					else
						corinc = "Incorrect";
					probImage[i] = dividend + " / " + num2 + " = " + correct + " A: " + right + " " + corinc;
			}
	
	
	public void probImage () //this will print the arrays for the switch statement
	{
		for (String vis : probImage)
		{
			System.out.println(vis);
		}
	}
	
	
	public static int getRange(int low, int high) //This is where we get the random numbers from high and low values
	{
		int range = (int)(Math.random() *(high - low + 1) + low);
		return range;
	}
	
	public static int getResponse(int answer, int correct, int right) //this will tell you if you are correct or incorrect
	{
		if(answer == correct) 
		{
			right+= 1;
			System.out.println("Correct");
		}
		else System.out.println("Incorrect");
		
		return right;
	}


	public char getType() {
	// TODO Auto-generated method stub
	return 0;
}

	public int[] getSecondVals() {
	// TODO Auto-generated method stub
	return null;
}

	public String[] getFirstVals() {
	// TODO Auto-generated method stub
	return null;
}
	public int[] getAnsVals() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getMax() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMin() {
		// TODO Auto-generated method stub
		return null;
	}
}
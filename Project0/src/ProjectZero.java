import java.util.Scanner;
import java.util.InputMismatchException;

public class ProjectZero {

	public static void main(String[] args) {
		
			Scanner inputSource = new Scanner(System.in);
			int num1,num2,total;
			double num3,num4,sum;
			
			
			System.out.println("Enter two numbers.");
			
			/**This checks to see if the user inputed two integers or two
			floating point numbers using if/else statements. A nested try/catch block was used to 
			catch the exception where an integer was used 
			*/ 
			try{
				try{
					if(inputSource.hasNextInt()){
						num1 = inputSource.nextInt();
						num2 = inputSource.nextInt();
						total = num1 + num2;
						System.out.println(total);
					}
					else if(inputSource.hasNextDouble()){
						num3 = inputSource.nextDouble();
						num4 = inputSource.nextDouble();
						sum = num3 + num4;
						System.out.println(sum);
					}
					else
						System.out.println("You entered neither an integer or a floating point number.");
						
				}
				catch(InputMismatchException e){
					System.out.println("Invalid combination of numbers.");
				}
			}
			
			/*Catches the exception where a user enters an int first and a decimal second.
			 */
			catch(InputMismatchException e2){
				System.out.println("Invalid combination of numbers.");
			}
			
			inputSource.close();	
	}
			
	
}
			







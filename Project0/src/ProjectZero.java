import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
			Scanner inputSource = new Scanner(System.in);
			int num1,num2;
			double num3,num4,sum;
	
			
			System.out.println("Enter two numbers.");
			
			/*This checks to see if the user inputed two integers or two
			floating point numbers.
			*/ 
			if(inputSource.hasNextInt()){
				num1 = inputSource.nextInt();
				num2 = inputSource.nextInt();
				sum = num1 + num2;
				System.out.println(sum);
			}
			else if(inputSource.hasNextDouble()){
				num3 = inputSource.nextDouble();
				num4 = inputSource.nextDouble();
				sum = num3 + num4;
				System.out.println(sum);
			}
			else
				System.out.println("You entered neither an integer or a floating point number.");
			
	
			inputSource.close();
			
	
	}

}


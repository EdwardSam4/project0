import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
			Scanner inputSource = new Scanner(System.in);
			int input1, input2, result;
			
			/*This checks to see if the user inputed an integer or a
			floating point number.*/ 
			
			System.out.print("Enter two numbers.");
			input1 = inputSource.nextInt();
			input2 = inputSource.nextInt();
			
			double input3 = inputSource.nextDouble();
			double input4 = inputSource.nextDouble();
			double sum = input3 + input4;
			result = input1 + input2;
			System.out.println(result);
			System.out.println(sum);
			inputSource.close();
			
	
	}

}


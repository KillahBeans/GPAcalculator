import java.util.Scanner;

public class GPACalculator{
	public static void main(String[] args) {
		Scanner numClasses = new Scanner(System.in);
		Scanner gradeScan = new Scanner(System.in);
		Scanner nameScan = new Scanner(System.in);

		System.out.println("How many classes are you taking?");

		int ttlClasses = numClasses.nextInt();

		String[] gradesList = new String[ttlClasses];
		int[] points = new int[ttlClasses];
		String[] className = new String[ttlClasses];

		System.out.println(" ");

		//for-loop for entering names of classes
		for(int i = 0; i < ttlClasses; i++){
			System.out.println("What was the name of class " + (i + 1) + "?");
			String name = nameScan.nextLine();
			className[i] = name;
		}

		System.out.println(" ");

		System.out.println("Please enter your grades");
		System.out.println("Any input not (A, B, C, D, F) will be counted as an F");

		//for-loop for entering grades of each class
		for(int i = 0; i < ttlClasses; i++){
			System.out.println("What was your grade for " + className[i] + "?");
			String grade = gradeScan.nextLine();
			gradesList[i] = grade;
		}

		int index = 0;
		int sum = 0;

		//for-each loop for assigning points for each specific grade
		for(String entry : gradesList){
			if(entry.equals("A") || entry.equals("a")){
				points[index] = 4;
				index++;
			}
			else if(entry.equals("B") || entry.equals("b")){
				points[index] = 3;
				index++;
			}
			else if(entry.equals("C") || entry.equals("c")){
				points[index] = 2;
				index++;
			}
			else if(entry.equals("D") || entry.equals("d")){
				points[index] = 1;
				index++;
			}
			else{
				points[index] = 0;
				index++;
			}
		}

		//calculates sum
		for(int i = 0; i < ttlClasses; i++){
			sum = sum + points[i];
		}

		float gpa = sum / ttlClasses;

		System.out.println(" ");
		System.out.println("Your GPA is: " + gpa);


}
}
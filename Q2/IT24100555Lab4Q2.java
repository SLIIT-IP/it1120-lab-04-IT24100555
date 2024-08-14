import java.util.Scanner;
public class IT24100555Lab4Q2 {
     public static void main(String[] args){
	 Scanner input=new Scanner(System.in);
	 
	 System.out.print("Please enter the marks (out of 100): ");
	 int exammarks = input.nextInt();
	 while (exammarks < 0 || exammarks>100) {
	    System.out.println(" Invalid input for exam marks. Terminating program ");
		System.out.print("Please enter the marks (out of 100): ");
		exammarks= input.nextInt();
	   }
	 
	 System.out.print("Please enter the lab submission marks( out of 100): ");
	 int labmarks= input.nextInt();
	 while ( labmarks< 0|| labmarks> 100){
	    System.out.println(" Invalid input for lab submission marks. Terminating program");
		System.out.print("Please enter the lab submission marks( out of 100): ");
		labmarks=input.nextInt();
		}
	     
	 System.out.print("Please enter the precentage given for the exam: ");
 	 int exampre= input.nextInt();
	 System.out.print(" Please enter the precentage given for the lab submission: ");
	 int labpre =input.nextInt();
	 
	 while (exampre+ labpre !=  100) {
	    System.out.println(" The precentage must add up to 100. Terminating program");
		System.out.print("Please enter the precentage given for the exam: ");
		exampre= input.nextInt();
		System.out.print("Please enter the precentage given for the lab submission: ");
		labpre= input.nextInt();
	 }
	 int finalmark= ( exammarks* exampre/100)+ (labmarks*labpre/100);
	 System.out.println(" Final exam mark is : " + finalmark);
	}
}
package quiz;
import java.util.*;
public class quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your height for feet: ");
		int feet = in.nextInt();
		System.out.print("Enter your height for inch: ");
		int inch = in.nextInt();
		int male = 50+((((feet-5)*12)+ inch)*6);
		int female = 40 + ((((feet-5)*12)+ inch)*5);
        System.out.println("Ideal weight for a male is " + male + " kg and the ideal weight for a female is " + female + " kg.");
		
		

	}

}

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("g’·‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		double height = sc.nextDouble();
		height = height / 100;
		double height2 = height * height;
		System.out.print("‘Ìd‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		double weight = sc.nextDouble();
		double BMI = (weight /height2);
		BMI += (weight % height2)/100;
		System.out.println("BMI‚Í"+String.format("%.2f",BMI)+"‚Å‚·");
	}
}




import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<2;i++){
		System.out.print("g’·‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		double height = sc.nextDouble();
		height = height / 100;
		double height2 = height * height;
		System.out.print("‘Ìd‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		double weight = sc.nextDouble();
		double BMI = (weight /height2);
		BMI += (weight % height2)/100;
		System.out.println("BMI‚Í"+String.format("%.2f",BMI)+"‚Å‚·");
		}
	}
}




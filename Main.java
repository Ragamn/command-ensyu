import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<2;i++){
		System.out.print("身長を入力してください");
		double height = sc.nextDouble();
		height = height / 100;
		double height2 = height * height;
		System.out.print("体重を入力してください");
		double weight = sc.nextDouble();
		double BMI = (weight /height2);
		BMI += (weight % height2)/100;
		System.out.println("BMIは"+String.format("%.2f",BMI)+"です");
		}
	}
}




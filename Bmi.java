import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i =0 ;i<2;i++){
		System.out.print("�g������͂��Ă�������");
		double height = sc.nextDouble();
		height = height / 100;
		double height2 = height * height;
		System.out.print("�̏d����͂��Ă�������");
		double weight = sc.nextDouble();
		double BMI = (weight /height2);
		BMI += (weight % height2)/100;
		System.out.println("BMI��"+String.format("%.2f",BMI)+"�ł�");
		}
	}
}




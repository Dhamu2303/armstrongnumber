package armstrong_number;
import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scan.nextInt();
		scan.close();
		if(isarmstrong(i)) {
			System.out.println(i+" is an armstrong number");
		}
		else {
			System.out.println(i+" is not an armstrong number");
		}
	}
	static boolean isarmstrong(int num) {
		int x=num,a=0,d;
		while(num!=0)
		{
			d=num%10;
			a+=Math.pow(d,3);
			num/=10;
		}
		return x==a;
	}

}

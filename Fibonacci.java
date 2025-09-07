//Write a program to print Fibonacci series of n terms where n is input by user.
import java.util.*;
class Fibonacci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int sum=0;
		int a=0;
		int b=1;
		for(int i=0;i<=n;i++){
			if(i==0){
			System.out.println(a);
			}
			else if(i==1){
			System.out.println(b);
			}
			else{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			}
		}
		sc.close();
	}
}
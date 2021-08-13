import java.util.Scanner;

public class Maxvalue {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=10,m=0,c=0;
		int Arr[]=new int[n];
		System.out.println("Enter 10 elements of array : ");
		for(int i=0;i<n;i++){
			Arr[i]=sc.nextInt();
			if(Arr[i]>m){
				m=Arr[i];c=0;
			}
			if(Arr[i]==m)
				c++;
		}
		System.out.print(c);
	}
}
import java.util.*;
public class Fibo{
	public static void main(String[] args){
        System.out.print("Enter the number of digits you want to print:-");
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
		int a = 1;
		int ans = 1;
		System.out.print(a +" ");
		
		for(int i=2; i<=num; i++){
			int temp = ans;
			ans = a;
			a = temp;
			ans = a + ans;
			System.out.print(ans+" ");
		}
    }   
}

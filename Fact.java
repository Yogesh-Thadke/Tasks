import java.util.*;
public class Fact {
    public static void main(String[] args){

        System.out.print("enter number:- ");
		
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact = fact*i;
           // System.out.println(fact);
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }    
}

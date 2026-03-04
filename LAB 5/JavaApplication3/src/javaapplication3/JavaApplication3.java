package javaapplication3;
import java.util.Scanner;
/**
 *SAP 73745
 * @author Husnain Shah
 */
public class JavaApplication3 {

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number for factorial: ");
        JavaApplication3 f = new JavaApplication3();
        int a = s.nextInt();
        System.out.println("The Factorial of " + a + " is " + f.factorial(a));
        
    }
  
    int factorial(int a){
        int fact=1;
        for(int i = 1; i < a;  i++){
             fact =  fact*i;
        }
        return fact;
    }
}

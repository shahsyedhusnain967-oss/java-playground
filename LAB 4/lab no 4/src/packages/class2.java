package packages;
// @author Husnain Shah
 import java.util.Scanner;
public class class2 {
    void mod(){
         int a , b , res;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        res=a%b;
        System.out.println("Result "+res);
    }
    int ave(int a, int b){
        return a+b/2;
    }
}

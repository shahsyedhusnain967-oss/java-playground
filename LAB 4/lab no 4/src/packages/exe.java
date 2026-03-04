package packages;
// @author Husnain Shah     SAP 73745
import java.util.Scanner;
public class exe {
    public static void main(String[]args){
        int a , b , res;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        
        class1 c1=new class1();
        class2 c2=new class2();
        System.out.println("Result of SUM "+ c1.sum(a, b));
        System.out.println("Result of MULTI "+ c1.mul(a, b));
        System.out.println("Result of DIV "+ c1.div(a, b));
        System.out.println("Result of SUB "+ c1.sub(a, b));
        System.out.println("Result of MOD "+ c2.ave(a, b) );
        c2.mod();
    }

    @Override
    public String toString() {
        return "exe []";
    }
}

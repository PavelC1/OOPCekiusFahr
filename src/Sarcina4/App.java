package Sarcina4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumbersComparator obj = new NumbersComparator();

        System.out.println("Introduceti prima variabila: ");
        double Var1 = scanner.nextDouble();
        System.out.println("Introduceti a doua variabila: ");
        double Var2 = scanner.nextDouble();

        if(obj.Comparare(Var1,Var2)==true){
            System.out.println("Variabila: "+Var1+"(maximul)este mai mare decat variabila:" + Var2);
        }else System.out.println("Variabila: "+Var2+"(maximul)este mai mare decat variabila:" + Var1);

    }
}

package Sarcina3;
import java.util.Scanner;
public  class App {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti prima variabila: ");
        double Var1 = scanner.nextDouble();
        System.out.println("Introduceti a doua variabila: ");
        double Var2 = scanner.nextDouble();
        System.out.println("Introduceti operatia (1:+,2:-,3:*,4:/ ): ");
        int operatie = scanner.nextInt();
        double Result=0;
        switch(operatie){
            case 1: Result = obj.adunare(Var1, Var2); break;
            case 2: Result = obj.scadere(Var1, Var2); break;
            case 3: Result = obj.inmultire(Var1, Var2); break;
            case 4: Result = obj.impartire(Var1, Var2); break;
            default: System.out.println("Operatie invalida!");
        }
        System.out.println("Rezultatul este: "+Result);

    }
}

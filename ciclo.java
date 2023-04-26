import java.util.Scanner;

public class ciclo {

    public static void main(String[] args){

        Scanner a = new Scanner (System.in);

        int b = 4000;
        int c = 2000;
            
        if ( 4000 == b ){
            double resultado1 = b * 0.1;
            double saldo1 = b + resultado1;
            System.out.println(saldo1);

            if ( 2000 == c ){
                double resultado2 = c * 1;
                double saldo2 = c + resultado2;
                System.out.println(saldo2);
            

            System.out.println(saldo1+saldo2);
        }}
    }

}
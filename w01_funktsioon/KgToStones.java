
import java.util.Scanner;
public class KgToStones {

    public static void main(String[] args) {
        //double on int+float pmst, peab deklareerima enne
        double stone = 0.15747;
        System.out.println("Enter Kilograms: ");
        double kg;
        //loeb input
        Scanner reader = new Scanner(System.in);
        kg = reader.nextDouble();
        double kgtostone=kg*stone;
        //output
        System.out.println( kg+ " kilograms is " +kgtostone+ " in stones");
       
    }
}

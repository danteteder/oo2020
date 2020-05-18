import java.util.Scanner;

public class Krypt {
    public static final String t2hestik = "abcdefghijklmnopqrstuvwxyz";

    //meetod krypteerimiseks, shift on arv kui mitme võrra tähti edasi panna
    public static String krypt(String tavaTekst, int shift) {
        tavaTekst = tavaTekst.toLowerCase();
        // lowercase teen et lihtsam oleks
        String kryptedTekst = "";
        for (int i = 0; i < tavaTekst.length(); i++) {
            int leianV = t2hestik.indexOf(tavaTekst.charAt(i));
            // A=0, B=1 etc
            int enVal = (shift + leianV) % 26;
            char Val = t2hestik.charAt(enVal); // char mis replaced
            kryptedTekst = kryptedTekst + Val; // lisan enne initialized stringile
        }
        return kryptedTekst;
    }

    // sama meetod ainult reverse
    public static String dekrypt(String kryptedTekst, int shift) {
        kryptedTekst = kryptedTekst.toLowerCase();
        String tavaTekst = "";
        for (int i = 0; i < kryptedTekst.length(); i++) {
            int leianV = t2hestik.indexOf(kryptedTekst.charAt(i));
            int deVal = (leianV - shift) % 26;
            if (deVal < 0) // negatiiv väärtuste jaoks
            {
                deVal = t2hestik.length() + deVal;
            }
            char Val = t2hestik.charAt(deVal);
            tavaTekst = tavaTekst + Val;
        }
        return tavaTekst;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kirjuta s6na mida krypteerida ");
        String msg = new String();
        msg = scan.next();
        System.out.println(" Krypteeritud s6na : " + krypt(msg, 4));
        System.out.print(" Dekrypteeritud s6na : ");
        System.out.print(dekrypt(krypt(msg, 4), 4));
        scan.close();
    }
}

public class Main {
    public static void main(String[] args) {

        Apartment Ap1 = new Apartment();
        Ap1.User = "Dante";
        Ap1.Gender = "He";
        Ap1.ApNumber = 1;
        Ap1.ApArea = 26;
        Ap1.ApInfo();

        Apartment Ap2 = new Apartment();
        Ap2.User = "Maria";
        Ap2.Gender = "She";
        Ap2.ApNumber = 2;
        Ap2.ApArea = 49;
        Ap2.ApInfo();

        Staircase FirstBlock = new Staircase();
        FirstBlock.BlockNumber = 1;
        FirstBlock.isClean = false;
        FirstBlock.StaircaseInfo();
    }
}
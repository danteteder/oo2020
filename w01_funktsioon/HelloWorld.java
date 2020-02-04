

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World.");

        // see on kommentaar
        
        /* see on multiline kommentaar
        */

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        /* byte, short(ehk küsides isikukoodi, MITTE teha shortiga, number ei mahu andmetüüpi)
        int(ehk 32 ühte), long, float, double, char
        */
    
        boolean flag = true;

        System.out.println(1+1); // * / - %
        int number = 5;
        System.out.println(number++);
        System.out.println(++number);

        if (number < 10 && number > 0 ){
            System.out.println("Jah");
            //&& tähendab JA ehk AND pythonis, OR == || (Z-ist vasakul klahv + parem alt)
        }
        for (int i = 0; i < 10; i++){
            /* int i = 0 määrab alguse, i < 10 näitab kaua ta kestab, i++ == i=i+1 ehk mida ta teeb igal iteratsioonil*/
        }

        int counter = 0;

        while(flag){
            if(!flag){

            }
            counter++;
            if(counter == 10){
                System.out.println("Im out");
                flag = false;
            }
            //do something

        int[] numberArray = new int[] {1,2,3,4,5}; //uus massiiv algväärtusega
        //for(int element : numberArray){ //for tsükkel, String suure tähega juhul
        //    System.out.println(element);
        //}
        //}
        //for(int i = 0; i < numberArray.length; i++){
        //    System.out.println(numberArray[i]);
        //}

        String myName = "Dante";
        System.out.println(myName);

        HelloWorld helloWorld = new HelloWorld();
        //helloWorld.printSomething();
        printSomething(10);
        System.out.println(name());
    }

    static String name(){
        return "";
    }

    static void printSomething(int number){
        int number = 5;
        for(int i = 1; i < 10; i++){
            number += i; //tähtis et += i mitte 1
        }
        System.out.println(number);
    }

}
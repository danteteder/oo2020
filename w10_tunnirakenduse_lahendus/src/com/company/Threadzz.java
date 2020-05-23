package com.company;

public class Threadzz {

    //deklareerin array-d millega läbi lähen, ei kasuta charcodes
    public static String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };
    public static String[] numbers = {"1","2","3","4","5","6","7","8","9", "10"};

    //threads = runnable interface-iga loodud programmiosad mis executivad samal ajal

    public static void main(String[] args) {
            for (int i = 0; i < letters.length; i++) {
                new Thread(getRunnable(i),letters[i]).start();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                new Thread(getRunnable(i),numbers[i]).start();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        private static void oneToTen() {
            try {
                for (int j = 0; j <=8; j++) {
                    System.out.println(numbers[j]);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("thread 1 was interrupted");
            }
        }

        private static void tenToOne() {
            try{
                for (int j = 8; j >= 0; j--) {
                    System.out.println(numbers[j]);
                    Thread.sleep(100);
                }
            }catch (InterruptedException e) {
                System.out.println("thread 2 was interrupted");

            }

        }
        private static void aToK() {
            try {
                for (int j = 0; j <=10; j++) {
                    System.out.println(letters[j]);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("thread 3 was interrupted");

            }
        }

        private static void kToA() {
            try {
                for (int j = 10; j >=  0; j--) {
                    System.out.println(letters[j]);
                    Thread.sleep(100);
                }
            }catch (InterruptedException e) {
                System.out.println("thread 4 was interrupted");
            }
        }


    private static Runnable getRunnable(int i) {
        //4 threadi panen tööle pmst
        return () -> {
            if(i == 0) {
                oneToTen();
            } else if (i==1) {
                tenToOne();
            } else if (i==2) {
                aToK();
            } else if (i==3) {
                kToA();
            }

            //prindi threadi nimi ehk kõik 1-10, 10-1 ja a-k, k-a threadid
            {
                System.out.println(Thread.currentThread().getName());
            }
        };

    }


}


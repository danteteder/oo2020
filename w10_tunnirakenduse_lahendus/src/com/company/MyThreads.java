package com.company;

public class MyThreads {
    private static String[] threadNames = { "Kati", "Mari", "Mati", "Ants", "Juku" };
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //Thread käivitab midagi mis on jooksutatav
            new Thread(getRunnable(), threadNames[i]).start();
            try {
                //loob iga 0.5s threadi ühe nimega
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static Runnable getRunnable() {
        return () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
    }
}

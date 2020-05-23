package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


    public class Tunnitoo2 {

        //loon 3 erinevat List tüüpi
        public static List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );
        public static List<String> StringList = Arrays.asList("Rock", "n", "Roll");
        public static List<Double> DoubleList = Arrays.asList(3.49 , 7.67 , 2.67 , 7.22 , 1.56 , 3.48);

        public static void main(String[] args) throws IOException  {
            //Teine kodutoo
            PrintWriter pw = new PrintWriter(new FileWriter("lopp.txt"));

            //muudame sisu streamiks ning teeme sellega midagi
            Files.readAllLines(Paths.get("andmed.txt")).stream()
                    .map(e -> e.split(","))
                    .filter(e -> Integer.parseInt(e[1]) < 10)
                    .map(e -> e[1] + " sammu liikus loom " + e[0])
                   .forEach(pw::println);

            pw.close();

            //tunnitööd:
            //teine();
            //kolmas();
            //neljas();
        }

        public static void teine(){
            //prindin välja forechiga kõik indeksid
            integerList.forEach(i -> System.out.println(i));
            StringList.forEach(i -> System.out.println(i));
            DoubleList.forEach(i -> System.out.println(i));
        }

        public static void kolmas(){
            //kasutan erinevaid stream operatsioone
            List<Integer> integerList3 = integerList.stream()
                    .filter(element -> element <= 5)
                    .map(element -> element * 8)
                    .peek(System.out::println)
                    .collect(Collectors.toList());

            System.out.println(integerList3.stream().skip(3).count());
        }

        public static void neljas(){
            IntStream.range(1, 20)
                    .filter(e -> e % 2 == 0)
                    .forEach(System.out::println);


            System.out.println(IntStream.range(1, 20).filter(e -> e % 2 == 0).allMatch(e -> e % 2 == 0));
            System.out.println(IntStream.of(1, 3, 5, 7, 9).anyMatch(e -> e % 2 != 0));
        }
    }


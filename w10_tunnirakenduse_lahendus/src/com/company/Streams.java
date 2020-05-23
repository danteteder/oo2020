package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /* for (Integer i : integerList){
            System.out.println(i);
        } */

        // Lambda () -> ...
        /* integerList.forEach(i -> System.out.println(i)); */
        /* integerList.forEach(System.out::println); */

        //filtreerime integerlistist elemente mingisuguse loogika alusel (nt elemente on vähem kui 5)
        List<Integer> integerList2 = integerList.stream()
                //mõtle sellest kui true/false returnina, et kas paneb listi v mitte
                .filter(element -> element < 5)
                //.peek(System.out::println) - tahad vaadata vahetulemust, ainult vaatamiseks soovitatud
                .collect(Collectors.toList());

        integerList2.forEach(System.out::println);

        List<Integer> integerList3 = integerList.stream()
                .filter(element -> element < 3)
                //map
                .map(element -> element * 2)
                //.peek(System.out::println)
                .map(element -> element * 2)
                //.peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(integerList.stream().count());
        //tahad skippida 3 esimest elementi ja siis need kokku lugeda
        System.out.println(integerList.stream().skip(3).count());



        //IntStreami m6te - asendada iteraatorit, all on nagu for loop mis loopib 1st viieni
        // nt IntStream.range(1,5).forEach(System.out::println);
        //koos viiega on rangeClosed meetodiga
        //IntStream.rangeClosed(1, 5).forEach(System.out::println);

        /* IntStream.of(1, 2, 4, 8)
                //korrutan e kordaja iseendaga ja üle 50 ei näita
                .map(e -> e * e)
                .filter(e -> e < 50)
                    .forEach(System.out::println); */

        //alustame ühest, i -> i * 2 on iteraator, ja siis limit on kuni - sarnane for loopiga sellest mõttes
        /* IntStream.iterate(1, i -> i * 2).limit(10).forEach(System.out::println); */

        /* IntStream.range(1, 10)
                //kui on jagatav kahega siis prindib välja
                .filter(e -> e % 2 == 0)
                //teeb doubleiks
                .mapToDouble(e -> Math.pow(e, 2))
                .forEach(System.out::println);

        //vaatame kas kõik arvud on paarisarvud
        System.out.println(IntStream.of(2, 4, 6, 8, 10).allMatch(e -> e % 2 == 0));
        //anyMatch - kui üks elementidest vastab ekspressionile, siis väljastab True, muidu False
        System.out.println(IntStream.of(2, 4, 6, 8, 9, 10).anyMatch(e -> e % 2 != 0)); */

        /* System.out.println(IntStream.of(1, 5, 10).filter(e -> e > 4).findFirst().getAsInt()); */
        /* System.out.println(IntStream.of(1, 5, 10).filter(e -> e > 4).min().getAsInt());
        System.out.println(IntStream.of(1, 5, 10).filter(e -> e > 4).max().getAsInt()); */

    }
}
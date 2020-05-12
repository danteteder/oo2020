import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sõnade lõputähed
 * 
 *  Salvesta uurimiseks vähemalt paarileheküljeline tekst. 
 *  - Trüki välja sõnade viimased tähed 
 *  - Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras 
 *  - Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse. 
 *    Luuakse HTML-leht viidetega tekstis esinenud lõputähtedega failidele, iga viite juures arv, mitu korda vastava lõputähega sõna esines.
 */

public class Exam {
    public static void main(String[] args) {
        String fileContents = getFileContents();
        
        fileContents = fileContents.replaceAll("\\.", "");
        fileContents = fileContents.replaceAll("\\,", "");

        String[] words = getWords(fileContents);

        ArrayList<Character> endChars = new ArrayList<Character>();

        System.out.println("Trükin välja sõnade viimased tähed:");

        //endChars arraysse lisan lõpu characteri ja prindin välja
        for (int i = 0; i < words.length; i++) {
            endChars.add((words[i]).charAt(words[i].length() - 1));
            System.out.println((words[i]).charAt(words[i].length() - 1));
        }

        System.out.println("Trükin välja sõnade viimased tähed nende esinemise järjekorras:");

        
        //arraysse panen kõik tähed üksikult ilma kordumiseta
        ArrayList<Character> chars = new ArrayList<Character>();

        for (int i = 0; i < endChars.size(); i++) {

            boolean exists = false;

            if (!(chars.size() == 0)) {
                for (int j = 0; j < chars.size(); j++) {
                    if(chars.get(j).equals(endChars.get(i))){
                        exists = true;
                    }
                }
            }

            if(!exists){
                chars.add(endChars.get(i));
                
            }

        }

        String allLastChars = "";

        for (int i = 0; i < endChars.size(); i++) {
            allLastChars += endChars.get(i);
        }

        //loen mitu sõna kokku on, arvestades samalt indeksilt kui varem
        ArrayList<Integer> counts = new ArrayList<Integer>();

        for (int i = 0; i < chars.size(); i++) {
            counts.add(countCharacters(allLastChars, chars.get(i)));
            
        }

        ArrayList<Character> charsDecreasingOrder = new ArrayList<Character>();
        ArrayList<Integer> countsDecreasingOrder = new ArrayList<Integer>();

        int countsLen = counts.size();
        int whilePos = 0;

        while (whilePos<countsLen) {

            int nextCount = 0;
            Character nextChar = null;
            int nextPos = -1;

            for (int j = 0; j < counts.size(); j++) {
                if(counts.get(j) > nextCount){
                    nextCount = counts.get(j);
                    nextChar = chars.get(j);
                    nextPos = j;
                }
            }

            charsDecreasingOrder.add(nextChar);
            countsDecreasingOrder.add(nextCount);
            counts.remove(nextPos);
            whilePos++;
            System.out.println("" + nextChar + " " + nextCount);
        }



        ArrayList<CharWords> charWordsObjectList = new ArrayList<CharWords>();

        for (int i = 0; i < charsDecreasingOrder.size(); i++) {
            ArrayList<String> charWordsList = new ArrayList<String>();
            for (int j = 0; j < words.length; j++) {
                if((words[j]).charAt(words[j].length() - 1) == charsDecreasingOrder.get(i)){
                    charWordsList.add(words[j]);
                }
            }

            charWordsObjectList.add(new CharWords(charsDecreasingOrder.get(i), charWordsList));

        }

        for (int i = 0; i < charWordsObjectList.size(); i++) {
            charWordsObjectList.get(i).createOutputFile();
        }

        createFinalReport(charWordsObjectList);



    }


    //
    public static void createFinalReport(ArrayList<CharWords> charWords){
        String htmlString = "";

        for (int i = 0; i < charWords.size(); i++) {
            htmlString += "<a href=\""+ charWords.get(i).getOutputFileName() +".txt\">"+ charWords.get(i).getCharacter() +"</a><br>";
        }

        String htmlBody = "<!DOCTYPE html><html><body><div>"+ htmlString +"<div></body></html>";

        createFinalReportFile(htmlBody);

    }

    //htmlBody printimiseks
    public static void createFinalReportFile(String html){
        try {
            File outputFile = new File("output/tähed.html");
            if (outputFile.createNewFile()) {
                try {
                    FileWriter writer = new FileWriter("output/tähed.html");
                    writer.write(html);
                    writer.close();
                  } catch (IOException e) {
                      //stacktrace näitab kus viga oli täpsemalt
                    e.printStackTrace();
                  }
            }
          } catch (IOException e) {
            e.printStackTrace();
          }
    }


    //space split s+-iga
    public static String[] getWords(String s) {
        return s.trim().split("\\s+");
    }

    public static int countCharacters(String s, Character character){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==character){
                count++;
            }
        }
        return count;
    }

    public static String getFileContents() {

        try {
            File file = new File("input.txt");
            Scanner reader = new Scanner(file);
            String data = "";
            while (reader.hasNextLine()) {
                data += reader.nextLine();
            }
            reader.close();
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }
}
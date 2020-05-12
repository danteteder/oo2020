import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class CharWords {

    public Character character;
    public ArrayList<String> words = new ArrayList<String>();
    public String outputFileName;


    public CharWords() {
    }

    public CharWords(Character character, ArrayList<String> words) {
        this.character = character;
        this.words = words;
    }

    public Character getCharacter() {
        return this.character;
    }


    public CharWords(Character character, ArrayList<String> words, String outputFileName) {
        this.character = character;
        this.words = words;
        this.outputFileName = outputFileName;
    }

    public String getOutputFileName() {
        return this.outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    public CharWords outputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }
    public void setCharacter(Character character) {
        this.character = character;
    }

    public ArrayList<String> getWords() {
        return this.words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public CharWords character(Character character) {
        this.character = character;
        return this;
    }

    public CharWords words(ArrayList<String> words) {
        this.words = words;
        return this;
    }

    //testisin randomUUID'd failinimede jaoks
    public void createOutputFile(){
        try {
            outputFileName = UUID.randomUUID().toString();
            File outputFile = new File("output/" + outputFileName + ".txt");
            if (outputFile.createNewFile()) {
                try {
                    FileWriter writer = new FileWriter("output/" + outputFileName + ".txt");
                    writer.write("Sõnad mis lõppevad tähega "+ character + ":\n");
                    for (int i = 0; i < words.size(); i++) {
                        writer.write(words.get(i)+"\n");
                    }
                    writer.close();
                  } catch (IOException e) {
                    e.printStackTrace();
                  }
            }
          } catch (IOException e) {
            e.printStackTrace();
          }
    }

}
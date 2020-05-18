
/**
 * TripsTrapsTrull
    * 1)Joonista sümbolite abil ekraanile trips-traps-trulli ruudustik
    * 2)Kasutaja teatab rea ja veeru. Vastavasse kohta märgitakse kordamööda x ja 0
    * 3)Kontrollitakse käikude õigsust, teatatakse mängu lõpust. 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TripsTrapsTrull {

    //resizable ArrayLists millesse saab addida asju v kontrollida 
    static ArrayList<Integer> player1Positions = new ArrayList<Integer>();
    static ArrayList<Integer> player2Positions = new ArrayList<Integer>();

    public static void main(String[] args){


        //loon 2d massiivi 5x5 (sest peab ruumi jätma for X ja O), private sest ma ei taha muuta seda vormi
        //miks "" ei toota ja '' tootab
        char[][] grid = {
            {' ', '|',' ', '|',' '},
            {'-','+','-','+','-'},
            {' ', '|',' ', '|',' '},
            {'-','+','-','+','-'},
            {' ', '|',' ', '|',' '}};
        
        //kutsume grid method/funktsiooni välja, et näidata kasutajale layouti
        printGrid(grid);
        
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter 2 coordinates to place X/O (00-44) ");
            int position = scan.nextInt();
            while(player1Positions.contains(player2Positions) || player2Positions.contains(player2Positions))
                System.out.println("Position taken");

            System.out.println(position);
            placeToGrid(grid, position, "player1");
            placeToGrid(grid, position, "player2");
    
            printGrid(grid);
    
            String gameResult = checkLine();
            System.out.println(gameResult);
        }
        

    }
        
        //tehtud method/funktsiooniks, et hiljem kutsuda kui user sisestanud X/O positsiooni, passime parameetriks enne tehtud grid
        //2x for-each loop et loopida kõikidest elementidest arrays läbi, seesmine loop prindib kõik characters, välimine per row

    public static void printGrid(char[][] grid) {
            for(char[] row : grid){
                for(char character : row){
                    System.out.print(character);
                }
                System.out.println();
            }
        }    
    public static void placeToGrid(char[][] grid, int position, String user){
        //muudame elementi boardist X-ks või O-ks
        //case int näitab mis positsioonile gridist paneme
        
        char userSymbol = ' ';

        if(user.equals("player1")){
            userSymbol = 'X';
            player1Positions.add(position);
        } else if(user.equals("player2")){
            userSymbol = 'O';
            player2Positions.add(position);
        }
        
        switch(position) {
            case 00: grid[0][0] = userSymbol;
            break;
            case 02: grid[0][2] = userSymbol;
            break;
            case 04: grid[0][4] = userSymbol;
            break;
            case 20: grid[2][0] = userSymbol;
            break;
            case 22: grid[2][2] = userSymbol;
            break;
            case 24: grid[2][4] = userSymbol;
            break;
            case 40: grid[4][0] = userSymbol;
            break;
            case 42: grid[4][2] = userSymbol;
            break;
            case 44: grid[4][4] = userSymbol;
            break;
            default:
        }
    }
    //kontrollin kes võitnud, arrays.aslist meetodiga, parameetrid on useri pandud positsioonid ehk O/X-id
    public static String checkLine() {
        List topRowLine = Arrays.asList(00,02,04);
        List middleRowLine = Arrays.asList(20,22,24);
        List bottomRowLine = Arrays.asList(40,42,44);

        List leftColumnLine = Arrays.asList(00,20,40);
        List middleColumnLine = Arrays.asList(02,22,42);
        List rightColumnLine = Arrays.asList(04,24,44);

        List lineAcross1 = Arrays.asList(00,22,44);
        List lineAcross2 = Arrays.asList(40,22,04);

        //emtpy arraylist luua et hiljem kontrollida lines
        List<List> winner = new ArrayList<List>();
        winner.add(topRowLine);
        winner.add(middleRowLine);
        winner.add(bottomRowLine);

        winner.add(leftColumnLine);
        winner.add(middleColumnLine);
        winner.add(rightColumnLine);

        winner.add(lineAcross1);
        winner.add(lineAcross2);

        //loopid läbi mängijate array'dest ja kontrollid kas nende sees on võitvad kombinatsioonid
        for(List winnerList : winner) {
            if(player1Positions.containsAll(winnerList)){
                return "Player1 has won!";
            } else if(player2Positions.contains(winnerList)){
                return "Player2 has won!";
            } else if(player1Positions.size() + player2Positions.size() == 9)
                return "yall tied :/";
            }
    
        return "";
    
    }
}

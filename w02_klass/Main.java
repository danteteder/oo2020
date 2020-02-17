/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) {
        Character dante = new Character("Dante", CharacterType.WIZARD);
        Armor equipment = new Armor("Armor of Steel", ArmorType.STEEL, DefenseLevel.MEDIUM) ;
        dante.slogan = "cool";
        dante.height = 180;
        
        System.out.println(dante);
        System.out.println(equipment);
    }
    
}
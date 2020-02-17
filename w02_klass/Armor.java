/**
 * Armor
 */
public class Armor {

    /**
     *
     */
    private final String ArmorName;
    private final ArmorType ArmorType;
    private final DefenseLevel defenseLvl;

    public Armor(final String ArmorName, final ArmorType ArmorType, final DefenseLevel defenseLevel) {
        this.ArmorName = ArmorName;
        this.ArmorType = ArmorType;
        this.defenseLvl = defenseLevel;
    }

    
   @Override
    public String toString(){
        return "My armor's name is " + ArmorName + " and type:" + ArmorType+ " and my defense level is: " + defenseLvl;
    }
}
/**
 * Character
 */
public class Character {

    private final int x;
    private final int y;

    String slogan = "ugh";
    int height = 180;

    private final String name;
    private final CharacterType characterType;
    private Direction direction;

    public Character(final String name, final CharacterType characterType) {
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;
    }

    @Override
    public String toString(){
        return "My name is " + name + " and I am at x:" + x + " y:" + y + " and my slogan is: " + slogan;
    }

}
public class Mace extends Weapon{
    public Mace(){
        super("Mace", "A Mace. Somewhat more dangerous than a sword.", 10, 30);
    }
    public Mace(String name, String properties, String description, int value, int damage) {
        super(name, description, value, damage);
        this.properties = properties;
    }
}

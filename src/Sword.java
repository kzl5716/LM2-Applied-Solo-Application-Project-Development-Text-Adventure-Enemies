public class Sword extends Weapon {
    public Sword(){
        super("Sword", "A rusted sword. Somewhat more dangerous than a dagger.", 15, 10);
    }
    public Sword(String name, String properties, String description, int value, int damage) {
        super(name, description, value, damage);
        this.properties = properties;
    }
}
public class Pillow extends Weapon{
    public Pillow(){
        super("Pillow", "A pillow stuffed with feathers.", 1, 1);
    }
    public Pillow(String name, String properties, String description, int value, int damage) {
        super(name, description, value, damage);
        this.properties = properties;
    }
}

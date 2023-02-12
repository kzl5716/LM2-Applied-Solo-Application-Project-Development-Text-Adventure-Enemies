public class Zombie extends Enemy{
    public Zombie(){
        super("Zombie", 20,15);
    }
    public Zombie(String name, String property, int hp, int damage) {
        super(name, hp, damage);
        this.property = property;
    }

}

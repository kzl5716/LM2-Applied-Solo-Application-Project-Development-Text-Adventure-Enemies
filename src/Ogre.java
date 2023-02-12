public class Ogre extends Enemy{
    public Ogre(){
        super("Ogre", 30,20);
    }
    public Ogre(String name, String property, int hp, int damage) {
        super(name, hp, damage);
        this.property = property;
    }
}

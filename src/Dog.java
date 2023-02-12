public class Dog extends Enemy{
    public Dog(){
        super("Dog", 20,15);
    }
    public Dog(String name, String property, int hp, int damage){
        super(name, hp, damage);
        this.property = property;
    }
}

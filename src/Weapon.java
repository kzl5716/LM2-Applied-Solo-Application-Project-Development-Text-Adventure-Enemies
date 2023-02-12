public class Weapon extends Item{
    public int damage;
    public String properties;
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon(String name, String description, int value, int damage){
        super(name, description, value);
        this.damage = damage;
    }

    public String str() {
        return String.format("{0} %s \n=====\n{1} %s\n{2} Value: %d\n{3} Damage: %d\n",
                this.name, this.description, this.value, this.damage);
    }
    public String strProperties() {
        return String.format("{0} %s \n=====\n{1} %s \n{2} %s\n{3} Value: %d\n{4} Damage: %d\n",
                this.name, this.properties, this.description, this.value, this.damage);
    }
}

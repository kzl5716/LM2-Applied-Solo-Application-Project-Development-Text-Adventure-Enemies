public class Enemy{
    protected String name;
    protected int hp;
    protected int damage;
    public String property;
    public Enemy(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    public boolean isAlive() {
        return (this.hp > 0);
    }
    public String strEnemy() {
        return String.format("%s \n=====\nHP: %s\nDamage: %d\n",
                this.name, this.hp, this.damage);
    }
    public String strEnemyWProp() {
        return String.format("%s \n=====\nProperty: %s\nHP: %s\nDamage: %d\n",
                this.name, this.property,this.hp, this.damage);
    }
}
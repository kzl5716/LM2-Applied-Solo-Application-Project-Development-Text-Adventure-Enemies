public class Main {
    public static void main(String[] args) {

        System.out.println("-Karol Lewkowicz \n-Class IST242 \n-101 \n-LM1 Text Adventure");

        System.out.println("+=+=+=+=+=+=+=+=+=+=+");

        System.out.println();

        Gold gold = new Gold(250);
        System.out.println(gold.toString());

        System.out.println();

        Sword sword = new Sword();
        System.out.println(sword.str());

        System.out.println();

        Pillow pillow = new Pillow();
        System.out.println(pillow.str());

        System.out.println();

        Mace mace = new Mace();
        System.out.println(mace.str());

        System.out.println();

        Arrow arrow = new Arrow();
        System.out.println(arrow.str());

        System.out.println("+=+=+=+=+=+=+=+=+=+=+");

        System.out.println();

        System.out.println("Four new objects:");

        System.out.println();

        GoldBar goldBar = new GoldBar(500);
        System.out.println(goldBar.toString());

        System.out.println();

        MagicSword sword1 = new MagicSword();
        System.out.println(sword1.strProperties());

        System.out.println();

        SoftPillow softPillow = new SoftPillow();
        System.out.println(softPillow.strProperties());

        System.out.println();

        BigMace bigMace = new BigMace();
        System.out.println(bigMace.strProperties());

        System.out.println("+=+=+=+=+=+=+=+=+=+=+");

        System.out.println();

        System.out.println("Enemies:");

        System.out.println();

        Ogre ogre = new Ogre();
        System.out.println(ogre.strEnemy());

        System.out.println();

        Zombie zombie = new Zombie();
        System.out.println(zombie.strEnemy());

        System.out.println();

        Dog dog = new Dog();
        System.out.println(dog.strEnemy());

        System.out.println();

        GiantSpider giantSpider = new GiantSpider();
        System.out.println(giantSpider.strEnemy());

        System.out.println();

        GreenOgre greenOgre = new GreenOgre();
        System.out.println(greenOgre.strEnemyWProp());

        System.out.println();

        RedOgre redOgre = new RedOgre();
        System.out.println(redOgre.strEnemyWProp());

        System.out.println();

        SlowZombie slowZombie = new SlowZombie();
        System.out.println(slowZombie.strEnemyWProp());

        System.out.println();

        FastZombie fastZombie = new FastZombie();
        System.out.println(fastZombie.strEnemyWProp());

        System.out.println();

        SpotDog spotDog = new SpotDog();
        System.out.println(spotDog.strEnemyWProp());

        System.out.println();

        Dragon dragon = new Dragon();
        System.out.println(dragon.strEnemy());
    }
}
public class GoldBar extends Gold {
    public static int amt;
    public GoldBar(int amt) {
        super("Gold Bar", String.format("A bar made out of gold with %s stamped on the top.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}

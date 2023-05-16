public class main {
    public static void main(String[] args){
    }

    public static int Hits(int attacks, double bs){
        double hitsD = attacks*bs;

        int hitsI = (int) Math.round(hitsD);

        return hitsI;
    }

    public static double towound(int strength, int toughness){
        double toWound = 0;

        if (strength > toughness){
            toWound=4/6;
        } else if (strength >2*toughness) {
            toWound = 5/6;
        } else if (strength == toughness) {
            toWound = 3/6;
        } else if (strength < toughness){
            toWound = 2/6;
        } else if (strength*2 < toughness) {
            toWound = 1/6;
        }
        return toWound;
    }
}
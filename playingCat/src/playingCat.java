public class playingCat {
    public static void main(String[] args) {
        isPlayingCat(false, 35);
    }

    public static boolean isPlayingCat(boolean summer, int temperature) {
        int max = summer ? 45 : 35 ;
        return temperature >= 25 && temperature <= max ;
    }
}
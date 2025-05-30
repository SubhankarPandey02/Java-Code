public class flourPack {
    public static void main(String[] args) {
        canPack(1,0,5);
        canPack (1, 0, 4);
        canPack (0, 5, 4);
        canPack (2, 2, 11);
    }

        public static boolean canPack(int bigCount, int smallCount, int goal){
            if (goal < 0) {
                return false;
            }
            for (int i = 0; i <= bigCount; i++) {
                for (int j = 0; j <= smallCount; j++) {
                    if (i*5 + j == goal) {
                        return true;
                    }
                }
            }
            return false;
        }
    }









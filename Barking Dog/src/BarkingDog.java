public class BarkingDog{
    public static void main(String[] args) {
    }
    public static boolean shouldWakeUp(boolean Barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (Barking && (hourOfDay <8) || (hourOfDay> 22)){
            return true;
        }else{
            return false;
        }
        }
}

public class Main {
    public static void main(String[] args) {

        ComputerCase theCase= new ComputerCase("2208","Dell","240");

        Monitor theMonitor= new Monitor("27Inc Beat","Acer",27,"2540 X 1440");

        Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,6,"V2.4");

        PersonalComputer thePC= new PersonalComputer("2208", "Dell",theMotherboard,theCase,theMonitor);

//        thePC.getMonitor().drawPixelAt(10,20,"red");
//
//        thePC.getMotherboard().loadProgram("Windows OS");

        thePC.powerUp();


    }
}

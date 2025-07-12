public class Product {
    private String Model;
    private String Manufacturer;
    private int length;
    private int width;
    private int depth;

    public Product(String model, String manufacturer) {
        Model = model;
        Manufacturer = manufacturer;
    }
}

//creating subclass which will extend my product superclass

class Monitor extends Product{

    private int size;

    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);//calling the constructor from Product class
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.printf("Drawing pixel at %d, %d In Color %s",x,y,color);
    }
}

class Motherboard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println(" Program " + programName + " is now loading...");
    }
}

class ComputerCase extends Product{

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){

        System.out.println("Power button pressed");
    }
}
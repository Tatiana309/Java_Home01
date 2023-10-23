package home08;

public class Bicycle extends Transport {
    private int numberOfWheels = 2;
    private String type = "Городской";
    public Bicycle(String number, int maxSpeed, int numberOfWheels){
        super(number,maxSpeed);
        this.numberOfWheels=numberOfWheels;
    }

    public Bicycle(String number, int numberOfWheels) {
        super(number);
        this.numberOfWheels = numberOfWheels;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    @Override
    public void breakDown() {
        this.incWear(10);
    }
}

package home08;

public class Car extends Transport {
    private String color = "белый";

    public Car(String number) {
        super(number, 240);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void repair() {
        if (wear > 0) wear--;
        else super.repair();
    }

    @Override
    public void breakDown() {
        this.incWear(5);
    }
}



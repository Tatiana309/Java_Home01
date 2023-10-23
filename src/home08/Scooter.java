package home08;

public class Scooter extends Bicycle {
    private boolean isElectric;

    public Scooter(String number, int maxSpeed, boolean isElectric) {
        super(number, maxSpeed);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public void repair() {
        if (isElectric) {
            if (wear >= 2) wear -= 2;
            else wear = 0;
        } else {
            if (wear >= 3) wear -= 3;
            else wear = 0;
        }
    }

    @Override
    public void breakDown() {
        this.incWear(3);
    }
}
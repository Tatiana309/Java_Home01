package home08;

public abstract class Transport {
    protected String number;
    protected int wear;
    protected int maxSpeed = 120;

    public Transport(String number) {

        this.number = number;
    }

    public Transport(String number, int maxSpeed) {
        this(number);
        this.maxSpeed = maxSpeed;
    }

    public String getNumber() {
        return number;
    }

    public int getWear() {
        return wear;
    }


    public void incWear(int value) {
        if (value < 0)
            return;
        wear += value;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void repair() {
        if (wear > 0) wear--;
    }
    public abstract void breakDown();


}

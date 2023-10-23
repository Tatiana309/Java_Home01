package home08;

public class Train extends Transport {
    private int carCount;
    private boolean isClimateControl;

    public Train(String number, int maxSpeed,
                 int carCount, boolean isClimateControl) {
        super(number, maxSpeed);
        this.carCount = carCount;
        this.isClimateControl = isClimateControl;
    }

    public void changeClimateControl(){
        isClimateControl = !isClimateControl;
    }

    public int getCarCount() {
        return carCount;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }

    // переопределение метода родителя
    // можно изменить только модификатор доступа на расширение
    @Override // аннотация времени компиляции сообщит об ошибке переопределения
    public void repair(){
        if (carCount < 7 && carCount > 0) {
            if (wear >= 2) wear -= 2;
        } else {
            // вызов метода родителя
            super.repair();

        }
    }

    @Override
    public void breakDown() {
        this.incWear(2);
        if (carCount > 0) carCount -= 1;
    }
}

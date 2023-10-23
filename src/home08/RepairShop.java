package home08;

public class RepairShop {
    private Transport[] transports = new Transport[4]; // null
    private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};


    public void addTransport(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                transports[i] = transport;
                break;
            }
        }
    }

    // изменить цвет
    // восстановить цвет (установить дефолтный)
    // Машина, Самокат
    // перекрашивать все транспортные средства,
    // у которых есть соответствующий функционал
    public void repairAll() {

        // [car, scooter, train, null]
        for (Transport transport : transports) {
                /* для вызова доступны только методы супертипа, т.е. Vehicle
                // но будет использована реализация конкретного подтипа
               // transport.repair();

                // оператор instanceof вернет true,
                // если экземпляр (слева) принадлежит указанному справа типу
            if (vehicle instanceof Train) {
                Train t = (Train) vehicle;
                t.changeClimateControl();
            }
                // проверка на принадлежность типу + приведение
                // аналогично предыдущей записи
            if (transport instanceof Train train) {
                train.changeClimateControl();
            }
            */
            for (int i = 0; i < transports.length; i++) {
                if (transports[i] instanceof Car) {
                    Car car = (Car) transports[i];
                    car.repair();
                    car.setColor(getRandomColor());
                } else if (transports[i] instanceof Scooter) {
                    Scooter scooter = (Scooter) transports[i];
                    scooter.repair();
                }
                transports[i] = null;
            }
        }
    }

    private String getRandomColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

}

package home07;

public class Cat {

    private String name;
    private double weight;
    private int victories;

    public Cat() {
        this.name = "Мурзик";
        this.weight = 1.0;
        this.victories = 0;
    }

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.victories = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length() >= 3) {
            this.name = name.trim();
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 1 && weight < 9) {
            this.weight = weight;
        }
    }

    public int getVictories() {
        return victories;
    }

    public boolean attack(Cat opponent) {
        if (opponent == null) {
            return true; // Нападающий кот побеждает, если противник отсутствует
        }

        if (this.weight > opponent.getWeight()) {
            this.victories++;
            return true;
        } else if (this.weight < opponent.getWeight()) {
            opponent.victories++;
            return false;
        } else {
            return false;
        }
    }
}


package Inheritance;

public class Doctor extends Worker{
    private double bonus;

    public Doctor(String name, String surname, double salary){
        super(name,surname,salary);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}


package Inheritance;

public class Nurse extends Worker{
    private int overtime;

    public Nurse(String name, String surname, double salary, int overtime){
        super(name,surname,salary);
        this.overtime += overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime += overtime;
    }
}

package task1.office;

public class Boss extends Person{
    public String getRespect() {
        return respect;
    }

    public void setRespect(String respect) {
        this.respect = respect;
    }

    private String respect;

    public Boss(String respect, String name, String surname, int age) {
        super(name, surname, age);
        this.respect = respect;
    }

    public Boss(String respect, String name, String surname) {
        super(name, surname);
        this.respect = respect;
    }

    public Boss(String respect, String name) {
        super(name);
        this.respect = respect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Boss boss = (Boss) o;

        return respect.equals(boss.getRespect());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + respect.hashCode();
        return result;
    }
}

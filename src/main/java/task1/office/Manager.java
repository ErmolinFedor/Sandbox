package task1.office;

public class Manager extends Person{
    private String level;
    public Manager() {}

    public Manager(String level, String name, String surname, int age) {
        super(name, surname, age);
        this.level = level;
    }

    public Manager(String level, String name, String surname) {
        super(name, surname);
        this.level = level;
    }

    public Manager(String level, String name) {
        super(name);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return level.equals(manager.getLevel());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + level.hashCode();
        return result;
    }
}

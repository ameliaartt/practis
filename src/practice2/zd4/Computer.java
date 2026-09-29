package practice2.zd4;

public class Computer {
    private String name;
    private int ram;

    public Computer(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public String getName() { return name; }
    public int getRam() { return ram; }

    @Override
    public String toString() {
        return "Computer{" + name + ", RAM=" + ram + "GB}";
    }
}

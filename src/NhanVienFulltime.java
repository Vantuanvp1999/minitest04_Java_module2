public class NhanVienFulltime extends NhanVien {
    private double salary, bonus,fined;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(double salary, double bonus, double fined) {
        this.salary = salary;
        this.bonus = bonus;
        this.fined = fined;
    }

    public NhanVienFulltime(String code, String name, int age, int telephone, String email, double salary, double bonus, double fined) {
        super(code, name, age, telephone, email);
        this.salary = salary;
        this.bonus = bonus;
        this.fined = fined;
    }

    public double getFined() {
        return fined;
    }

    public void setFined(double fined) {
        this.fined = fined;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getIncome() {
        return salary + bonus - fined;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", fined=" + fined +
                '}';
    }
}

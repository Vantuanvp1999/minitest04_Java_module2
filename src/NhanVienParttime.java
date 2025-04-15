public class NhanVienParttime extends NhanVien {
    private double hoursOfWork;

    public NhanVienParttime() {
    }

    public NhanVienParttime(double hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public NhanVienParttime(String code, String name, int age, int telephone, String email, double hoursOfWork) {
        super(code, name, age, telephone, email);
        this.hoursOfWork = hoursOfWork;
    }

    public double getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(double hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }
    public double getIncome() {
        return hoursOfWork*100000;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "hoursOfWork=" + hoursOfWork +
                '}';
    }
}

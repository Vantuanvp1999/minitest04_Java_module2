public abstract class NhanVien {
    private String code;
    private String name;
    private int age;
    private int telephone;
    private String email;

    public NhanVien() {
    }

    public NhanVien(String code, String name, int age, int telephone, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract double getIncome();

    @Override
    public String toString() {
        return "NhanVien{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }
}

import java.time.LocalDate;
import java.util.Date;

public class People {
    private String name;
    private String sex;
    private LocalDate dob;

    public People(){
    }
    public People(String name, String sex, LocalDate dob) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                '}';
    }
}

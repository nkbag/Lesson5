import java.util.Comparator;

public class Fio implements Comparator<Fio> {
    String family;
    String name;
    String patronymic;
    Integer age;

    public Fio(String family, String name, String patronymic, Integer age) {
        this.family = family;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
    }

    @Override
    public int compare(Fio o1, Fio o2) {
        return o1.age - o2.age;
    }
}
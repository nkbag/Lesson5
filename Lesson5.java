import java.util.*;

public class Lesson5 {
        public static void main(String[] args) {

                Map<Integer, Fio> map = new HashMap<>();
                LinkedHashMap<Integer, Fio> linkedMap = new LinkedHashMap<>();
                TreeMap<Integer, Fio> treeMap = new TreeMap<>();

                try (Scanner scannerFamily = new Scanner(System.in)) {
                        try (Scanner scannerName = new Scanner(System.in)) {
                                try (Scanner scannerPatr = new Scanner(System.in)) {
                                        try (Scanner scannerAge = new Scanner(System.in)) {
                                                try (Scanner scannerCount = new Scanner(System.in)) {
                                                        System.out.println("Какое количество человек будем вводить");
                                                        int count = scannerCount.nextInt();

                                                        System.out.println("Map");
                                                        long begin1 = System.currentTimeMillis();
                                                        for (int i = 1; i < count + 1; i++) {
                                                                System.out.println("Введите ФИО и возраст через Enter");
                                                                map.put(i, new Fio(scannerFamily.nextLine(),
                                                                                scannerName.nextLine(),
                                                                                scannerPatr.nextLine(),
                                                                                scannerAge.nextInt()));
                                                        }
                                                        map.forEach((k, v) -> System.out
                                                                        .println(k + " " + v.family + " " + v.name + " "
                                                                                        + v.patronymic + " " + v.age));
                                                        System.out.println(System.currentTimeMillis() - begin1
                                                                        + " - Время выполнения Map");
                                                        System.out.println();

                                                        System.out.println("LinkedMap");
                                                        long begin2 = System.currentTimeMillis();
                                                        for (int i = 1; i < count + 1; i++) {
                                                                System.out.println("Введите ФИО и возраст через Enter");
                                                                linkedMap.put(i, new Fio(scannerFamily.nextLine(),
                                                                                scannerName.nextLine(),
                                                                                scannerPatr.nextLine(),
                                                                                scannerAge.nextInt()));
                                                        }
                                                        linkedMap.forEach((k, v) -> System.out
                                                                        .println(k + " " + v.family + " " + v.name + " "
                                                                                        + v.patronymic + " " + v.age));
                                                        System.out.println(System.currentTimeMillis() - begin2
                                                                        + " - Время выполнения LinkedMap");
                                                        System.out.println();

                                                        System.out.println("TreeMap");
                                                        long begin3 = System.currentTimeMillis();
                                                        for (int i = 1; i < count + 1; i++) {
                                                                System.out.println("Введите ФИО и возраст через Enter");
                                                                treeMap.put(i, new Fio(scannerFamily.nextLine(),
                                                                                scannerName.nextLine(),
                                                                                scannerPatr.nextLine(),
                                                                                scannerAge.nextInt()));
                                                        }
                                                        treeMap.forEach((k, v) -> System.out
                                                                        .println(k + " " + v.family + " " + v.name + " "
                                                                                        + v.patronymic + " " + v.age));
                                                        System.out.println(System.currentTimeMillis() - begin3
                                                                        + " - Время выполнения TreeMap");
                                                }
                                        }
                                }
                        }
                }
                System.out.println();
        }

}
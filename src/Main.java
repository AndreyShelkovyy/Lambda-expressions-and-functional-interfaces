import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Андрей", "Рублев-Художник", 95));
        people.add(new Person("Сергей", "Радонежский", 105));
        people.add(new Person("Николай", "Чудотворец-Святой", 90));
        people.add(new Person("Серафим", "Соровский-Свято-Дивеево", 65));
        people.add(new Person("Георгий", "Победоносец-Свято-Полководец", 15));
        people.add(new Person("Матрона", "Московская-Святая", 10));

        people.sort((o1, o2) -> {
            String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            int sur1 = Math.min(surname1.length, 3);
            int sur2 = Math.min(surname2.length, 3);
            int surCompare = Integer.compare(sur2, sur1);
            if (surCompare == 0) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else {
                return surCompare;
            }
        });

        Predicate<Person> personPredicate = (s -> s.getAge() < 18);
        people.removeIf(personPredicate);

        System.out.println("Список по знатности:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println((i + 1) + ". " + people.get(i));
        }
    }
}

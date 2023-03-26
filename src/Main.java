import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Андрей", "Рублев-Художник", 95));
        people.add(new Person("Сергей", "Радонежский", 105));
        people.add(new Person("Николай", "Чудотворец-Святой", 90));
        people.add(new Person("Серафим", "Соровский-Свято-Дивеево", 65));

        Collections.sort(people, new PersonsSurnameLengthComparator(3));

        System.out.println("Список по знатности:"); //по количеству слов в фамилии
        for (int i = 0; i < people.size(); i++) {
            System.out.println((i + 1) + ". " + people.get(i));
        }
    }
}

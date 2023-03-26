public class Person implements Comparable<Person> {
    public String getSurname;
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.age); //сравнение по годам
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " лет.";
    }
}

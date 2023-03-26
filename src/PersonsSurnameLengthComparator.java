import java.util.Comparator;

public class PersonsSurnameLengthComparator implements Comparator<Person> {
    protected int numWordsCompare;

    public PersonsSurnameLengthComparator(int numWordsCompare) {
        this.numWordsCompare = numWordsCompare;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        int sur1 = Math.min(surname1.length, numWordsCompare);
        int sur2 = Math.min(surname2.length, numWordsCompare);
        int surCompare = Integer.compare(sur2, sur1);
        if (surCompare == 0) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return surCompare;
        }
    }
}

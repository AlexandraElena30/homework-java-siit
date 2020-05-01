package homework9;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        int ret;
        ret = a.getName().compareTo(b.getName());
        if (ret == 0)
            if (a.getAge() < b.getAge())
                ret = -1;
            else if (a.getAge() > b.getAge())
                ret = 1;
            else
                ret = 0;
        return ret;
    }
}

class NameComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}

class AgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getAge() - b.getAge();
    }
}


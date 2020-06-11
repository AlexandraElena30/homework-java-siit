package com.siit.homeworks.homework09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class homework9 {
    public static void main(String[] args) {

        //  Ex1
        //PersonComparator comp = new PersonComparator();
        NameComparator comp1 = new NameComparator();
        AgeComparator comp2 = new AgeComparator();
        TreeSet<Person> t = new TreeSet<Person>(comp1.thenComparing(comp2));
        t.add(new Person("Popa Ion", 40));
        t.add(new Person("Popa Ion", 23));
        t.add(new Person("Gheorghe Matei", 28));
        t.add(new Person("Ionescu Alina", 20));
        t.add(new Person("Grigore Ana", 20));
        t.add(new Person("Popa Ion", 40));

        Iterator it = t.iterator();
        System.out.println("Exercitiul 1:");
        Person temp;
        while (it.hasNext()) {
            temp = (Person) it.next();
            System.out.println(temp.getName() + " " + temp.getAge());
        }

        Address a1 = new Address("Romania", "Bucuresti", "Bd. Iuliu Maniu");
        Address a2 = new Address("Spania", "Barcelona", "Str. La Rambla");
        Address a3 = new Address("Anglia", "London", "Bd. Liberty");
        Address a4 = new Address("Austria", "Vienna", "Bd. Donnersbach");
        Address a5 = new Address("Japonia", "Tokyo", "Bd. Tohoku");
        Address a6 = new Address("Scotia", "Edinburgh", "Bd. Aviemore");
        //Address Lists
        ArrayList<Address> l1 = new ArrayList<Address>();
        l1.add(a1);
        l1.add(a2);
        ArrayList<Address> l2 = new ArrayList<Address>();
        l2.add(a1);
        l2.add(a4);
        l2.add(a6);
        ArrayList<Address> l3 = new ArrayList<Address>();
        l3.add(a5);

        //Hobby Lists
        ArrayList<Hobby> hobbylist1 = new ArrayList<Hobby>();
        hobbylist1.add(new Hobby("Football", 3, l1));

        ArrayList<Hobby> hobbylist2 = new ArrayList<Hobby>();
        hobbylist2.add(new Hobby("Football", 3, l1));
        hobbylist2.add(new Hobby("Baseball", 3, l2));
        hobbylist2.add(new Hobby("Tennis", 3, l3));

        ArrayList<Hobby> hobbylist3 = new ArrayList<Hobby>();
        hobbylist3.add(new Hobby("Surf", 3, l3));
        hobbylist3.add(new Hobby("Dance", 3, l2));
        hobbylist3.add(new Hobby("Tennis", 3, l2));

        //HashMap
        HashMap<Person, List<Hobby>> map = new HashMap<Person, List<Hobby>>();
        map.put(new Person("Popa Ion", 40), hobbylist1);
        //Same name, different age
        map.put(new Person("Popa Ion", 20), hobbylist1);
        //Same name, same age -> change value for key "Popa Ion",20
        map.put(new Person("Popa Ion", 20), hobbylist3);

        map.put(new Person("Gheorghe Mihai", 32), hobbylist2);
        map.put(new Person("Alexandrescu Adina", 22), hobbylist1);


        //Printing
        System.out.println("\nExercitiul 2:");

        Iterator mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) mapIterator.next();
            System.out.println(((Person) mapElement.getKey()).getName() + "," + ((Person) mapElement.getKey()).getAge() + " has the following hobbies: ");
            Iterator<Hobby> hobbyIterator = ((List<Hobby>) mapElement.getValue()).iterator();
            while (hobbyIterator.hasNext()) {
                Hobby tempHobby;
                tempHobby = hobbyIterator.next();
                System.out.print(tempHobby.getHobbyName() + " can be practiced in: ");
                Iterator<Address> addressIterator = tempHobby.getAddressList().iterator();
                while (addressIterator.hasNext()) {
                    System.out.print(addressIterator.next().getCountry() + " ");
                }
                System.out.println();

            }
            System.out.println();
        }

    }
}

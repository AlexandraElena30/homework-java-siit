package homework9;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int hashCode() {

        return this.name.hashCode();

    }


    @Override
    public boolean equals(Object obj) {


        if (this.name.equals(((Person) obj).getName()) && this.age == ((Person) obj).getAge()) {

            return true;
        }

        return false;
    }

}

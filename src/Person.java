import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
        this.address = null;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = null;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (this.age != -1) return true;
        else return false;
    }

    public boolean hasAddress() {
        if (this.address != null) return true;
        else return false;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        if (this.hasAge()) {
            return OptionalInt.of(this.age);
        } else {
            return OptionalInt.empty();
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (this.hasAge()) {
            this.age = this.age + 1;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " (age: " + this.age + ", address: " + this.address + ")";
    }


    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setAge(0);
        personBuilder.setSurname(this.surname);
        personBuilder.setAddress(this.address);
        return personBuilder;
    }
}

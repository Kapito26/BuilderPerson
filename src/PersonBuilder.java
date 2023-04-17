public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
        this.name = null;
        this.surname = null;
        this.age = 0;
        this.address = null;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.age < 0 | this.age > 200) {
            throw new IllegalStateException("Некорректно введен возраст");
        }
        if (this.name == null | this.surname == null) {
            throw new IllegalStateException("Не заполнены обязательные поля");
        }

        return new Person(this.name, this.surname, this.age, this.address);
    }
}
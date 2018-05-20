package Curs20May_Algorithm;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        Person[] persons = new Person[20];

        Person person1 = new Person();
        person1.setName("Bogdan");
        person1.setPhoneNumber("0740123456");

        Person person2 = new Person();
        person2.setName("Mircea");
        person2.setPhoneNumber("0740123456");

        Person person3 = new Person();
        person3.setName("Tibi");
        person3.setPhoneNumber("0740123456");

        persons[1] = person1;
        persons[2] = person2;
        persons[3] = person3;

        phoneBook.addPerson(persons);

        getPhoneNumberByName("Bogdan", phoneBook);

    }

    public static void getPhoneNumberByName(String name, PhoneBook phoneBook) {
        for (int i = 1; i < 20; ++i) {
            Person person = phoneBook.getPersons()[i];

            if (person != null && person.getName().equals(name)) {
                System.out.println(person.getPhoneNumber());
            }
        }

    }
}

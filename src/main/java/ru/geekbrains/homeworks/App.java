package ru.geekbrains.homeworks;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Person(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                30000.0, 32);
        people[1] = new Person(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                30000.0, 69);
        people[2] = new Person(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                30000.0, 55);
        people[3] = new Person(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                30000.0, 45);
        people[4] = new Person(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                "892312312",
                30000.0, 35);

        for (Person person : people) {
            if (person.getAge() > 40)
                System.out.println(person);
        }
    }
}

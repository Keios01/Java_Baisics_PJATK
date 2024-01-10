package Zad2;

public class Main {
    public static void main(String[] args)
    {
        Person person1 = new Person("Jan");
        Person person2 = new Person("Adam", 1995);
        Person person3 = new Person("Karolina");
        Person person4 = new Person("Agnieszka", 1985);

        Person[] array = {person1, person2, person3, person4};

        System.out.println(
                "Jan i Adam\nStarsza osoba: " +
                        Person.getOlder(array[0], array[1]).getName() +
                        " " +
                        Person.getOlder(array[0], array[1]).getAge()
        );

        System.out.println(
                "Karolina i Agnieszka\nStarsza osoba: " +
                        Person.getOlder(array[2], array[3]).getName() +
                        " " +
                        Person.getOlder(array[2], array[3]).getAge()
        );

        System.out.println(
                "Najstarsza osoba: " +
                        Person.getOldest(array).getName() +
                " " +
                Person.getOldest(array).getAge()
        );

        // Sortowanie tablicy od najstarszej do najmłodszej
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if (array[i].getAge() < array[j].getAge())
                {
                    Person temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (Person person : array) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}

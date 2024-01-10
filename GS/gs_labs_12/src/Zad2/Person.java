package Zad2;

public class Person {
    private String name;
    private int birthYear;

    Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    Person(String name)
    {
        this(name, 1990);
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        int currentYear = 2023;
        return currentYear - this.birthYear;
    }

    public static Person getOlder(Person person1, Person person2)
    {
        if(person1.getAge() > person2.getAge())
            return person1;
        else
            return person2;
    }

    public static Person getOldest(Person[] array)
    {
        int oldest = 0;
        for(int i = 1; i < array.length; i++)
        {
            if(array[i].getAge() > array[oldest].getAge())
            {
                oldest = i;
            }
        }

        return array[oldest];
    }
}

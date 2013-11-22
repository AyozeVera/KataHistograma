package katahistograma;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PersonLoader loader = createPersonLoader();
        
    }

    private static PersonLoader createPersonLoader() {
        return new PersonLoader() {

            @Override
            public Person[] load() {
                ArrayList<Person> list = new ArrayList<>();
                list.add(new Person("Luis", new Email("luis@gmail.com"), Sex.MALE));
                list.add(new Person("Alba", new Email("alba@yahoo.fr"), Sex.FEMALE));
                list.add(new Person("Tony", new Email("tony@gmail.com"), Sex.MALE));
                list.add(new Person("Jackie", new Email("jackie@gmail.com"), Sex.FEMALE));
                list.add(new Person("John", new Email("jfk@gmail.com"), Sex.MALE));
                return list.toArray(new Person[list.size()]);
                
            }
        };
    }
}


public class Main {
    public static void main(String[] args) {

        // if we want to create a with only his name and age we must  create a specific constructor
        // same if we want a student with only email and phone
        // and if we want a student with mail and age we must create another constructor but that wont be posssible
        // as we already have a constructor with name and age that take a string and int as param.
        // so be able to build a student with as many param as we want we use the builder pattern
        // so we dont have to make every constructor possible and just use the different methodes of the builder


        // using of the builder pattern
        Student student = new Student.StudentBuilder()
                .setName("John")
                .setAge(20)
                .setEmail("john@harvard.com")
                .setPhone("1234567890")
                .build();

        System.out.println(student);

    }
}

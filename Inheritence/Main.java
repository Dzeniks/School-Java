public class Main {
    
    public static void main(String[] args){

        Person person = new Person("John", "Smith", "040909/8063");
        Person person2 = new Person("Jack", "Ok", "031111/8063");

        Teacher teacher1 = new Teacher("Teacher", "Ok", "031111/8063", 12_500);

        teacher1.NewSubject("MATH");

        Person[] people = {person, person2, teacher1};

        

        showListOf(people);
    }

    public static void showListOf(Person[] people){
        for (Person person : people) {
            System.out.print(person);
            System.out.print(person.getAge(2023));
            System.out.println();

        }
    }
}

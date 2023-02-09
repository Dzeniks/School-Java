import java.util.ArrayList;

public class Teacher extends Person{
    
    protected int salary;
    protected ArrayList subjects = new ArrayList<String>();
            
    public Teacher(String first_name, String last_name, String reg_num, int salary) {
        super(first_name, last_name, reg_num);
        this.salary = salary;
    }

    public void NewSubject(String newSubject){
        subjects.add(newSubject);
    }

}

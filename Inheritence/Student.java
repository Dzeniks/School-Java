import java.util.ArrayList;

public class Student extends Person {
    
        protected ArrayList marks = new ArrayList<Integer>();
        protected String StudyField;
    
    public Student(String first_name, String last_name, String reg_num, String stuString) {
        super(first_name, last_name, reg_num);
        this.StudyField = stuString;
    }

    public void NewMark(int newMark){
        marks.add(newMark);
    }

}

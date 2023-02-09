public class Person{

    protected String first_name, last_name,reg_num;


    public Person(String first_name, String last_name, String reg_num) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.reg_num = reg_num;
        
    }

    public int getAge(int actual_year){
        String[] regnum = this.reg_num.split("/");
        int year = Integer.parseInt((String) regnum[0].subSequence(0, 2));
        return actual_year - (year > actual_year%100 ? 1900+year : 2000+year);
    }

    @Override
    public String toString() {
        return "Person [first_name=" + first_name + ", last_name=" + last_name + ", reg_num=" + reg_num + "]";
    }
}
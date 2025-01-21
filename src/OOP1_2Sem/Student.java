package OOP1_2Sem;

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public Student (String id, String firstname, String lastname, int age){

        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }



public Student(){

}
    public String getId () {
        return this.id;
    }
    public String getFirstName () {
        return this.firstName;
    }
    public String getLastName () {
        return this.lastName;
    }
    public int getAge () {
        return this.age;
    }




    public void setId(String id){
        this.id=id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }

}

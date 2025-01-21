package OOP1_2Sem;

public class ExploreObjects {

    public static void main(String[]args){
        Student s1 = new Student();
        s1.setFirstName("John");
        s1.setLastName("Miller");
        s1.setAge(23);
        s1.setId("100968804");

        System.out.println("firstname of the student is : "+ s1.getFirstName());
        System.out.println("lastname of the student is : "+ s1.getLastName());
        System.out.println("ID of the student is : "+ s1.getId());
        System.out.println("Age of the student is : "+ s1.getAge());




    }
}

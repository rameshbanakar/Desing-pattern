package Builders;

public class Client {
    public static void main(String[] args) {
        Student s1=Student.getHelper().setName("Ramesh").setPassout(2025).setAge(26).build();
        System.out.println(s1.getClass());
    }
}

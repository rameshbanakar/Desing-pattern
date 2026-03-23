package Builders;

import java.time.Year;

public class Student {
    private int id;
    private String name;
    private int age;
    private int psp;
    private int passout;
    private String university;

    private Student(Builder builder) {
        this.age=builder.age;
        this.name=builder.name;
        this.passout= builder.passout;
        this.psp=builder.psp;
        this.university=builder.university;
        this.id= builder.id;
    }

    public int getPsp() {
        return psp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPassout() {
        return passout;
    }

    public String getUniversity() {
        return university;
    }

    public static Builder getHelper(){
        return new Builder();
    }

    static class Builder{
        private int id;
        private String name;
        private int age;
        private int psp;
        private int passout;
        private String university;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;

        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setPassout(int passout) {
            this.passout = passout;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student build(){
            if(this.name==null){
                throw new Error("Name should not be Null");
            }
//            System.out.println(Year.now().getValue());
            if(this.passout==0 || this.passout>Year.now().getValue()){
                throw new Error("Invalid passout year");
            }
            if(this.age==0){
                throw new Error("Invalid age");
            }
            return new Student(this);
        }
    }
}
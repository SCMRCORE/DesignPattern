package Builder;

import java.util.Arrays;
import java.util.List;

public class Student {
    int id;
    int age;
    int grade;
    String name;
    String college;
    String profession;
    List<String> awards;

    //不对外开放，通过建造者来创建
    private Student(int id, int age, int grade, String name, String college, String profession, List<String> awards){
        this.id=id;
        this.age=age;
        this.name=name;
        this.college=college;
        this.profession=profession;
        this.awards=awards;
    }

    //提供builder的方法
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    //定义builder内部类
    public static class StudentBuilder{
        int id;
        int age;
        int grade;
        String name;
        String college;
        String profession;
        List<String> awards;

        public StudentBuilder id(int id){
            this.id=id;
            return this;
        }
        public StudentBuilder age(int age){
            this.age=age;
            return this;
        }
        public StudentBuilder grade(int grade){
            this.grade=grade;
            return this;
        }
        public StudentBuilder name(String name){
            this.name=name;
            return this;
        }
        public StudentBuilder college(String college){
            this.college=college;
            return this;
        }
        public StudentBuilder profession(String profession){
            this.profession=profession;
            return this;
        }
        public StudentBuilder awards(String... awards){
            this.awards= Arrays.asList(awards);
            return this;
        }

        public Student build(){
            return new Student(id, age, grade, name, college, profession, awards);
        }
    }

}

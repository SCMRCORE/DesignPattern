package Builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(1)
                .age(10)
                .name("付泽东")
                .grade(3)
                .awards("蓝桥国赛","睿抗国赛","ICPC")
                .college("SWPU")
                .build();
    }
}

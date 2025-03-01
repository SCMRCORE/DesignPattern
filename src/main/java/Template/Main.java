package Template;

import Builder.Student;

public class Main {
    public static void main(String[] args) {
        AbstractDiagnosis abstractDiagnosis = new ClodDiagnosis();
        abstractDiagnosis.test();
    }
}

package ResponsibilityChain;

import Builder.Student;

public class Main {
    public static void main(String[] args) {
        Handler handler = new FirstHandler();
        handler.connect(new SecondHandler())
                .connect(new ThirdHandler());
        handler.handle();
    }
}

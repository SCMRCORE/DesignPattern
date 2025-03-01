package Combination;

import Builder.Student;

public class Main {
    public static void main(String[] args) {
        Directory outer = new Directory();//外目录
        Directory inner = new Directory();//内目录
        outer.addComponent(inner);
        outer.addComponent(new File());//在内层目录和外层目录都添加点文件，注意别导错包了
        inner.addComponent(new File());
        inner.addComponent(new File());
        outer.test();
    }
}

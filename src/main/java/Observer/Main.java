package Observer;

import Iterator.ArrayCollection;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Subject subject = new Subject();
        //观察者将自己注册到主题
        subject.observer(()->System.out.println("我是1号"));
        subject.observer(()->System.out.println("我是2号"));
        subject.observer(()->System.out.println("我是3号"));
        //模拟主题发生改变
        subject.modify();

        SubjectJDK subjectJDK = new SubjectJDK();
        subjectJDK.addObserver((o, arg)->System.out.println("监听到变化，得到参数"+arg));
        subjectJDK.modify();
    }

}


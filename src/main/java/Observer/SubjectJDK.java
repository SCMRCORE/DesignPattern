package Observer;

import java.util.Date;
import java.util.Observable;

public class SubjectJDK extends Observable {
    public void modify(){
        System.out.println("对对象进行修改");
        this.setChanged();//设定状态为已修改
        this.notifyObservers(new Date());//使用notifyObservers方法来通知所有的观察者
    }
}

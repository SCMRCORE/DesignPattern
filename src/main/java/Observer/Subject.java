package Observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    private final Set<Observer> observerSet = new HashSet<>();

    public void observer(Observer observer){
        observerSet.add(observer);
    }

    public void modify(){
        //告知观察者，执行观察者的方法
        observerSet.forEach(Observer::update);
    }
}

package Combination;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component{
    List<Component> child = new ArrayList<>();//存放子组件

    @Override
    public void addComponent(Component component) {
        child.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        child.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return child.get(index);
    }

    @Override
    public void test() {
        child.forEach(Component::test);//Component::test方法引用指向Component类中的test方法
    }
}

package Combination;

public abstract class Component {
    public abstract void addComponent(Component component);
    public abstract void removeComponent(Component component);
    public abstract Component getChild(int index);
    public abstract void test();
}

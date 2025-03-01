package Bridge;

public abstract class AbstractTea {

    protected Size size;//AbstractTea只负责getType功能，而Size则需要桥接

    public AbstractTea(Size size){
        this.size=size;
    }

    public abstract String getType();
}

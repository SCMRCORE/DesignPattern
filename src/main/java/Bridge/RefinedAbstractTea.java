package Bridge;

public abstract class RefinedAbstractTea extends AbstractTea{
    public RefinedAbstractTea(Size size){
        super(size);
    }

    public String getSize() {//AbstractTea只能有getType的职责，子抽象类则可以拓展一个Size职责
        return size.getSize();
    }
}

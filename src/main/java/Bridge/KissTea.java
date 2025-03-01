package Bridge;

public class KissTea extends RefinedAbstractTea{
    public KissTea(Size size){
        super(size);
    }

    @Override
    public String getType() {//再去实现最初的AbstractTea的职责
        return "芋圆啵啵奶茶";
    }
}

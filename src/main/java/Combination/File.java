package Combination;

public class File extends Component{
    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();   //不支持这些操作了
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();   //不支持这些操作了
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();   //不支持这些操作了
    }

    @Override
    public void test() {
        System.out.println("文件名修改成功！"+this);
    }
}

package ResponsibilityChain;

import java.util.Optional;

public abstract class Handler {
    protected Handler successor;//单链表，其实该命名为nextHandler可能更合理

    public Handler connect(Handler successor){
        this.successor=successor;//拼接后续节点
        return successor;//返回后继节点，方便一会儿链式调用
    }

    //这个写的很妙，通过封装这个方法，实现了调用子节点和查看是否有继任节点
    public void handle(){
        this.doHandle();//交给子类实现的方法
        Optional.ofNullable(successor)
                .ifPresent(Handler::handle);//责任链上如果还有后继节点，就继续向下传递
    }

    public abstract void doHandle();
}

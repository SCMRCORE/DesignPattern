package Iterator;

import ResponsibilityChain.Handler;

import java.util.Iterator;

public class ArrayCollection<T> implements Iterable<T> {
    private final T[] array;
    private ArrayCollection(T[] array){
        this.array=array;
    }
    public static <T> ArrayCollection<T> of(T[] array){//构造方法private，不允许new，而是通过of方法
        return new ArrayCollection<>(array);
    }

//给我们的集合类实现迭代器

    //获取迭代器
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    //创建内部类
    public class ArrayIterator implements Iterator<T> {
        private int cur=0;
        @Override
        public boolean hasNext() {
            return cur<array.length;
        }

        @Override
        public T next() {
            return array[cur++];
        }
    }
}

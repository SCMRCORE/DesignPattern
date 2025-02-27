package Prototyoe;

import java.io.ObjectStreamException;

public class MyClass implements Cloneable{
    private String field1;
    private NestedClass nestedObject;

    public MyClass(NestedClass nestedClass){
        this.nestedObject=nestedClass;
    }

    public NestedClass getNestedObject(){
        return nestedObject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MyClass clonedObject = (MyClass) super.clone();
        clonedObject.nestedObject=(NestedClass) nestedObject.clone();
        return clonedObject;
    }
}

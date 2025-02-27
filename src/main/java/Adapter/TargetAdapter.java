package Adapter;

//public class TargetAdapter extends TestSupplier implements TargetTest{
//    @Override
//    public String supply() {
//        return super.doSupply();
//    }
//}

public class TargetAdapter implements TargetTest{
    TestSupplier testSupplier;

    public TargetAdapter(TestSupplier testSupplier){
        this.testSupplier=testSupplier;
    }

    @Override
    public String supply() {
        return testSupplier.doSupply();
    }
}
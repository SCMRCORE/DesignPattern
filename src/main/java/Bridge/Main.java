package Bridge;

import Adapter.TargetAdapter;
import Adapter.TargetTest;
import Adapter.TestSupplier;

public class Main {
    public static void main(String[] args) {
        KissTea tea = new KissTea(new Large());
        System.out.println(tea.getType());
        System.out.println(tea.getSize());
    }

}

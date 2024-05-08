package predefined.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {

  public static void main(String[] args) {
    Supplier<String> supplier = () -> "Output from Supplier";
    System.out.println(supplier.get());

    // filter in streams uses Supplier
    List<String> stringList = Arrays.asList();
    System.out.println(stringList.stream().findAny().orElseGet(supplier));

    // refactoring above code
    List<String> stringList2 = Arrays.asList();
    System.out.println(stringList2.stream().findAny().orElseGet( () -> "Output from SupplierLambda"));
  }
}

package java10;

import java.util.Optional;

public class OptionalOrElseThrow {

    public static void main(String[] args) {

        var greet = "Hello";
        var optionalGreet = Optional.ofNullable(greet);
        var valueFromOptional = optionalGreet.orElseThrow();
        System.out.println(valueFromOptional);

        String greetNull = null;
        var optionalNullGreet = Optional.ofNullable(greetNull);
        var valueFromNullOptional = optionalNullGreet.orElseThrow(NullPointerException::new);
        System.out.println(valueFromNullOptional);


    }
}

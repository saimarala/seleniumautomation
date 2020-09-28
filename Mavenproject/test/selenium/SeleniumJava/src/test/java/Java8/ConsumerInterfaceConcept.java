package Java8;

import org.testng.annotations.Test;

import java.util.function.Consumer;

public class ConsumerInterfaceConcept {
    @Test
    void ConsumerTest(){

        Consumer<String>func=s -> System.out.println(s);
        func.accept("Java testing");

    }
}

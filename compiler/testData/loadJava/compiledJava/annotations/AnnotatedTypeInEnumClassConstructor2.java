// SKIP_IN_RUNTIME_TEST
package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class AnnotatedTypeInEnumClassConstructor2 {

    @Target({ElementType.TYPE_USE, ElementType.PARAMETER})
    public @interface Anno {
        String value();
    }

    class JavaEnum {
        JavaEnum(@Anno("a") String a , @Anno("b")  String b) {}
    }
}
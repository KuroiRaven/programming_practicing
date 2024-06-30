package utils;
import org.assertj.core.api.AbstractAssert;

public class ClassAssert extends AbstractAssert<ClassAssert, Class<?>> {

    public ClassAssert(Class<?> actual) {
        super(actual, ClassAssert.class);
    }

    public static ClassAssert assertThat(Class<?> actual) {
        return new ClassAssert(actual);
    }

    public ClassAssert isAbstract() {
        isNotNull();

        if (!java.lang.reflect.Modifier.isAbstract(actual.getModifiers())) {
            failWithMessage("Expected class to be abstract, but it was not.");
        }

        return this;
    }
}
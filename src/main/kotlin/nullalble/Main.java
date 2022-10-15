package nullalble;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Main {
    public static void main(String[] args) {

    }

    public boolean startsWithA1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null");
        }
        return str.startsWith("A");
    }

    public Boolean startsWithA2(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("A");
    }

    public boolean startsWithA3(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("A");
    }
}
class Person{
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @NotNull
    public String getName() {
        return name;
    }
}

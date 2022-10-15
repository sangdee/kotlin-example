package operator;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney>{
    long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    public JavaMoney plus(JavaMoney other) {
        return new JavaMoney(amount + other.amount);
    }

    @Override
    public String toString() {
        return "JavaMoney{" +
               "amount=" + amount +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JavaMoney javaMoney = (JavaMoney)o;
        return amount == javaMoney.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount,o.amount);
    }
}

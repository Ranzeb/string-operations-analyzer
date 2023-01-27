import java.util.Objects;

public class Digit extends Tree{

    private int value;

    public Digit(int value) {
        this.value = value;
    }

    public boolean equals(Object tree) {

        if (tree == null) return false;

        if(!(tree instanceof Digit)) return false;

        Digit newDigit = (Digit) tree;

        return this.value == newDigit.getValue();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

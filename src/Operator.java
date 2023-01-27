import java.util.Objects;

public class Operator extends Tree {

    private char currValue;
    private Tree leftChild;
    private Tree rightChild;


    public Operator(char value) {
        this.currValue = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Operator(char value, Tree leftChild, Tree rightChild) {
        this.currValue = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public boolean equals(Object tree) {

        if (tree == null) return false;

        if(!(tree instanceof Operator)) return false;

        Operator newOp = (Operator) tree;

        boolean currValueEquals = this.currValue == newOp.getCurrValue();

        boolean leftSubTreeEquals = Objects.equals(this.leftChild, newOp.leftChild);

        boolean rightSubTreeEquals = Objects.equals(this.rightChild, newOp.rightChild);

        return currValueEquals && leftSubTreeEquals && rightSubTreeEquals;
    }

    public Tree getLeftChild() {
        return this.leftChild;
    }

    public Tree getRightChild() {
        return this.rightChild;
    }

    public char getCurrValue() { return this.currValue; }

    public void addLeft(Tree tree) { this.leftChild = tree; }

    public void addRight(Tree tree) {
        this.rightChild = tree;
    }

    public void setCurrValue(char value) { this.currValue = value; }
}

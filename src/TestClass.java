
public class TestClass {

    public int currIdx;

    public TestClass(int idx) {
        this.currIdx = idx;
    }

    public Tree generate(String mathExpression) {

        Operator tree;

        char currValue = mathExpression.charAt(currIdx);

        if(currValue == '[') {
            currIdx++;
            tree = new Operator(mathExpression.charAt(currIdx));
            currIdx+=2;
        } else {
            Digit digit = new Digit(currValue);
            currIdx+=2;
            return digit;
        }

        tree.addLeft(generate(mathExpression));
        tree.addRight(generate(mathExpression));
        currIdx++;

        return tree;
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    @Test
    void simpleCase() {
        Operator testTree = new Operator('*', new Digit('3'), new Digit('4'));
        TestClass testClass = new TestClass(0);
        assertEquals(testClass.generate("[*,3,4]"), testTree);
    }


    @Test
    void complexCase() {
        Operator complexSubTree = new Operator('+', new Operator('+', new Digit('5'), new Digit('4')), new Operator('9'));

        TestClass testClass = new TestClass(0);
        Tree debugTree = testClass.generate("[+,[+,5,4],9]");

        assertEquals(debugTree, complexSubTree);
    }

    @Test
    void singleDigitCase() {
        Digit tree = new Digit('9');
        TestClass testClass = new TestClass(0);
        Tree debugTree = testClass.generate("9");
        assertEquals(debugTree, tree);
    }
}
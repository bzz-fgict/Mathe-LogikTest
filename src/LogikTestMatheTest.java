import static org.junit.Assert.*;

public class LogikTestMatheTest {

    LogikTestMathe testObjekt;
    @org.junit.Before
    public void setUp() throws Exception {
        testObjekt = new LogikTestMathe();
    }

    // 16 Testfälle für die Bitmuster 0000....1111
    // 0
    public void testfall_0000(){
        testObjekt.setA(false);
        testObjekt.setB(false);
        testObjekt.setC(false);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 1
    public void testfall_0001(){
        testObjekt.setA(false);
        testObjekt.setB(false);
        testObjekt.setC(false);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 2
    public void testfall_0010(){
        testObjekt.setA(false);
        testObjekt.setB(false);
        testObjekt.setC(true);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 3
    public void testfall_0011(){
        testObjekt.setA(false);
        testObjekt.setB(false);
        testObjekt.setC(true);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 4
    public void testfall_0100(){
        testObjekt.setA(false);
        testObjekt.setB(true);
        testObjekt.setC(false);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 5
    public void testfall_0101(){
        testObjekt.setA(false);
        testObjekt.setB(true);
        testObjekt.setC(false);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 6
    public void testfall_0110(){
        testObjekt.setA(false);
        testObjekt.setB(true);
        testObjekt.setC(true);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 7
    public void testfall_0111(){
        testObjekt.setA(false);
        testObjekt.setB(true);
        testObjekt.setC(true);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 8
    public void testfall_1000(){
        testObjekt.setA(true);
        testObjekt.setB(false);
        testObjekt.setC(false);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 9
    public void testfall_1001(){
        testObjekt.setA(true);
        testObjekt.setB(false);
        testObjekt.setC(false);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 10
    public void testfall_1010(){
        testObjekt.setA(true);
        testObjekt.setB(false);
        testObjekt.setC(true);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 11
    public void testfall_1011(){
        testObjekt.setA(true);
        testObjekt.setB(false);
        testObjekt.setC(true);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 12
    public void testfall_1100(){
        testObjekt.setA(true);
        testObjekt.setB(true);
        testObjekt.setC(false);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 13
    public void testfall_1101(){
        testObjekt.setA(true);
        testObjekt.setB(true);
        testObjekt.setC(false);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 14
    public void testfall_1110(){
        testObjekt.setA(true);
        testObjekt.setB(true);
        testObjekt.setC(true);
        testObjekt.setD(false);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }

    // 15
    public void testfall_1111(){
        testObjekt.setA(true);
        testObjekt.setB(true);
        testObjekt.setC(true);
        testObjekt.setD(true);
        //
        assertTrue(testObjekt.executeLogicExpression());
    }
}
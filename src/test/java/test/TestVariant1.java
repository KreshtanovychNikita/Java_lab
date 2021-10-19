package test;

import static org.testng.Assert.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import lab0.Variant1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 *
 */
public class TestVariant1 {
    ////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void integerNumbersTask(int n1, int n2 , int n3 ) {assertEquals (new Variant1().integerNumbersTask(n1, n2), n3);

    }
    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 1024, 1024, 1 }, {5096, 1024, 4 }, { 2048, 1024, 2 } };
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeIntegerProvider")
    public void negativeIntegerTest(int n1, int n2) {
        new Variant1().integerNumbersTask(n1, n2);
    }

    @DataProvider
    public Object[][] negativeIntegerProvider() {
        return new Object[][] { {1025, 1024, 6}, {1589,1024, 13}, {2856,1024, 1}};
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1,int p4) {
        assertEquals(new Variant1().ifTask(p1), p4);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 5,6 }, {0,10 }, { -2,-4 } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1,boolean p3) {
        assertEquals(new Variant1().booleanTask(p1), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { {3, false }, { 4, true }, { 5, false } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1 , String res) {
        assertEquals(new Variant1().switchTest (p1) , res );
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 2, "зима" }, { 6, "лето" }, {9, "осень"} };
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "switchNegativeTestProvider")
    public void switchNegativeTest(int p1 , String p3) {
        assertEquals(new Variant1().switchTest(p1),p3);
    }

    @DataProvider
    public Object[][] switchNegativeTestProvider(){
        return new Object[][] { {0}, {-5}, {13}};
    }

    ///////////////////////////////////////////////////



///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int a, int b, String rez) {
        assertEquals(new Variant1().forTask(a , b), rez);

    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { { 4, 8, "567"}
                //{ 8, 15 , "91011121314" },
                //{-1, 4, "0123"}
                 };
    }


    @Test(expectedExceptions = AssertionError.class, dataProvider = "forNegativeTestProvider")
    public void forNegativeTest(int p1) {

        //new Variant1().forTask(p1);
    }

    @DataProvider
    public Object[][] forNegativeTestProvider(){
        return new Object[][] {{0}, {-1}, {-10}};
    }

    ///////////////////////////////////////////////////


    @Test(dataProvider = "whileProvider")
    public void whileTest(int n, int k, int[] rez) {
        assertArrayEquals(new Variant1().whileTask(n , k), rez);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 5, 2, new int[]{1,2}} ,
                { 8, 6, new int[]{2,1}},
                { 16,5 , new int[]{1,3}}};
    }

    /*@Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(int n,int k,int[] rez) {
        ;
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][] { { 5, 2, new int[]{2,3}} };
    }
*/
    //////////////////////////////////////////

    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(int p1, int[][] m, int p2){
        assertEquals(new Variant1().minMaxTask(p1, m), p2);
    }

    @DataProvider
    public Object[][] minMaxProvider() {
        return new Object[][] { {5, new int[][]{{1,2},{3,4},{5,6},{1,-1},{9,1}},22 },
                {3, new int[][]{{5,2},{4,4},{8,3},},22 },
                {2, new int[][]{{8,9},{7,8}},34 },
                {6, new int[][]{{1,2},{3,4},{5,6},{1,3},{9,1},{11,8}},38 }};
    }


    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int p1, int p2, int p3, int[] array) {
        assertEquals(new Variant1().arrayTask(p1, p2, p3), array);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { { 3, 2, 1, new int[] {2, 3, 4}}
                //{5, 4, 2, new int[] {4, 6, 8, 10, 12}},
                //{4, 2, 2, new int[]{2, 4, 6, 8}}
                 };
    }



    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int p1, int p2, int[] p3, int[][] output) {
        assertEquals(new Variant1().twoDimensionArrayTask(p1, p2, p3), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] output1 = {
                {4, 4, 4, 4},
                {5, 5, 5, 5},
                {8, 8, 8, 8},
                {7, 7, 7, 7}};

        int[][] output2 = {
                {-4, -4, -4},
                {2, 2, 2},
                {1, 1, 1}};

        int[][] output3 = {
                {8, 8, 8},
                {2, 2, 2},
                {4, 4, 4}};

        return new Object[][] { {4, 4, new int[]{4, 5, 8, 7}, output1}, {3, 3, new int[]{-4, 2, 1}, output2},
                {3, 3, new int[]{8, 2, 4}, output3}};

    }
}
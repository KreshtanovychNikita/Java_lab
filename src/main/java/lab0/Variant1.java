package lab0;


import java.util.Arrays;

public class Variant1 {


    /**
     *
     *
     */
    public int minMaxTask(int lenMas,int[][]  masN) {
        assert lenMas > 0: "Array must be not empty";

        int max =2* masN[0][0] +2* masN[0][1];
        for (int i = 0; i<lenMas;i++){
            if(2*masN[i][0]+2*masN[i][1]>max){
                max = 2*masN[i][0]+2*masN[i][1];
            }
        }
        return max;
    }

    /**
     *
     *
     */

    public int integerNumbersTask(int a, int b) {
        assert 0 < b && 0 < a && a >= b: "Error";
        return a / b;
    }

    /**
     * @param a - integer
     * @return true, if a % 2 == 0
     */
    public boolean booleanTask(int a){
       if( a % 2 == 0)
           return true;
       return false;
    }



    /**
     *
     * @param x1 - integer

     * @return count of positive Xs
     */
    public int ifTask(int x1) {
        int result = 0;
        if(x1 == 0)
            result = 10;
        if(x1 > 0)
            result = x1 + 1;
        if(x1 < 0)
            result = x1-2;
        return result;


    }


    /**
     *
     */
    public String switchTest(int args) {

        String monthString;
        assert args < 12;
        switch (args) {
            case 12,1,2:  monthString = "зима";
                break;
            case 3,4,5:  monthString = "весна";
                break;
            case 6,7,8:  monthString = "лето";
                break;
            case 9,10,11: monthString = "осень";
                break;
            default: monthString = "Invalid month";
                break;
        }
        return(monthString);
    }



    /**
     *

     */

    public String forTask(int a , int b) {
        if(a>b)  new IllegalArgumentException();

        StringBuilder builder = new StringBuilder();
        b--;
        a++;
        for (int i = a;i<=b;i++){
                builder.append(i+"");
        }
        System.out.println(builder);
        return builder.toString();
    }


    /**
     *
     */
    public int[] whileTask(int n, int k) {
        assert n > 0 && k>0: "Argument should be more than zero";

        int num = 0;
        while (n>=k){
            n-=k;
            num++;
        }
        return new int[]{n,num};
    }


    /**
     * @param n - positive number
     * @param a - integer
     * @param d - integer
     * @return array of n numbers of geometrical progression A, A + D1, ...
     */
    public int[] arrayTask(int n, int a, int d) {
        assert n > 1: "A is the size of returning array, it can't be less than 1";
        int[] res = new int[n];
        res[0] = a;
        res[1] = a + d;
        for (int i = 2; i < n; i++){
            res[i] = a + d * i;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    /**
     *
     *
     */
    public int[][]  twoDimensionArrayTask(int m, int n, int[] array) {
        int[][]matrix = new int[m][n];

        if(m!=n && m!=array.length) new Exception();
        for (int i = 0;i<m;i++){
            for (int j=0;j<m;j++){
            matrix[j][i] = array[j];
        }}


        return matrix;
    }


    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}
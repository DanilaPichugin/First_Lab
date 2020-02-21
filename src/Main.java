/**
 * Basic Method to print in terminal "Starting project" text line
 */

public class Main {
    /*
    The method to find max element in array for Forth Task
     */
    public static int getMax(int[] Array) {
        int maxValue = Array[0];
        for(int i = 1; i<Array.length; i++){
            if(Array[i] > maxValue){
                maxValue = Array[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        System.out.println("First Task");
        System.out.println("Starting project");

        System.out.println("Second Task");
        boolean bool_a = true;
        byte byte_b = 127;
        short short_c = 32760;
        int int_d = 2020;
        long long_e = 123456678;
        float float_f = 3.7E6f;
        double double_g = 0.002;
        char char_h = 'i';
        System.out.println("This is a boolean : " + bool_a);
        System.out.println("This is a byte : " + byte_b);
        System.out.println("This is a short : " + short_c);
        System.out.println("This is an integer : " + int_d);
        System.out.println("This is a long : " + long_e);
        System.out.println("This is a float : " + float_f);
        System.out.println("This is a double : " + double_g);
        System.out.println("This is a char : " + char_h);

        byte v_byte = 120;//the range of byte is from -128 to 127
        short v_short = 129;//the range of short is from -32768 to 32767
        char v_char = 'a';//(because it is not a number, should be in '')unicode table and ASCII table
        int v_int = 65999;//the range of integer is from -2147483648 to 2147483647
        long v_long = 4294967296L;//(0.33333334 - 0.33333334f(because of the data type long)) the range of long is from -9223372036854775808 to 9223372036854775807
        float v_float = 0.33333334f;//(0.33333334 - 0.33333334f(because of the data type float)) the range of float is from 1.40129846432481707e-45 to 3.40282346638528860e+38
        double v_double = 0.3333333333333333;//the range of double is from 4.94065645841246544e-324d to 1.79769313486231570e+308d
        boolean v_boolean = true;//(v_double - v_boolean(because of the value)) the value between true anf false
        System.out.println(v_byte);
        System.out.println(v_short);
        System.out.println(v_char);
        System.out.println(v_int);
        System.out.println(v_long);
        System.out.println(v_float);
        System.out.println(v_double);
        System.out.println(v_boolean);

        System.out.println("Third Task");

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        long begin = new java.util.Date().getTime();
        /*
        for data type INTEGER the time will be ~36 milliseconds
        for data type LONG the time will be ~52 milliseconds
        the conclusion is that the time for LONG is bigger than for INTEGER
        because, presumably, LONG data type variable occupies more space for 100000000 symbols than INTEGER data type
        because of their actual size
        even though integer data type variables are all converted to long data type, the operations for reading and processing
        will be slightly faster in integer
         */
        for (int i = 0; i <= 100000000; i++) {
            i++;
        }
        long end = new java.util.Date().getTime();
        System.out.println("Begin time : " + begin);
        System.out.println("End time : " + end);
        System.out.println("The difference :" + (end - begin));

        System.out.println("Forth Task");

        int[] mas = {12, 43, 12, -65, 778, 123, 32, 76};

        int max = getMax(mas);
        System.out.println("Maximum value is : " + max);

        System.out.println("4.2 Task");

        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 10);
            }
        }

        for (int i = 0; i < matrix.length; i++, System.out.println()) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
        }

        System.out.println("Transpose Matrix");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
                }

            }

        for (int i=0;i<matrix.length;i++,System.out.println()){
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

}

public class StarPatterns {
    public static void main(String[] args) {
        // flag();
        // rightHalfPirameeder();
        //leftHalfPirameeder();
        //fullParamid();
        //invertedRightHaifParamid();
        //invertedLeftHalfPyramid();
        //invertedFullPyramid();
        //rombusPattern();
        //diamondPattern();
        //hollowRectangle();
        // hourGlassPattern();
        //hollowFullPyramid();
         hollowInvertedPyramid();
        // hollowDiamond();
        // floydsTriangle();
        // pascalsTriangle();

    }

    public static void flag(){
        // ****==================
        // ****==================
        // ****==================
        // ======================
        // ======================
        System.out.println("\n\n");

        for(int x = 0; x<3; x++){
            //System.out.println("****==================");
            for(int y = 0; y<4; y++ ){
                System.out.print("*");
            }
            for(int z = 0; z<18; z++){
                System.out.print("=");
            }
            System.out.println();
        }
        for(int j = 0; j<2; j++){
            //System.out.println("======================");
            for(int k = 0; k<22; k++){
                System.out.print("=");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }

    public static void rightHalfPirameeder(){
        // *
        // **
        // ***
        // ****
        // *****
        // ******

        System.out.println("\n");

        for(int i = 1; i<10; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    public static void leftHalfPirameeder(){
        //      *
        //     **
        //    ***
        //   ****
        //  *****
        // ******
        
        for(int i = 0; i<7; i++){
            for(int j = 7; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("*");
            }
                System.out.println();
        }
    }

    public static void fullParamid(){
    //       *  
    //      * *
    //     * * *
    //    * * * *
    //   * * * * *

    for(int i = 0; i<7; i++){
        for(int j = 7; j>i; j--){
            System.out.print(" ");
        }
        for(int k = 0; k<i; k++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    
    }

    public static void invertedRightHaifParamid(){
        
        // ******
        // *****
        // ****
        // ***
        // **
        // *

        for( int i = 0; i<7; i++){
            for(int j = 7; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedLeftHalfPyramid(){

        // ******
        //  *****
        //   ****
        //    ***
        //     **
        //      *

        for(int i = 0; i<7; i++){
            for(int l = 0; l<i; l++){
                System.out.print(" ");
            }
            for(int j = 7; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void inver6tedFullPyramid(){

        // * * * * * *
        //  * * * * *
        //   * * * * 
        //    * * * 
        //     * * 
        //      * 

        for(int i = 0; i<7; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 6; k>i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rombusPattern(){

        // * * * * 
        //  * * * * 
        //   * * * * 
        //    * * * * 
        //     * * * * 

        for(int i = 0; i<5; i++){
            for(int k = 0; i>k; k++){
                System.out.print(" ");
            }
            for(int j = 0; j<4; j++){
                System.out.print(" *");
            }
            System.out.println( );
        
        }
        
    }

    public static void diamondPattern(){

        //     *
        //    * * 
        //   * * * 
        //  * * * *
        //   * * *  
        //    * * 
        //     *

        for(int i = 0; i<5; i++){
            for(int j = 4; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0; i<4; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 3; k>i; k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void hourGlassPattern() {

        // * * * * * 
        //  * * * * 
        //   * * * 
        //    * * 
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * * 


    for (int i = 5; i > 0; i--) {
        for (int j = 0; j < 5 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    for (int i = 2; i <= 5; i++) {
        for (int j = 0; j < 5 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
 }

    public static void hollowRectangle() {
    
        // **********
        // *        *
        // *        *
        // *        *
        // **********

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void  hollowFullPyramid() {
    
        
            //     *
            //    * *
            //   *   *
            //  *     *
            // *********

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowInvertedPyramid() {

        // ********* // MEEKA EKAK 
        //  *     *
        //   *   *
        //    * *
        //     *

        for(int i = 0; i < 10; i++){
            System.out.print("*");
        }

        for(int j = 0; j < )
    }
 
    public static void hollowDiamond() {

        //     *
        //    * *
        //   *   *
        //  *     *
        //   *   *
        //    * *
        //     *


        for (int i = 0; i < 4; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 4 - 2; i >= 0; i--) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
 
    public static void floydsTriangle() {
        
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

         int number = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void pascalsTriangle() {
        
        //       1
        //      1 1
        //     1 2 1
        //    1 3 3 1


        for (int i = 0; i < 4; i++) {
            int number = 1;
            for (int j = 4 - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


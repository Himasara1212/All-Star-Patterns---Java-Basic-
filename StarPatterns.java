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
        hourGlassPattern();

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

    public static void invertedFullPyramid(){

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

        for(int ){

        }
        // for(int i = 0; i<5; i++){
        //     for(int j = 4; j>i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k = 0; k<i; k++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        
    }
}

public class Pattern2 {
    public static void main(String[] args) {


        //*
        //**
        //***
        //****
//        for(int i=1;i<5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//    }

//     *        1st
//    **   *    2  space 3
//   ***  **  *    3 space2
//  **** *** ** *   4 space 1

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            for (int l = 1; l <= (3 - i) + 2 && i != 1; l++) {
                System.out.print(" ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= (3 - i) + 2 && i != 2; l++) {
                System.out.print(" ");
            }

            for (int k = 3; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= (3 - i) + 2 && i != 3; l++) {
                System.out.print(" ");
            }

            for (int k = 4; k <= i; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

}
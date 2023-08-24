// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my array program! \n ");

        int[] myNumbers = new int[8];
        myNumbers[0] = 1;
        myNumbers[1] = 2;
        myNumbers[2] = 3;
        myNumbers[3] = 4;
        myNumbers[4] = 5;
        myNumbers[5] = 6;
        myNumbers[6] = 7;
        myNumbers[7] = 8;

        //output array
        System.out.println("myNumbers[3] = " + myNumbers[3]+ "\n");

        // make a for loop to print the array with the number
        for (int i=0; i<8; i++) {
            System.out.println(" I am at loop " + i + " and at " + "myNumbers " + myNumbers[i]);
        }

        int[][] myNumberGrid = new int[4][3];

        int myFiveContainer = 0;
        for(int i=0; i<8;i++){
            myNumbers[i]= myFiveContainer +=5;
        }

        myFiveContainer = 0;
        for (int i = 0; i < 4; i++){
            for ( int j = 0 ; j < 3; j++) {
                myNumberGrid[i][j] = myFiveContainer +=5;
            }
        }

        System.out.println("\n\n");
        for (int i = 0; i < 4; i++){
            for ( int j = 0 ; j < 3; j++) {
                System.out.print(myNumberGrid[i][j] + " ");
            }
            System.out.println("");
        }



    }
    }





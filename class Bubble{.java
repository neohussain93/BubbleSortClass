
import java.util.Scanner;
class Bubble{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        int [] [] numbers = new int [4][3];

        System.out.print("enter the "+numbers.length+" rows and "+numbers[0].length);
        for( int row=0; row<numbers.length; row++){
            for(int column=0; column<numbers[row].length; column++){
                numbers[row][column] = input.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]+"   ");
            }
            System.out.println();

            break;
        }

    }
}
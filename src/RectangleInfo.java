import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double sideA;
        double sideB;
        double sideD;

        Scanner s = new Scanner(System.in);

//prompting the user to give inputs

        System.out.println("Enter the two sides of the rectangle");
        sideA=s.nextDouble();
        sideB=s.nextDouble();

//testing for valid inputs

        if(sideA<=0&&sideB<=0){
            System.out.println("Enter valid input");
        }
        else
        {
//area of a rectangle is the product of its sides

            System.out.println("Area of rectangle is: "+(sideA*sideB));

//By pythagorean theorm,length of the diagonal is sqrt of a^2+b^2

            sideD=Math.sqrt(sideA*sideA+sideB*sideB);

            System.out.println("The length of the diagonal:"+sideD);
        }

    }
}
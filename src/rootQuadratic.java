import java.util.Scanner;

public class rootQuadratic {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        float firstNumber;
        float secondNumber;
        float thirdNumber;
        float dis;
        float x1;
        float x2;
        int numberOfRoots=0;


        System.out.println("Enter first number: ");
        firstNumber=Float.parseFloat(scanner.nextLine());
        if (firstNumber==0){
            System.out.println("Typed 0, it is not possible");
        }
        else{
            System.out.println("Enter second number: ");
            secondNumber=Float.parseFloat(scanner.nextLine());
            System.out.println("Enter third number: ");
            thirdNumber=Float.parseFloat(scanner.nextLine());


            dis=(float)(Math.pow(secondNumber,2)-4*firstNumber*thirdNumber);
            System.out.printf("Discriminant is: %.2f %n",dis);
            if (dis<0)numberOfRoots=0;
            if (dis==0)numberOfRoots=1;
            if (dis>0)numberOfRoots=2;

            switch (numberOfRoots){
                case 0:
                    System.out.println("There is no root");
                    break;
                case 1:
                    x1=x2=-secondNumber/2*firstNumber;
                    System.out.println("value of x1=x2 is: "+x1);
                    break;
                case 2:
                    x1 = (float) (-secondNumber+Math.pow(dis,0.5))/(2*firstNumber);
                    x2 = (float) (-secondNumber-Math.pow(dis,0.5))/(2*firstNumber);
                    System.out.printf("value of x1 is: %.2f %n",x1);
                    System.out.printf("value of x2 is: %.2f %n",x2);
                    break;
                default:
                    System.out.println("Something is wrong");

            }
        }


    }
}

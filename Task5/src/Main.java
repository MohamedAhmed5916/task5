import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Shapable {
    static ArrayList<Double>number= new ArrayList<>();
    final double pi=3.14;
    public static void main(String[] args) {
        Main ob=new Main();
        Scanner in=new Scanner(System.in);
        enum Enum{rectangle,circle};
        System.out.println("Tell me teelllllll meeeeeeeeee");
        System.out.println("choose: \n1:CircleArea \n2:RectangleArea ? 1/2");
        System.out.println("Enter number :");
        int choose= in.nextInt();
        if(choose==1){//circle

            while (true){
                System.out.println("Enter Radius :");
                double radius= in.nextDouble();
                number.add(radius);
                System.out.println("is that the last number?yes/no");
                String Cheek=in.next();
                if (Cheek.equals("yes")){
                    break;
                }
            }
            ob.area();
        }
        else if (choose==2) {//rectangle
            System.out.println("Enter First Num");
            double First= in.nextDouble();
            System.out.println("Enter Second Num");
            double Second= in.nextDouble();
         ob.area(First,Second);

        }else {
            System.out.println("wrong number");
        }
    }


    @Override
    public void area() {
        for (int i=0;i< number.size();i++){
                 double AreaCircle=number.get(i)*number.get(i)*pi;
            System.out.println("Area Circle ="+AreaCircle);
        }

    }

    @Override
    public void area(double z, double y) {
        double RectangleArea=z*y;
        System.out.println("Rectangle Area ="+RectangleArea);
    }
}
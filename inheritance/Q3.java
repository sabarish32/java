
import java.util.*;
class Travel{
    int distance;
    Travel(int distance){
        this.distance=distance;
    }
     int cdistance(){
        return distance;
     }
}
class Car extends Travel{
    int fuel;
    Car(int distance,int fuel){
        super(distance);
        this.fuel=fuel;
    }
    int cdistance(){
        return distance/fuel;
    }
}
public class Q3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Distance:");
        int distance=sc.nextInt();
        System.out.println("Fuel:");
        int fuel=sc.nextInt();
        Travel obj=new Car(distance,fuel);
        System.out.println("Mileage:"+obj.cdistance());
    }
}
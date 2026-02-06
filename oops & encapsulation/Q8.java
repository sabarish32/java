import java.util.*;
class Bill{
    private int units;
    Bill(int units){
    this.units=units;
}
void units(){
    int Billamount;
    if(units<=100){
        Billamount=100*1;
        System.out.println("Total Bill: "+Billamount);
    }
    else if(units<=200){
        Billamount=(100*1)+(units-200)*2;
        System.out.println("Total Bill: "+Billamount);
    }
    else{
        Billamount=(100*1)+(100*2)+(units-200)*3;
    System.out.println("Total Bil: "+Billamount);
    }
}
}
    public class Q8{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int units=sc.nextInt();
            Bill obj=new Bill(units);
            obj.units();


        }
    }
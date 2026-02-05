import java.util.*;
class Book{
    private int book;
    Book(int book){
        this.book=book;
    }
    void display(){
        if(book<=3){
            System.out.println("Books Issued:"+book+"\n"+"Request: Issue Book");
        }
        else{
            System.out.println("Book issue limit exceeded");
        }
    }
}
public class Book4{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int book=sc.nextInt();
        Book obj=new Book(book);
        obj.display();
    }
}
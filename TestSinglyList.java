import java.util.Scanner;

/**
 * Created by Arabic on 21/02/22.
 */
public class TestSinglyList {
    public static void main(String[] args) {
        SinglyLinkedList<String>list=new SinglyLinkedList<>();
        Scanner in=new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first\t 2 add last \t3 remove");
        while (choice!=0)
        {
            System.out.println("Your choice : ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("input name : ");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name : ");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("Deleted is : " + list.removeFirst());
                    break;
                case 0 :
                    System.exit(0);
            }

            System.out.println("First : "+list.first()+"\tLast : "+list.last());
        }
    }
}

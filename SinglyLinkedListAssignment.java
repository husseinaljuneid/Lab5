public class SinglyLinkedListAssignment {

   /* public static void find(SinglyLinkedList list)
    {
        SinglyLinkedList.Node node=list.getHead();
        while (node!=null)
        {
            System.out.print(node.getNext().getElement()+", ");
            node=node.getNext();
        }
    }
    */
    public static int size(SinglyLinkedList list)
    {
        int size=0;
        SinglyLinkedList.Node node;
        node=list.getHead();
        while (node!=null)
        {
            node=node.getNext();
            size++;
        }
      return size;
    }


   public static void rotate(SinglyLinkedList l)
   {
       int sz=l.size();
       for (int i = 0; i < sz; i++) {

           l.addLast(l.removeFirst());
       }

   }
    public static void concate(SinglyLinkedList L,SinglyLinkedList M)
    {
        while (!M.isEmpty())
        {
        L.addLast(M.removeFirst());
        }
    }

    public static void print(SinglyLinkedList list)
    {
        SinglyLinkedList.Node node;
        node=list.getHead();
        while (node.getNext()==null)
        {
            System.out.print(node.getElement()+", ");
            node=node.getNext();
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList <Integer>list=new SinglyLinkedList();
        SinglyLinkedList <Integer>list2=new SinglyLinkedList();
        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(15);
        list.addFirst(20);
        list.addFirst(25);
        list.addFirst(30);
        System.out.println("List 1 before "+list.size());
        list2.addFirst(1);
        list2.addFirst(2);
        list2.addFirst(3);
        list2.addFirst(4);
        list2.addFirst(5);
        list2.addFirst(6);
        System.out.println("List 2 size "+list.size());
        concate(list,list2);
        System.out.println("List 1 after "+list.size());
        print(list);
        System.out.println();
        rotate(list);
        print(list);
        System.out.println();


    }
}

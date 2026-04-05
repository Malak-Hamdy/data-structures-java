void main() {
 LinkedList list = new LinkedList();
 list.insert_At_End(10);
 list.insert_At_End(20);
 list.insert_At_End(30);
 list.insert_At_End(40);
 list.insert_at_top(5);
 LinkedList.likedlistgreet();
 list.insert_at_top(6);
 list.delete_last_element();


 list.print();
}
class Node{
    int data;
    Node next=null;
    public Node(int data) {
        this.data = data;
    }
}

class LinkedList{
    Node head;

    void insert_At_End(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;

        }
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void insert_at_top(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            head=newNode;
            newNode.next=temp;
        }
        
    }
    void delete_last_element() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    static void likedlistgreet( ){
        System.out.println("Hello World");
    }
    

}

public class ListNodeApp {
    private int length;

    public ListNodeApp(){
        length = 0;
    }

    ListNode head;

    public synchronized ListNode getHead(){
        return head;
    }

    public synchronized void insAtBegin(ListNode node){
        node.setNext(head);
        head = node;
        length++;
    }

}

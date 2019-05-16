public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        count = 0;
    }

    public void insertFirst(ListNode node) {
        if(node != null) {
          if(this.head != null) {
              node.setNextNode(this.head);
              this.head.setPreviousNode(node);
              this.head = node;
              count++;
          }else {
              //no element in linked list
              this.head = node;
              this.tail = node;
              count++;
          }
        }
    }

    public void insertLast(ListNode node) {
        if(node != null) {
            if(this.tail != null) {
                this.tail.setNextNode(node);
                node.setPreviousNode(this.tail);
                this.tail = node;
                count++;
            } else {
                this.head = node;
                this.tail = node;
                count++;
            }
        }
    }

    public void insertAfter(String key, ListNode node) {
        //there are elements in the list
        ListNode temp = this.head;
        while(temp.getNextNode() != null) {
            if(temp.getElement().equals(key)) {
                insertAfterNode(temp, node);
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
    }


    public void insertBefore(String key, ListNode node) {
        //there are elements in the list
        ListNode temp = this.tail;
        while(temp.getPreviousNode() != null) { 
            if(temp.getElement().equals(key)) {
                insertBeforeNode(temp, node);
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    public void insertAfterNode(ListNode current, ListNode newNode) {
        ListNode currentNextNode = current.getNextNode();
        current.setNextNode(newNode);
        newNode.setPreviousNode(current);
        newNode.setNextNode(currentNextNode);
    }


    public void insertBeforeNode(ListNode current, ListNode newNode) {
        ListNode currentPreviousNode = current.getPreviousNode();
        current.setPreviousNode(newNode);
        newNode.setNextNode(current);
        newNode.setPreviousNode(currentPreviousNode);
    }

    public void setHead(ListNode tempNode) {
        this.head = tempNode;
    }

    public void setTail(ListNode tempNode) {
        this.tail = tempNode;
    }
}

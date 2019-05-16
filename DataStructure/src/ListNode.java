public class ListNode {
    private ListNode previousNode;
    private ListNode nextNode;
    private String element;

    public ListNode(){
        this.previousNode = null;
        this.nextNode = null;
        this.element = null;
    }

    public ListNode(ListNode previousNode, ListNode nextNode, String element) {
        this.previousNode = previousNode;
        this.nextNode = nextNode;
        this.element = element;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setPreviousNode(ListNode previousNode) {
        this.previousNode = previousNode;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public String getElement() {
        return element;
    }

    public ListNode getPreviousNode() {
        return previousNode;
    }
}

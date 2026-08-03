public class Node {
    private Node prev;
    private Node next;
    private int data;

    public Node(int nodeData){
        this.setData(nodeData);
        this.setPrev(null);
        this.setNext(null);
    }

    public Node(Node prevNode, int nodeData, Node nextNode){
        this.setPrev(prevNode);
        this.setData(nodeData);
        this.setNext(nextNode);
    }

    // Check if there is a node before the current node
    public boolean hasPrevious(){
        return this.getPrev() != null;

    }

    // Check if there is a node after the current node
    public boolean hasNext(){
        return this.getNext() != null;
    }


    // Getters and setters
    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public void setPrev(Node prevNode) {
        this.prev = prevNode;
    }

    public void setData(int nodeData) {
        this.data = nodeData;
    }
}

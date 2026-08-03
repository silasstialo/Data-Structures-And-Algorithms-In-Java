public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;// I do not like this attribute through. Can easily forget to increment

    public LinkedList(){
        this.setHead(null);
        this.setTail(null);
    }

    // Adds a node at the end of the list

    /**
     * @param node The node that you want added to the list
     */
    public void add(Node node){
        // If the list is empty
        if (this.getHead() == null){
            this.setHead(node);
            this.setTail(node);
            node.setPrev(null);
            node.setNext(null);

        }

        else{
            // If the list already has nodes
            this.getTail().setNext(node);
            node.setNext(null);
            node.setPrev(this.getTail());
            this.setTail(node);
        }

        this.setSize(this.getSize() + 1);
    }

    // Provide a list of elements to add, and for each element, create a node and add ot to the list

    /**
     *
     * @param data An array of elements that you want added to the list
     */
    public void add(int[] data){
        for(int element : data){
            this.add(new Node(element)); // The add method will take care of incrementing the size
        }
    }

    // Removes a node at the end of the list.

    /**
     * @throws NullPointerException This occurs when you try to invoke "Node.getPrev()" on an empty list(tail is null)
     */
    public void remove(){
        // Handle the NullPointerException caused by trying to invoke "Node.getPrev()" on an empty list
        if(this.getHead() == null){
            throw new NullPointerException("The list is empty!");
        }

        else {
            Node current = this.getTail();

            // If there is more than one element remaining
           if(current.hasPrevious()){
               this.setTail(current.getPrev());
           }

            // If there is only one element in the list
            else{
                this.setHead(null);
                this.setTail(null);
            }


            this.setSize(this.getSize() - 1);
        }
    }

    // Adds a node at a specific index
    // Can also be used to add a node at the end of the list, in that case, you need to know the size of the list
    // Can be used to add a node at the beginning of the list (index 0) as well

    /**
     *
     * @param node The node you want added to the list
     * @param index The index at which you want the node inserted
     * @throws ArrayIndexOutOfBoundsException If the supplied index is out of bounds.
     */
    public void addAt(Node node, int index){
        Node current = this.getHead();
        int counter = 0;


        /* if(index > this.size){
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        else if(index == this.size){
            this.add(node);
            size += 1;
        }*/

        // I do not wish to rely on the size attribute of the list to tell if the provided index is out of bounds.

        /* Edge cases to handle
            index < 0
            index == 0
         */
        if(index < 0){
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + this.getSize());
        }

        // Add a node at the beginning
        else if(index == 0){
            // If the list is not empty
           if(this.getHead() != null){
               this.getHead().setPrev(node);
               node.setNext(this.getHead());
               node.setPrev(null);

               this.setHead(node);
               this.setSize(this.getSize() + 1); // Increment size before returning
           }

           // If the list is empty
            else{ // If (this.getHead() == null)
                this.add(node); // The add method will take care of incrementing the size
           }
            return; // Return immediately to prevent corrupting the links
        }


        else{
            while(counter < index - 1){
                if(current.hasNext()){
                    current = current.getNext();
                    counter += 1;
                }

                else{
                    // Ran out of nodes before reaching index - 1
                    throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + this.getSize());
                }

            }

            // At this point counter == index - 1
            // If current has no next, we are at the end — append
            if(!current.hasNext()){
                this.add(node);
                return;
            }
        }




        Node nextNode = current.getNext();
        node.setNext(nextNode);
        node.setPrev(current);

        nextNode.setPrev(node);
        current.setNext(node);

        this.setSize(this.getSize() + 1);
    }


    // removes an element at a specified index.

    /**
     *
     * @param index The index of the element which you want removed
     * @throws ArrayIndexOutOfBoundsException If the supplied index is out of bounds.
     */
    public void removeAt(int index){
        Node current = this.getHead();
        int counter = 0;

        if(index < 0){
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + this.getSize());
        }

        else if(index == 0){
            Node nextHead = this.getHead().getNext();
            this.setHead(nextHead);
            nextHead.setPrev(null);

            this.setSize(this.getSize() - 1);
            return;
        }

        else{
            while(counter < index){
                if(current.hasNext()){
                    current = current.getNext();
                    counter += 1;
                }

                else{
                    // Ran out of nodes before reaching index - 1
                    throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + this.getSize());
                }
            }

            // At this point counter == index
            // If current has no next, we are at the end — remove
            if(!current.hasNext()){
                this.remove();
                return;
            }
        }


        Node prevNode = current.getPrev();
        Node nextNode = current.getNext();

        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);

        this.setSize(this.getSize() - 1);

    }


    // Visit and print each element of the list
    public  void traverse(){
        if(this.getHead() == null){
            IO.println("List Empty! \n");
        }

        else {
            Node current = this.getHead();
            while(current != null){
                IO.println(current.getData());
                current = current.getNext();
            }
        }
    }

    // Visit and print each element of the list in reverse order
    public  void traverseReverse(){
        if(this.getTail() == null){
            IO.println("List Empty! \n");
        }

        else {
            Node current = this.getTail();
            while(current != null){
                IO.println(current.getData());
                current = current.getPrev();
            }
        }
    }

    // Remove all the elements from the list
    public void clear(){
        this.setHead(null);
        this.setTail(null);
        this.setSize(0);
    }


    /**
     *
     * @param index The index of the node(Data encapsulated by the node) you want to retrieve..
     * @return The data encapsulated by the node at the specified index.
     * @throws ArrayIndexOutOfBoundsException If the index supplied is out of bounds.
     */
    public int get(int index){
        if(this.getHead() == null){
            IO.println("List empty!");
        }

        else{
            int counter = 0;
            Node current = this.getHead();

            while(current != null){
                if(counter == index){
                    return current.getData();
                }
                else{
                    current = current.getNext();
                    counter += 1;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException("Index " + index +" out of bounds for length " + this.getSize());
    }


    // Return the index of the first occurrence of the specified element

    /**
     *
     * @param data The value whose index you want to find (The data encapsulated by the node, not the actual node).
     * @return The index of the node that encapsulates the supplied value.
     */
    public int find(int data){
        Node current = this.getHead();
        int counter = 0;

        while(current != null){
            if(current.getData() == data){
                return counter;
            }

            else {
                if(current.hasNext()){
                    current = current.getNext();
                    counter += 1;
                }
                else{
                    return -1;
                }

            }
        }

        return -1;
    }



    // Getters and setters
    public Node getTail() {
        return this.tail;
    }

    public Node getHead() {
        return this.head;
    }

    public int getSize(){
        return this.size;
    }

    public void setTail(Node node){
        this.tail = node;
    }

    public void setHead(Node node){
        this.head = node;
    }

    public void setSize(int newSize){
        this.size = newSize;
    }


}

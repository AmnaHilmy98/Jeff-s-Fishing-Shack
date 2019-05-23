package model.LinkedList;

public class MyLinkedList {

    private Node head;
    private static int countList;
    private int count;

    public int size(){

        return count;
    }

    public Object get(int index){

        if(index < 0) return null;

        Node currentNode = null;

        if(head != null ){

            currentNode = head.getNext();

            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null)
                    return null;

                currentNode = currentNode.getNext();
            }

            return currentNode.getElement();
        }

        return null;
    }

    public void add(Object object){

        if(head == null){ head = new Node(object); }

        Node tempNode = new Node(object);
        Node currentNode = head;

        if(currentNode != null){

            while (currentNode.getNext() != null ){

                currentNode = currentNode.getNext();
            }

            currentNode.setNext(tempNode);
        }

        count ++;

    }

    public boolean remove(int index){

        if(index > count || index < 1){ return false; }

        Node currentNode = head;

        if(head == null){

            for (int i = 0; i < index; i++) {

                if (currentNode.getNext() == null) { return false; }

                currentNode = currentNode.getNext();
            }

            currentNode.setNext(currentNode.getNext().getNext());

            count --;

            return true;
        }

        return false;
    }
    
}

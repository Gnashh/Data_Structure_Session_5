import java.util.*;

public class LinkedList {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        // Constructors
        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }


    public static class KWSingleLinkedList<E> {
        private Node<E> head = null;
        private int size = 0;

        public void addFirst(E item) {
            head = new Node<>(item, head);
            size++;
        }

        private void addAfter(Node<E> node, E item) {
            node.next = new Node<>(item, node.next);
            size++;
        }

        private E removeAfter(Node<E> node) {
            Node<E> temp = node.next;
            if (temp != null) {
                node.next = temp.next;
                size--;
                return temp.data;
            } else {
                return null;
            }
        }

        private E removeFirst(){
            Node<E>temp = head;
            if (head != null){
                head = head.next;
            }
            if (temp != null){
                size--;
                return temp.data;

            }else{
                return null;
            }
        }

        public static void main(String[] args) {
            Node<String> tom = new Node<>("Tom");
            Node<String> dick = new Node<>("Dick");
            Node<String> harry = new Node<>("Harry");
            Node<String> sam = new Node<>("Sam");

            tom.next = dick;
            dick.next = harry;
            harry.next = sam;

            System.out.println("Nodes initialized successfully.");
        }
    }
}

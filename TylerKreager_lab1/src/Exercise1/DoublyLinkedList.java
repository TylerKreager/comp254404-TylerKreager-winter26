package Exercise1;

public class DoublyLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        //getters-setters
        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }
        private Node<E> header;
        private Node<E> trailer;
        private int size = 0;

        public DoublyLinkedList(){
            header = new Node<>(null, null, null);
            trailer = new Node<>(null, null, null);
            header.setNext(trailer);
        }

        public int size() {return size;}

        public boolean isEmpty() {return size == 0;}

        public E first(){
            if (isEmpty()) return null;
            return header.getNext().getElement();
        }

        public E last() {
            if (isEmpty()) return null;
            return trailer.getPrev().getElement();
        }

        public void addFirst(E e) {
            addBetween(e, header, header.getNext());
        }
        public void addLast(E e) {addBetween(e, trailer.getPrev(), trailer);}

        public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
            Node<E> newest = new Node<>(e, predecessor, successor);
            predecessor.setNext(newest);
            successor.setPrev(newest);
            size++;
        }
        public void connectLists(DoublyLinkedList<E> otherList) {
            Node<E> walk = otherList.header.getNext();
            while (walk != otherList.trailer) {
                this.addLast(walk.getElement());
                walk = walk.getNext();

            }
        }
        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            Node<E> walk = header.getNext();
            while (walk != trailer) {
                sb.append(walk.getElement());
                walk = walk.getNext();
                if (walk != trailer)
                    sb.append(", ");
            }
            sb.append(")");
            return sb.toString();
        }
    }




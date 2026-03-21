package Ex1;



import java.util.Iterator;

public interface PositionalList<E> extends Iterable<E> {

    int size();

    boolean isEmpty();

    Position<E> first();

    Position<E> last();

    Position<E> before(Position<E> p) throws IllegalArgumentException;

    Position<E> after(Position<E> p) throws IllegalArgumentException;

    Position<E> addFirst(E e);

    Position<E> addLast(E e);

    Position<E> addBefore(Position<E> p, E e)
            throws IllegalArgumentException;

    Position<E> addAfter(Position<E> p, E e)
            throws IllegalArgumentException;

    E set(Position<E> p, E e) throws IllegalArgumentException;

    E remove(Position<E> p) throws IllegalArgumentException;

    Iterator<E> iterator();

    Iterable<Position<E>> positions();

    default int indexOf(Position<E> p) {
        int index = 0;
        Position<E> walk = first();

        while (walk != null) {
            if (walk == p) {
                return index;
            }
            walk = after(walk);
            index++;
        }
    throw new IllegalArgumentException("Position is has not been found.");
    }
}


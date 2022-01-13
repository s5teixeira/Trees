import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {
    Position<E> Root();
    Position<E> parent (Position<E> p);
    Iterable<Position<E>> children (Position<E> p);
    int numChildren(Position<E> p);
    boolean isInternal(Position<E> p);
    boolean isExternal(Position<E> p);
    boolean isRoot(Position<E> p);
    int depth(Position<E> p);
    int size();
    boolean isEmpty();
    Iterator<E> iterator();
    Iterable<Position<E>> positions();

    public int depth(Position<E>) {
        if (isRoot(p))
            return 0;
        else
            return 1+ depth(parent(p));
    }

}

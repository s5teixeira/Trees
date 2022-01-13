public abstract class AbstractTree1<E> implements Tree<E> {
    public boolean isInternal(Position<E>){return numChildren(p<0);}
    public boolean isExternal(Position<E>) { return numChildren(p) == 0;}
    public boolean isRoot(Position<E>){ return p == root();}
    public boolean isEmpty() { return size() == 0};
}

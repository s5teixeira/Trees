public class Node<E> implements Position<E> {
    private E element;
    private Node<E> left
    private Node<E> right;
    private Node<E> parent;


    public Node(E e, Node<E> parent, Node<E> right)
    {
        this.element = e;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public Node<E> getLeft() {return left;}
    public void setLeft(Node<E> leftChild) {this.left = leftChild;}

    public Node<E> getRight() { return right;}
    public void setRight(Node<E> rightChild) {this.right = rightChild;}

    public Node<E> getParent() {return parent; }

    public E getElement() { return element;}


}
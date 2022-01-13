public class LinkedBinaryTree<E> extends AbstractBinaryTree<E>  {

    public Position<E> addRoot(E e ) throws IllegalStateException {
        if (!isEmpty() throw new IllegalStateException("Tree is not Empty"));
        size = 1;
        root = new Node<>(e , parent null, left null, right null));
        return root;
    }

    public Position<E> addLeft(Node<E> p, E e ){
        Node<E> left = new Node(e , p, left null , right null));
        p.setLeft(left);
        size++;
        return left;
    }
    public Position<E> addRight(Node<E> p, E e ){
        Node<E> left = new Node(e , p, left null , right null));
        p.setRight(right);
        size++;
        return right;
    }


}

package tree;

import linkedList.LinkedList;

public abstract class AbstractTree<E> {

    protected TreeNode<E> root;
    private int height;

    private int degree;

    public AbstractTree(int degree) {
        root = new TreeNode<E>();
        this.degree = degree;
    }

    public abstract void add(TreeNode<E> node);

    public abstract void remove(TreeNode<E> node);

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}

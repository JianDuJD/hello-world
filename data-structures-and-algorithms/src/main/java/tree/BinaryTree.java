package tree;

import java.util.TreeMap;
import java.util.TreeSet;

public class BinaryTree<E> extends AbstractTree<E>{


    private TreeNode<E> lastLeftNode;

    private TreeNode<E> lastRightNode;

    public BinaryTree() {
        super(2);
    }

    @Override
    public void add(TreeNode<E> node) {

    }

    @Override
    public void remove(TreeNode<E> node) {

    }

    public void addOnLeft(TreeNode<E> node){
        lastLeftNode.setChild();
    }
    public TreeNode<E> getRootNode() {
        return rootNode;
    }

    public TreeNode<E> getLastLeftNode() {
        return lastLeftNode;
    }

    public TreeNode<E> getLastRightNode() {
        return lastRightNode;
    }
}

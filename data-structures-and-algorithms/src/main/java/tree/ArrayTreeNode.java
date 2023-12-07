package tree;

import linkedList.LinkedList;

import java.util.ArrayList;

public class ArrayTreeNode<E> implements TreeNode<E>{

    private ArrayList<ArrayTreeNode<E>> childs;

    private int index;


    @Override
    public LinkedList<TreeNode<E>> getChilds() {
        return null;
    }

    @Override
    public void setChild(TreeNode<E> child) {

    }
}

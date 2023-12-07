package tree;

import linkedList.LinkedList;

public interface TreeNode<E> {

    public LinkedList<TreeNode<E>> getChilds() ;

    public void setChild(TreeNode<E> child) ;
}

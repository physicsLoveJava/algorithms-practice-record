package offer;

import util.adt.BinaryTreeNode;

public class BinaryTreeMirror {

    public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> entity) {
        if(entity == null) {
            return null;
        }
        BinaryTreeNode<Integer> mirror = new BinaryTreeNode<>(entity.getData());
        mirror.setLeft(mirror(entity.getRight()));
        mirror.setRight(mirror(entity.getLeft()));
        return mirror;
    }

}

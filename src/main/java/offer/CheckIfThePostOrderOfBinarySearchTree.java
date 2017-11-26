package offer;

public class CheckIfThePostOrderOfBinarySearchTree {

    public static boolean isPostOrder(int[] order) {

        if(order == null) {
            return false;
        }

        return isPostOrder(order, 0, order.length - 1);

    }

    private static boolean isPostOrder(int[] order, int start, int end) {
        if(end <= start) {
            return true;
        }
        int rootVal = order[end];
        int mid = find(order, start, end, rootVal);
        if(mid == -1 || !checkValid(order, start, end, mid)) {
            return false;
        }
        return isPostOrder(order, start, mid - 1) && isPostOrder(order, mid, end - 1);
    }

    private static boolean checkValid(int[] order, int start, int end, int mid) {
        int midVal = order[end];
        for (int i = start; i < end; i++) {
            if(i < mid) {
                if(order[i] > midVal) {
                    return false;
                }
            }else {
                if(order[i] < midVal) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int find(int[] order, int start, int end, int rootVal) {
        for (int i = start; i < end; i++) {
            if(order[i] < rootVal) {
                continue;
            }
            return i;
        }
        return -1;
    }

}

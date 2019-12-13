package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreeTest {
    public static void main(String[] args){

    }
}



class TreeNode{
    public int value;
    public TreeNode left, right;
    public TreeNode(int v){
        value = v;
    }
}


class Solution{

    // Time O(n)
    // Space O(h)  Average O(log n)   Worst case O(n)
    public List<Integer> preOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        result.add(root.value);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }



    // Time O(n)
    // Space O(h)  Average O(log n)   Worst case O(n)
    public List<Integer> inOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inOder(root, result);
        return result;
    }

    private void inOder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        inOder(root.left, result);
        result.add(root.value);
        inOder(root.right, result);
    }




    // Time O(n)
    // Space O(h)  Average O(log n)   Worst case O(n)

    public List<Integer> postOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        postOder(root, result);
        return result;
    }

    private void postOder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        postOder(root.left, result);
        postOder(root.right, result);
        result.add(root.value);
    }


    // Time O(n)
    // Space O(h)  Average O(log n)  Worst Case O(n)
    public int getHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int lH = getHeight(root.left);
        int rH = getHeight(root.right);
        return 1 + Math.max(lH, rH);
    }



    // Time O(n)
    // Space O(h)  Average O(log n)  Worst Case O(n)
    public int Count(TreeNode root){
        if (root == null){
            return 0;
        }
        int lC = Count(root.left);
        int rC = Count(root.right);
        return 1 + lC + rC;
    }




    // Time O(n Log n)
    // Space O(h)
    public boolean isBalanced(TreeNode root){
        if (root == null){
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }






    // Time O(n)
    // Space O(h)   Average O(log n)  Worst Case O(n)
    public boolean isBalanced2(TreeNode root){
        return getHeightOrUnbalance(root) >= 0;
    }


    private int getHeightOrUnbalance(TreeNode root){
        if (root == null){
            return 0;
        }
        int l = getHeightOrUnbalance(root.left);
        int r = getHeightOrUnbalance(root.right);
        if(l<0 || r<0){
            return -1;
        }
        if(Math.abs(l-r) > 1){
            return -1;
        }
        return Math.max(l,r) + 1;
    }


}
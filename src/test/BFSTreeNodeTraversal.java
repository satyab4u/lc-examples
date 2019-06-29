package test;

import java.util.*;

/**
 * Created by Satya on 6/27/19.
 */
public class BFSTreeNodeTraversal {

    public static void main(String args[]) {
        TreeNode root = new TreeNode(3);
        TreeNode child1 = new TreeNode(9);
        TreeNode child2 = new TreeNode(20);
        TreeNode child3 = new TreeNode(15);
        TreeNode child4 = new TreeNode(7);
        root.left = child1;
        root.right = child2;
        child2.left = child3;
        child2.right = child4;
        List<List<Integer>> result = levelOrder(root);
        for(List<Integer> nodesList: result) {
            for(Integer val: nodesList) {
                System.out.print(val+ " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> levelOrder1(TreeNode root){
        List<List<Integer>> results = new ArrayList<>();
        if(root == null) return results;
        Queue<TreeNode> queue = new LinkedList<>();

        List<Integer> rootList = Arrays.asList(root.val);
        queue.offer(root);
        results.add(rootList);

        while(!queue.isEmpty()) {
            List<Integer> childList = new ArrayList<>();
            TreeNode node = queue.poll();
            if(node.left != null) {
                childList.add(node.left.val);
                queue.add(node.left);
            }
            if(node.right != null) {
                childList.add(node.right.val);
                queue.add(node.right);
            }
            results.add(childList);
        }
        return results;
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = queue.size();

            for(int i= 0; i< levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}

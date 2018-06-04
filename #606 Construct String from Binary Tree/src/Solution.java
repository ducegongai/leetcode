import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    };

    public String tree2str(TreeNode t) {
        if(t == null){
            return "";
        }
        StringBuilder sbl = new StringBuilder();
        sbl.append(t.val);
        if(t.left!=null&&t.right==null){
            sbl.append("(").append(tree2str(t.left)).append(")");
        }
        else if(t.right!=null){
            sbl.append("(").append(tree2str(t.left)).append(")").append("(").append(tree2str(t.right)).append(")");
        }
        return sbl.toString();

    }

    /*public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        TreeNode m = new TreeNode(2);
        m = t.left;
        TreeNode n = new TreeNode(3);
        n = t.right;
        TreeNode l = new TreeNode(4);
        l=m.left;
        l.left=null;
        l.right=null;
        if(t==null||m==null||l==null||n==null){
            System.out.println("");
        }
        Solution solution = new Solution();
        String res = solution.tree2str(t);
        System.out.println(res);

    }*/
}
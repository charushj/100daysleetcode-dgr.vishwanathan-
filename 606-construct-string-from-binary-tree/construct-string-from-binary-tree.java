class Solution {
  public String tree2str(TreeNode node) {
    if (node == null) return "";

    var s = Integer.toString(node.val);

    if (node.left == null && node.right == null)
      return s;
    
    s += "(" + tree2str(node.left) + ")";

    if (node.right != null)
      s += "(" + tree2str(node.right) + ")";

    return s;
  }
}
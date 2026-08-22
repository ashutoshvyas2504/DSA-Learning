class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> helper = new ArrayDeque<>();

        main.add(root);

        while (main.size() > 0) {

            List<Integer> currAns = new ArrayList<>(); // new list for each level

            while (main.size() > 0) {

                TreeNode currNode = main.remove();
                currAns.add(currNode.val);

                if (currNode.left != null) {
                    helper.add(currNode.left);
                }

                if (currNode.right != null) {
                    helper.add(currNode.right);
                }
            }

            ans.add(currAns);

            main = helper;
            helper = new ArrayDeque<>();
        }

        return ans;
    }
}
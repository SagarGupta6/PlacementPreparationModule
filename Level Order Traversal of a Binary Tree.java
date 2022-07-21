//Level order traversal of a binary tree. Given the root node of the tree and you have to print the value of the level of the node by level.s
class Solution {
    public List<Integer> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> wrapList = new List<Integer>();
        
        if(root == null) return wrapList;
        
        queue.offer(root);
        while(!queue.isEmpty()){
            
            if(queue.peek().left != null) 
                queue.offer(queue.peek().left);
                
            if(queue.peek().right != null) 
                queue.offer(queue.peek().right);
                
            wrapList.add(queue.poll().val);
        }
        return wrapList;
    }
}
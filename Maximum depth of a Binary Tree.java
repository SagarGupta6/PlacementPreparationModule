//Find the Maximum Depth of Binary Tree. Maximum Depth is the count of nodes of the longest path from the root node to the leaf node.
public class tUf {
    private static int levelOrder( Node root ){
        if( root == null ){
            return 0;
        }

        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);

        int level = 0;

        while( queue.size() > 0 ){
            int size = queue.size();

            while( size-- > 0 ){
                Node remNode = queue.removeFirst();
                if( remNode.left != null ){
                    queue.addLast( remNode.left );
                }
                if( remNode.right != null ){
                        queue.addLast( remNode.right );
                }
            }

            level++;
        }

        return level;
    }  
}
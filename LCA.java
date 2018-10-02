/*
Lowest Common Ancestor	To implement a function that can calculate the lowest common ancestor in a graph, that may be structured as a binary tree. The grading focus is on your test code.
*/
public class LCA<Key>{

  private Node<Key> root;
    
  private static class Node<Key>{
    Key key;
    Node<Key> left, right;

    public Node(Key key){
            this.key = key;
            this.left = this.right = null;
        }
    }
    
    public static void main(String[] args) {
    	
    }
}


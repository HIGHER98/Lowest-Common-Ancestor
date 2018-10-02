/*
Lowest Common Ancestor	
To implement a function that can calculate the lowest common ancestor in a graph, that may be structured as a binary tree. 
The grading focus is on your test code.
*/
public class LCA<Key>{

  public Node<Key> root;
  public boolean visited0 = false;
  public boolean visited1 = false;
  
  public Key lowestCommonAncestor(Key node0, Key node1){
  Node<Key> lca = findLCA(root, node0, node1);

  if(visited0 && visited1)
    return lca.key;

    return null;
  }

  private Node<Key> findLCA(Node<Key> root, Key key0, Key key1) {

    if (root == null)
      return null;

    Node<Key> temp = null;

    if (root.key.equals(key0)) {
     visited0 = true;
     temp = root;
    }
    if (root.key.equals(key1)) {
     visited1 = true;
     temp = root;
    }

    Node<Key> left_lca = findLCA(root.left, key0, key1);
    Node<Key> right_lca = findLCA(root.right, key0, key1);

    if (temp != null)
      return temp;

    if (left_lca != null && right_lca != null)
      return root;

    return (left_lca != null) ? left_lca : right_lca;
  }
}


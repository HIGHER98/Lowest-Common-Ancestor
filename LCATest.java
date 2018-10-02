import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(JUnit4.class)
@SuiteClasses({ LCA.class, Node.class })
public class LCATest {

  @Test
  public void testLCA(){

    LCA<Integer> tree = new LCA<Integer>();

    //Testing for an empty tree
    assertEquals("Testing for an empty tree", null, tree.lowestCommonAncestor(5,4));
        
    //Insert values into the tree        
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    /*
        The above tree will look like this:
        	   1
           /   \
          2     3
         / \   / \
        4   5 6   7
    */
        
    assertEquals("Testing ancestor of a value that doesn't exist in the tree", null, tree.lowestCommonAncestor(4, 8));
    assertEquals("Testing ancestor of (4, 5)", (Integer)2, tree.lowestCommonAncestor(4, 5));
    assertEquals("Testing ancestor of (6, 7)", (Integer)3, tree.lowestCommonAncestor(6, 7));
    assertEquals("Testing ancestor of (4, 7)", (Integer)1, tree.lowestCommonAncestor(4, 7));
    assertEquals("Testing ancestor of (2, 2)", (Integer)2, tree.lowestCommonAncestor(2, 2));        
    
    
    
    //Create new String tree
    LCA<String> alphaTree = new LCA<>();
        
    //Insert values into the tree
    alphaTree.root = new Node("a");
    alphaTree.root.left = new Node("b");
    alphaTree.root.right = new Node("c");
    alphaTree.root.left.left = new Node("d");
    alphaTree.root.left.right = new Node("e");
    alphaTree.root.right.left = new Node("f");
    alphaTree.root.right.right = new Node("g");
    /*
        The above tree will look like this:
       	    a
          /   \
         b     c
        / \   / \
       d   e f   g
     */

    assertEquals("Testing ancestor of (a, b)", "a", alphaTree.lowestCommonAncestor("a","b"));
    assertEquals("Testing ancestor of (d, g)", "a", alphaTree.lowestCommonAncestor("d","g"));
    assertEquals("Testing ancestor of (d, b)", "b", alphaTree.lowestCommonAncestor("d","b"));
   }
}

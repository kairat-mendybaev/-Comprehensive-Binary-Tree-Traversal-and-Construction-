import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTreeTest {
    private BinaryTree tree;
    private TreeNode root;

    @Before
    public void setUp() {
        tree = new BinaryTree();
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }

    @Test
    public void testPreorderTraversal() {
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3);
        assertEquals(expected, tree.preorderTraversal(root));
    }

    @Test
    public void testInorderTraversal() {
        List<Integer> expected = Arrays.asList(4, 2, 5, 1, 3);
        assertEquals(expected, tree.inorderTraversal(root));
    }

    @Test
    public void testPostorderTraversal() {
        List<Integer> expected = Arrays.asList(4, 5, 2, 3, 1);
        assertEquals(expected, tree.postorderTraversal(root));
    }

    @Test
    public void testLevelOrderTraversal() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, tree.levelOrderTraversal(root));
    }

    @Test
    public void testEmptyTree() {
        TreeNode emptyRoot = null;
        assertEquals(Collections.emptyList(), tree.preorderTraversal(emptyRoot));
        assertEquals(Collections.emptyList(), tree.inorderTraversal(emptyRoot));
        assertEquals(Collections.emptyList(), tree.postorderTraversal(emptyRoot));
        assertEquals(Collections.emptyList(), tree.levelOrderTraversal(emptyRoot));
    }

    @Test
    public void testSingleElementTree() {
        TreeNode singleRoot = new TreeNode(1);
        assertEquals(Collections.singletonList(1), tree.preorderTraversal(singleRoot));
        assertEquals(Collections.singletonList(1), tree.inorderTraversal(singleRoot));
        assertEquals(Collections.singletonList(1), tree.postorderTraversal(singleRoot));
        assertEquals(Collections.singletonList(1), tree.levelOrderTraversal(singleRoot));
    }
}

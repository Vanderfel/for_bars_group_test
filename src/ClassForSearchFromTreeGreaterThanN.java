import java.util.ArrayList;
import java.util.List;

public class ClassForSearchFromTreeGreaterThanN {
    public static List<TreeNode> findNodesWithValueGreaterThanN(TreeNode root, int n) {
        List<TreeNode> listOfNodesWithValueGreaterThanN = new ArrayList<>();
        searchNodes(root, n, listOfNodesWithValueGreaterThanN);
        return listOfNodesWithValueGreaterThanN;
    }

    private static void searchNodes(TreeNode node, int n, List<TreeNode> listOfNodesWithValueGreaterThanN) {
        if (node == null) {
            return;
        }
        if (node.getValue() > n) {
            listOfNodesWithValueGreaterThanN.add(node);
        }
        if (node.getChildren() != null) {
            for (TreeNode children : node.getChildren()) {
                searchNodes(children, n, listOfNodesWithValueGreaterThanN);
            }
        }
    }
}
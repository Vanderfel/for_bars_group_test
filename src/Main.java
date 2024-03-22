import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.setValue(5);
        TreeNode node1 = new TreeNode();
        node1.setValue(10);
        TreeNode node2 = new TreeNode();
        node2.setValue(11);
        TreeNode node3 = new TreeNode();
        node3.setValue(12);
        TreeNode node4 = new TreeNode();
        node4.setValue(13);
        TreeNode node5 = new TreeNode();
        node5.setValue(14);
        TreeNode node6 = new TreeNode();
        node6.setValue(113);
        TreeNode node7 = new TreeNode();
        node7.setValue(10);

        root.setChildren(Arrays.asList(node1,node2,node3));
        node3.setChildren(Arrays.asList(node4,node5));
        node5.setChildren(Arrays.asList(node6,node7));

        ClassForSearchFromTreeGreaterThanN searcher = new ClassForSearchFromTreeGreaterThanN();
        searcher.findNodesWithValueGreaterThanN(root,12);
        System.out.println(searcher.findNodesWithValueGreaterThanN(root,12));
    }
}
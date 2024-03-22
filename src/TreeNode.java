import lombok.Data;

import java.util.List;

@Data
public class TreeNode {
    private int value;
    private List<TreeNode> children;
}


import com.company.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    List<List<Integer>> BFS(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();

        if (root == null) return lists;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.add(curr);
                if (curr.right != null) q.add(curr);

                list.add(curr.val);
            }

            lists.add(list);
        }
        return lists;
    }
/******************************************************************************/
    void printLevelOrder(TreeNode root) {
        int h = height(root);
        for (int i = 0; i < h; i++) {
            printLevelOrder(root, i);
        }
    }

    void printLevelOrder(TreeNode root, int level) {
        if (root == null) return;
        if (level == 0) System.out.print(root.val + " ");
        else {
            printLevelOrder(root.left, level - 1);
            printLevelOrder(root.right, level - 1);
        }

    }

    int height(TreeNode p) {
        if (p == null)
            return 0;
        return 1 + Math.max(height(p.left), height(p.right));
    }

}

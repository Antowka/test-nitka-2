package ru.antowka.utils;

import ru.antowka.model.Node;
import ru.antowka.model.Tree;

public class TreeUtils {

    public static int calculateHeight(Tree tree) {

        if (tree.isEmpty()) {
            return 0;
        }

        return getNextNode(tree.getRoot());
    }

    private static int getNextNode(Node node) {

        if (node == null) {
            return 0;
        }

        int levelMax = 0;

        for (Node child : node.getChildren()) {
            int nextNode = getNextNode(child);
            if (nextNode > levelMax) {
                levelMax = nextNode;
            }
        }
        return levelMax + 1;
    }
}

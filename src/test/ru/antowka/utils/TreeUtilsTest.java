package ru.antowka.utils;

import org.junit.Test;
import ru.antowka.model.Node;
import ru.antowka.model.Tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TreeUtilsTest {


    @Test
    public void calculateHeight() {
        int height = TreeUtils.calculateHeight(build());
        System.out.println("Height of tree is " + height);
        assertEquals(height, 5);
    }

    private Tree build() {

        Tree tree = new Tree();

        //level 1 - root
        Node root = new Node(null, 0);
        tree.setRoot(root);

        //level 2
        Node nodeL1N1 = new Node(root, 1);
        Node nodeL1N2 = new Node(root, 2);
        tree.getRoot().getChildren().add(nodeL1N1);
        tree.getRoot().getChildren().add(nodeL1N2);

        //level 3
        Node nodeL2N1 = new Node(nodeL1N1, 3);
        Node nodeL2N2 = new Node(nodeL1N2, 4);
        Node nodeL2N3 = new Node(nodeL1N2, 5);
        nodeL1N1.getChildren().add(nodeL2N1);
        nodeL1N2.getChildren().add(nodeL2N2);
        nodeL1N2.getChildren().add(nodeL2N3);

        //level 4
        Node nodeL3N1 = new Node(nodeL2N1, 6);
        Node nodeL3N2 = new Node(nodeL2N2, 7);
        nodeL2N1.getChildren().add(nodeL3N1);
        nodeL2N2.getChildren().add(nodeL3N2);

        //level 5
        Node nodeL4N1 = new Node(nodeL3N1, 9);
        nodeL3N1.getChildren().add(nodeL4N1);


        return tree;
    }
}
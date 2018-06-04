package ru.antowka.model;

import java.util.LinkedList;
import java.util.List;

public class Node {

    private Node parent;

    private List<Node> children = new LinkedList<>();

    private Integer val;

    public Node() {

    }

    public Node(Node parent, Integer val) {
        this.parent = parent;
        this.val = val;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public boolean isEmpty() {
        return children.isEmpty();
    }
}

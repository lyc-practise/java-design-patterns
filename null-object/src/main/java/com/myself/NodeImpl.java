package com.myself;

public class NodeImpl implements Node {

    private String name;
    private Node left;
    private Node right;

    public NodeImpl(String name, Node left, Node right){
        this.name = name;
        this.left = left;
        this.right = right;
    }


    @Override
    public void walk() {
        System.out.println(name + " walk");
        if(left != null){
            left.walk();
        }
        if(right != null){
            right.walk();
        }
    }

    @Override
    public Node left() {
        return null;
    }

    @Override
    public Node right() {
        return null;
    }

    @Override
    public int treeSize() {
        return 1 + left.treeSize() + right.treeSize();
    }

    @Override
    public String getName() {
        return this.name;
    }
}

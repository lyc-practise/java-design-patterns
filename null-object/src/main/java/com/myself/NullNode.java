package com.myself;

public class NullNode implements Node {

    private String name;
    private static final Node nullNode = new NullNode();

    private NullNode(){
        this.name = "nullNode";
    }

    @Override
    public void walk() {
        /** do nothing **/
        return;
    }

    public static Node instance(){
        return nullNode;
    }

    @Override
    public Node left() {
        return nullNode;
    }

    @Override
    public Node right() {
        return nullNode;
    }

    @Override
    public int treeSize() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }


}

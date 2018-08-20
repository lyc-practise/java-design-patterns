package com.myself;

import com.sun.tools.javap.TypeAnnotationWriter;

public class App {

    public static void main(String[] args) {

        Node root = new NodeImpl("1",
                        new NodeImpl("11",
                                new NodeImpl("111", NullNode.instance(), NullNode.instance()), new NodeImpl("112", NullNode.instance(), NullNode.instance())),
                        new NodeImpl("12",
                                new NodeImpl("121", NullNode.instance(), NullNode.instance()), NullNode.instance()));

        root.walk();
        System.out.println(root.treeSize());



    }
}

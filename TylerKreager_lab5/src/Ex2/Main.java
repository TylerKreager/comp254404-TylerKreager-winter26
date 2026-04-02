package Ex2;

import Ex1.*;

public class Main {
    public static void main(String[] args) {
        LinkedBinaryTree lbt = new LinkedBinaryTree();
        Position<String> root =lbt.addRoot("ICET");

        //
        Position<String> softwarePosition = lbt.addLeft(root, "Software");
        Position<String> networkingPosition = lbt.addRight(root, "Networking");
        Position<String> set = lbt.addLeft(softwarePosition, "SET");
        Position<String> ig = lbt.addRight(softwarePosition, "IG");

        AbstractBinaryTree.ShowingTheWholeTree(lbt, root);
    }
}

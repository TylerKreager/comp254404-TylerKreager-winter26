package Ex1;

public class Main {
    public static void main(String[] args) {
        LinkedBinaryTree lbt = new LinkedBinaryTree();
        Position<String> root =lbt.addRoot("ICET");

        //
        Position<String> softwarePosition = lbt.addLeft(root, "Software");
        Position<String> networkingPosition = lbt.addRight(root, "Networking");
        Position<String> set = lbt.addLeft(softwarePosition, "SET");
        Position<String> ig = lbt.addRight(softwarePosition, "IG");
        //          ICET
        //          /  \
        //         /    \
        //   Software   Network
        //     /  \
        //    /    \
        //  SET    IG
        //
        printPreorder(lbt);
        parenthesize(lbt, root);

        Position<String> next = lbt.preorderNext(networkingPosition);
        System.out.println(next.getElement());

        Position<String> inOrder = lbt.inorderNext(ig);

        System.out.println(inOrder.getElement());

    }

    public static <E> void parenthesize(Tree<E> T, Position<E> p) {
        System.out.print(p.getElement());
        if (T.isInternal(p)) {
            boolean firstTime = true;
            for (Position<E> c : T.children(p)) {
                System.out.print( (firstTime ? " (" : ", ") ); // determine proper punctuation
                firstTime = false;                             // any future passes will get comma
                parenthesize(T, c);                            // recur on child
            }
            System.out.print(")");
        }
    }
    //
    public static <E> void printPreorder(AbstractTree<E> T) {
        for (Position<E> p : T.preorder())
            System.out.println(p.getElement());
    }//
}


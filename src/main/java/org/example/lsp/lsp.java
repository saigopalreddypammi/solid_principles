package org.example.lsp;

class Green1  implements Icolor{

    @Override
    public void getColor() {
        System.out.println("Green1");
    }
}

class Blue1 implements  Icolor{

    @Override
    public void getColor() {
        System.out.println("Blue1");
    }
}


public class lsp {
    public static void main(String[] args) {
        Icolor icolor = new Green1();
        icolor.getColor();
    }
}

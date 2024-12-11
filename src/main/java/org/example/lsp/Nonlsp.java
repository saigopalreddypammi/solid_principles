package org.example.lsp;

class Green{
    public void getColor(){
        System.out.println("Green");
    }
}

class Blue extends Green{
    public void getColor(){
        System.out.println("Blue");
    }
}

public class Nonlsp {
    public static void main(String[] args) {

        // violate LSP because color of green object is blue
        Green green = new Blue();
        green.getColor();
        //output: Blue
    }
}

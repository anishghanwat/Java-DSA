public class InterfacesInJava {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();

        Bear b = new Bear();
        b.eat();
    }

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal by (one step)");
    } 
}


interface Herbivor{
    void eat();
}

interface Carnivor {
    void eat();
}
class Bear implements Herbivor, Carnivor {
    public void eat() {
        System.out.println("Bear eats both plants and animals");
    }
}

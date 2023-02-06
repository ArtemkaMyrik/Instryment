public class Main {
    public static void main(String[] args) {
        Gitara gitara = new Gitara(6);
        Baraban baraban = new Baraban(26);
        Tryba tryba = new Tryba(12);

        Instryment[] instryment = {gitara, baraban, tryba};
        for(Instryment instrym : instryment ){
            instrym.play();
        }

    }
}
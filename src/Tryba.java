public class Tryba implements Instryment {
    int diametr;

    public Tryba(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
    public void play(){
        System.out.println("Играет Труба С Диаметром - " + getDiametr());
    }
}

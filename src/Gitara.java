public class Gitara implements Instryment {
    int kolvostryn;

    public Gitara(int kolvostryn) {
        this.kolvostryn = kolvostryn;
    }

    public int getKolvostryn() {
        return kolvostryn;
    }

    public void setKolvostryn(int kolvostryn) {
        this.kolvostryn = kolvostryn;
    }
    public void play(){
        System.out.println("Играет Гитара С Количеством Струн - " + getKolvostryn());

    }
}

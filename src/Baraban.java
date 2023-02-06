public class Baraban implements Instryment {
    int Razmer;

    public Baraban(int razmer) {
        Razmer = razmer;
    }

    public int getRazmer() {
        return Razmer;
    }

    public void setRazmer(int razmer) {
        Razmer = razmer;
    }
    public void play(){
        System.out.println("Играет Барабан С Размером - " + getRazmer());
    }
}

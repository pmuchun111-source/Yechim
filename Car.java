package Formohirdev;

public class Car {
    private String rang, model, uzatgich_qutisi_turi;
    private int narx;

    public Car (String r, String m, int n, String u){
        this.rang=r;
        this.model=m;
        this.narx=n;
        this.uzatgich_qutisi_turi=u;
    }

    public void axborot () {
        System.out.println("Rangi: " + rang);
        System.out.println("Modeli: " + model);
        System.out.println("Narxi: " + narx);
        System.out.println("Uzatgich qutisi turi: " + uzatgich_qutisi_turi);
    }

    public static void main(String[] args) {
        Car car1 = new Car ("Sariq", "Hyundai", 30000, "avtomat");
        car1.axborot();
    }
}



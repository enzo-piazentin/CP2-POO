package FiapDelivery.model;

public class Rota {
    public pacote p1;
    public caminhao c1;

    public void vai(){
        System.out.println("Levando pacote " + p1.cod + "no veículo " + c1.pl);
    }
}

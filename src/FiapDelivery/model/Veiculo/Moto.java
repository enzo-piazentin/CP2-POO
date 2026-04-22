package FiapDelivery.model.Veiculo;

public class Moto extends Veiculo {
    private boolean hasBau;

    public Moto(String placa, double capacidade, boolean hasBau){
        super(placa, capacidade);
        this.hasBau = hasBau;
    }

    public boolean HasBau() {
        return hasBau;
    }

    public void setHasBau(boolean hasBau) {
        if (hasBau) {
            this.hasBau = hasBau;
            System.out.println("A moto possui um baú para transportar pacotes.");
        } else {
            System.out.println("A moto não possui um baú para transportar pacotes.");
        }
    }
}

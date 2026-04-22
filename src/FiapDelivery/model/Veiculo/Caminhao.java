package FiapDelivery.model.Veiculo;

public class Caminhao extends Veiculo {
    private int numeroEixos;

    public Caminhao(String placa, double capacidade, int numeroEixos) {
        super(placa, capacidade);

        if (numeroEixos <= 0) {
            throw new IllegalArgumentException("Número de eixos deve ser maior que zero");
        }

        this.numeroEixos = numeroEixos;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }
}

package FiapDelivery.model.Veiculo;

public class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {

        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa não pode ser nula ou vazia");
        }

        if (capacidade < 0) {
            throw new IllegalArgumentException("Capacidade não pode ser negativa");
        }

        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidade() {
        return capacidade;
    }
}

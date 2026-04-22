package FiapDelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso) {

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código não pode ser nulo ou vazio");
        }

        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero");
        }

        this.codigo = codigo;
        this.peso = peso;
        this.status = "Pendente";
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    public void atualizarStatus(String novoStatus) {

        if (novoStatus == null || novoStatus.isBlank()) {
            throw new IllegalArgumentException("Status não pode ser nulo ou vazio");
        }

        this.status = novoStatus;
    }
}

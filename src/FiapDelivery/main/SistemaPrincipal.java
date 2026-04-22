package FiapDelivery.main;


import FiapDelivery.model.Pacote;
import FiapDelivery.model.Rota;
import FiapDelivery.model.Veiculo.Caminhao;
import FiapDelivery.model.Veiculo.Moto;
import FiapDelivery.model.Veiculo.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao("ABC1234", 1000, 6);
        Veiculo moto = new Moto("XYZ9999", 50, true);

        Pacote pacote = new Pacote("BR999", 10.5);

        Rota rota1 = new Rota(pacote, caminhao);
        rota1.iniciarEntrega();

        System.out.println("----");

        Rota rota2 = new Rota(pacote, moto);
        rota2.iniciarEntrega();
    }
}

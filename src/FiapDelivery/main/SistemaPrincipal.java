package FiapDelivery.main;

import FiapDelivery.model.Caminhao;
import FiapDelivery.model.Pacote;
import FiapDelivery.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Caminhao c = new Caminhao();
        c.pl = "ABC-1234";
        c.cap = 500.0;

        Pacote pac = new Pacote();
        pac.cod = "BR999";
        pac.p = 10.5;
        pac.s = "Pendente";

        Rota r = new Rota();
        r.p1 = pac;
        r.c1 = c;
        r.vai();
    }
}

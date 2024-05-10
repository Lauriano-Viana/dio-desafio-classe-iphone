package aparelho;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Fazer ligação  via Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação via Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz via Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo a pagina via Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova pagina via Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina via Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica via Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Parado na musica via Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo musica via Iphone");
    }
}

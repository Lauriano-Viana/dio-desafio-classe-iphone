package app;

import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();



        System.out.println("Musica");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        System.out.println(" ");

        System.out.println("Telefone");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println(" ");

        System.out.println("Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
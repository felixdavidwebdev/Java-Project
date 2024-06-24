package com.iphone;

public class Main {
    public static void main(String[] args) {
        iphone meuiphone = new iphone("iPhone 13", "123456789");

        // Testando ReprodutorMusical
        meuiphone.tocar();
        meuiphone.pausar();
        meuiphone.selecionarMusica("Imagine - John Lennon");

        // Testando AparelhoTelefonico
        meuiphone.ligar("123-456-7890");
        meuiphone.atender();
        meuiphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuiphone.exibirPagina("http://www.example.com");
        meuiphone.adicionarNovaAba();
        meuiphone.atualizarPagina();
    }
}


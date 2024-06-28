public class Iphone {
    public static void main(String[] args) {
        var musical = new ReprodutorMusical();
        musical.tocar();
        musical.selecionarMusica("The Weeknd");
        musical.pausar();

        var ligacao = new AparelhoTelefonico();
        ligacao.ligar("(11) 96785-5434");
        ligacao.iniciarCorreioVoz();
        ligacao.atender();

        var navegacao = new NavegadorInternet();
        navegacao.adicionarNovaAba();
        navegacao.exibirPagina("www.github.com");
        navegacao.atualizarPagina();
    }
}
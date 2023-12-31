public class App extends Iphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Come Together");
        iphone.atender();
        iphone.ligar("Ricardo");
        iphone.iniciarCorreioVoz();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("www.google.com");
    }
}

public class Iphone implements RepodutorMusicial, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a musica: " + musica);
    }

    @Override
    public void atender() {
        System.out.println("Atendeu!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void ligar(String pessoa) {
        System.out.println("Ligando para: " + pessoa);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url);
    }
}

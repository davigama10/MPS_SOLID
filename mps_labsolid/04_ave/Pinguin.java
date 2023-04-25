public class Pinguin implements Ave_Plumada {
    String localizacaoAtual;
    int numeroDePenas;

    public Pinguin(int contagemNumeroDePenas) {
        this.numeroDePenas = contagemNumeroDePenas;
    }

    public void trocaPlumagem() {
        this.numeroDePenas -= 1;
    }

    public void nada() {
        this.localizacaoAtual = "na agua";
    }
}

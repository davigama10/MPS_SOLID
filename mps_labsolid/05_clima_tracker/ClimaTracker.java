public class ClimaTracker {
    String condicaoAtual;
    AlertaClima alertaClima;

    public ClimaTracker(AlertaClima alertaClima) {
        this.alertaClima = alertaClima;
    }

    public void setCondicaoAtual(String condicaoClimatica) {
        this.condicaoAtual = condicaoClimatica;
        String alerta = alertaClima.geraClimaAlerta(condicaoClimatica);
        System.out.print(alerta);
    }
}
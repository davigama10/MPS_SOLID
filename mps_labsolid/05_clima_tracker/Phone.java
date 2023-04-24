public class Phone implements AlertaClima {
    public String geraClimaAlerta(String condicaoClimatica) {
        String alerta = "Estar " + condicaoClimatica;
        return alerta;
    }
}
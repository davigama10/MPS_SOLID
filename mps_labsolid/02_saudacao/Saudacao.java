// Código com alterações de acordo com o princípio Open/Closed Principle

public interface EscolherSaudacao {
    public String saudar();
}

public class SaudacaoFormal implements EscolherSaudacao {
    @Override
    public String saudar() {
        return "Bom dia, sr.";
    }
}

public class SaudacaoCasual implements EscolherSaudacao {
    @Override
    public String saudar() {
        return "E aí, blz?";
    }
}

public class SaudacaoIntima implements EscolherSaudacao {
    @Override
    public String saudar() {
        return "Oi querida!";
    }
}

public class SaudacaoQualquer implements EscolherSaudacao {
    @Override
    public String saudar() {
        return "Oi.";
    }
}

public class Saudacao {
    private EscolherSaudacao escolherSaudacao;

    public Saudacao(EscolherSaudacao escolherSaudacao) {
        this.escolherSaudacao = escolherSaudacao;
    }

    public String saudar() {
        return this.escolherSaudacao.saudar();
    }
}

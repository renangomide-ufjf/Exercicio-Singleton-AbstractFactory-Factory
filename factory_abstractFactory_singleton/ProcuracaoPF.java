package padroescriacao.integracao.factory_abstractFactory_singleton;

public class ProcuracaoPF implements Procuracao {

    @Override
    public String emitir() {
        return "Procuração Pessoa Física emitida";
    }
}

package padroescriacao.integracao.factory_abstractFactory_singleton;

public class ProcuracaoPJ implements Procuracao {

    @Override
    public String emitir() {
        return "Procuração Pessoa Jurídica emitida";
    }
}

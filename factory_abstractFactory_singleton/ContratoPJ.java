package padroescriacao.integracao.factory_abstractFactory_singleton;

public class ContratoPJ implements Contrato {

    @Override
    public String emitir() {
        return "Contrato Pessoa Jurídica emitido";
    }
}

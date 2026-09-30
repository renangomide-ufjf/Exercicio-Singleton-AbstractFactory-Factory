package padroescriacao.integracao.factory_abstractFactory_singleton;

public class ContratoPF implements Contrato {

    @Override
    public String emitir() {
        return "Contrato Pessoa Física emitido";
    }
}

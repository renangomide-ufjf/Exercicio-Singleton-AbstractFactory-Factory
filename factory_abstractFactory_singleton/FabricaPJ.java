package padroescriacao.integracao.factory_abstractFactory_singleton;

public class FabricaPJ implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoPJ();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPJ();
    }
}

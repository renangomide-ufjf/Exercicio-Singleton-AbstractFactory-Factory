package padroescriacao.integracao.factory_abstractFactory_singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaPJTest {

    @Test
    void deveEmitirContrato() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Contrato contrato = fabrica.createContrato();
        assertEquals("Contrato Pessoa Jurídica emitido", contrato.emitir());
    }

    @Test
    void deveEmitirProcuracao() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Procuracao procuracao = fabrica.createProcuracao();
        assertEquals("Procuração Pessoa Jurídica emitida", procuracao.emitir());
    }
}

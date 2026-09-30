package padroescriacao.integracao.factory_abstractFactory_singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaPFTest {

    @Test
    void deveEmitirContrato() {
        FabricaAbstrata fabrica = new FabricaPF();
        Contrato contrato = fabrica.createContrato();
        assertEquals("Contrato Pessoa Física emitido", contrato.emitir());
    }

    @Test
    void deveEmitirProcuracao() {
        FabricaAbstrata fabrica = new FabricaPF();
        Procuracao procuracao = fabrica.createProcuracao();
        assertEquals("Procuração Pessoa Física emitida", procuracao.emitir());
    }
}

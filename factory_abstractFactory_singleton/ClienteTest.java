package padroescriacao.integracao.factory_abstractFactory_singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Física emitido", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física emitida", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Jurídica emitido", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Jurídica emitida", cliente.emitirProcuracao());
    }
}

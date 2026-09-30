package padroescriacao.integracao.factory_abstractFactory_singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodoFabricaTest {

    @Test
    void deveRetornarInstanciaSingleton() {
        MetodoFabrica instancia1 = MetodoFabrica.getInstance();
        MetodoFabrica instancia2 = MetodoFabrica.getInstance();
        assertNotNull(instancia1);
        assertSame(instancia1, instancia2);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("Inexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFabricaInvalida() {
        try {
            FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("Invalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarFabricaPFValida() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        assertNotNull(fabrica);
        assertTrue(fabrica instanceof FabricaPF);
    }

    @Test
    void deveRetornarFabricaPJValida() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PJ");
        assertNotNull(fabrica);
        assertTrue(fabrica instanceof FabricaPJ);
    }
}

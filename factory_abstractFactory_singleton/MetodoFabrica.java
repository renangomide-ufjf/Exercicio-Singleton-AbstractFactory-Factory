package padroescriacao.integracao.factory_abstractFactory_singleton;

public class MetodoFabrica {

    private MetodoFabrica() {}

    private static MetodoFabrica instance = new MetodoFabrica();

    public static MetodoFabrica getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.integracao.factory_abstractFactory_singleton.Fabrica" + fabrica);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }
}

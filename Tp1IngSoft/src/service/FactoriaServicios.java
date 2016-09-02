package service;

/**
 * Esta clase aplica el patron Singleton para hacer global el uso de la misma y
 * permitir su acceso desde cualquier lugar de la aplicacion
 *
 * @author Fernández Pablo
 */
public class FactoriaServicios {

    private static FactoriaServicios instancia;

    private FactoriaServicios() {
    }

    public static FactoriaServicios getInstancia() {
        if (instancia == null) {
            instancia = new FactoriaServicios();
        }
        return instancia;
    }

    public IAdaptadorTransporte getAdaptadorTransporte() {
        return new AdaptadorTransporte();
    }

}

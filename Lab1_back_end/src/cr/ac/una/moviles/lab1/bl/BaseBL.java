package cr.ac.una.moviles.lab1.bl;

import cr.ac.una.moviles.lab1.dao.*;
import java.util.LinkedHashMap;

/**
 *
 * @author _Adrian_Prendas_
 */

public class BaseBL {
    private final LinkedHashMap<String, IBaseDAO> daos;

    public BaseBL() {
        daos = new LinkedHashMap();
        daos.put("cr.ac.una.moviles.lab1.domain.Producto", ProductoDao.getInstance());
    }

    public IBaseDAO getDao(String className) {
        return daos.get(className);
    }
}

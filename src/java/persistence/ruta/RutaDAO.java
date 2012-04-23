package persistence.ruta;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import model.Ruta;

/**
 * Esta interfaz define un patron de persistencia DAO para los discos
 */
public interface RutaDAO {
    
    /**
     * Inserta un disco en el sistema de persistencia
     * @param record disco a insertar
     * @return true si hay exito, false en caso contrario
     */
    public boolean createRuta(Ruta ruta);
    
    /**
     * Lee un disco del sistema de persistencia
     * @param id string identificando el disco a leer
     * @return disco solicitado
     */
    public Ruta readRuta(String id);
    
    /**
     * Lista los discos que cumplen las caracteristicas solicitadas.
     * Dejando los campos en null, estos no se tendran en cuenta en la busqueda
     * @param name nombre del disco
     * @param artist artista del disco
     * @param recordLabel distribuidora del disco
     * @param type tipo musical del disco
     * @return ArrayList de Records. Vacio si no se encontraron coincidencias
     */
    public ArrayList<Ruta> listRuta(String origen, String destino);
    
    /**
     * Borra un disco del sistema de persistencia
     * @param id del disco a borrar
     * @return true si hay exito, false en caso contrario
     */
    public boolean deleteRuta(String id);
    
    /**
     * Para facilitar la carga del catalogo
     * @return recordMap mapa con todos los discos
     *
    public Map<UUID,Record> getRecordMap();
    */
    
    /**
     * Metodo para crear la conexion con el sistema de persistencia.
     * En el caso de trabajar contra ficheros la url define parte del nombre
     * @param url
     * @param driver
     * @param user
     * @param password
     * @return true si hay exito, false en caso contrario
     */
    public boolean setUp(String url, String driver, String user, String password);
    
    /**
     * Cierra la conexion con el sistema de persistencia.
     * @return true si hay exito, false en caso contrario
     */
    public boolean disconnect();
}
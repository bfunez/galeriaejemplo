package cr.ac.unadeca.galeria.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Brian on 3/26/18.
 */
@Database(name = GaleriaDB.dbname , version = GaleriaDB.dbversion)
public class GaleriaDB  {
    public static final String  dbname= "galeriaDB";
    public static final int dbversion= 2;
}

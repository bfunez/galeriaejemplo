package cr.ac.unadeca.galeria.database.Models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import cr.ac.unadeca.galeria.database.GaleriaDB;

/**
 * Created by Brian on 3/26/18.
 */
@Table(database = GaleriaDB.class)
public class Users {
    @Column
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String username;

    @Column
    public String password;


    @Column
    public String nombre;

    @Column
    public String roll;

}

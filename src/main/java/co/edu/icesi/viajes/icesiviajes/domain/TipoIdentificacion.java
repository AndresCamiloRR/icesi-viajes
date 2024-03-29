package co.edu.icesi.viajes.icesiviajes.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentificacion {

    @Id
    @Column(name = "id_tiid", nullable = false)
    private int idTiid;

    @Column(name = "codigo", nullable = false, length = 5)
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador", nullable = false, length = 10)
    private String usuCreador;

    @Column(name = "usu_modificador", length = 10)
    private String usuModificador;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

}


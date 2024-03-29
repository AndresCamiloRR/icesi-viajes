package co.edu.icesi.viajes.icesiviajes.domain;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tipo_destino")
public class TipoDestino {

    @Id
    @Column(name = "id_tide", nullable = false)
    private int idTide;

    @Column(name = "codigo", nullable = false, length = 5)
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 100, unique = true)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 300)
    private String descripcion;

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

    public int getIdTide() {
        return idTide;
    }

    public void setIdTide(int idTide) {
        this.idTide = idTide;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuCreador() {
        return usuCreador;
    }

    public void setUsuCreador(String usuCreador) {
        this.usuCreador = usuCreador;
    }

    public String getUsuModificador() {
        return usuModificador;
    }

    public void setUsuModificador(String usuModificador) {
        this.usuModificador = usuModificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDestino that = (TipoDestino) o;
        return Objects.equals(idTide, that.idTide) &&
                Objects.equals(codigo, that.codigo) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(fechaModificacion, that.fechaModificacion) &&
                Objects.equals(usuCreador, that.usuCreador) &&
                Objects.equals(usuModificador, that.usuModificador) &&
                Objects.equals(estado, that.estado);
    }
}

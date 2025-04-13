package pe.edu.vallegrande.elsabroson.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long id_producto;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private double precio;

    @Column(name = "estado")
    private String estado  = "ACTIVO";

 


}

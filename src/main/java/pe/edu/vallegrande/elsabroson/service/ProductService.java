package pe.edu.vallegrande.elsabroson.service;

import pe.edu.vallegrande.elsabroson.model.Producto;

import java.util.List;

public interface ProductService  {

    public Producto save(Producto producto);
    public List<Producto> findAll();
    public Producto update(Producto producto);
    public void delete(Long id);
}

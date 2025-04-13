package pe.edu.vallegrande.elsabroson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.elsabroson.model.Producto;
import pe.edu.vallegrande.elsabroson.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductService {


    @Autowired
    ProductoRepository productoRepository;


    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto update(Producto producto) {

        Producto productoExistente = productoRepository.findById(producto.getId_producto()).orElse(null);


        if (productoExistente == null) {
            throw new RuntimeException("Producto con ID " + producto.getId_producto() + " no encontrado.");
        }


        productoExistente.setCategoria(producto.getCategoria());
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setDescripcion(producto.getDescripcion());
        productoExistente.setPrecio(producto.getPrecio());
        productoExistente.setEstado(producto.getEstado());


        return productoRepository.save(productoExistente);
    }


    @Override
    public void delete(Long id) {

        Producto productoExistente = productoRepository.findById(id).orElse(null);

        if (productoExistente == null) {
            throw new RuntimeException("Producto con ID " + id + " no encontrado. No se puede eliminar.");
        }

        productoRepository.deleteById(id);
    }





}

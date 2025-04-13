package pe.edu.vallegrande.elsabroson.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.elsabroson.model.Producto;
import pe.edu.vallegrande.elsabroson.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    ProductService productService;

    // **1. Crear un nuevo producto (POST)**
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productService.save(producto);
    }

    // **2. Obtener todos los productos (GET)**
    @GetMapping
    public List<Producto> getAllProductos() {
        return productService.findAll();
    }

    // **4. Actualizar un producto (PUT)**
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId_producto(id); // Asegurarse de establecer el ID del producto que se actualiza
        return productService.update(producto);
    }

    // **5. Eliminar un producto por ID (DELETE)**
    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productService.delete(id);
    }



}

package com.example.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.app.exception.Mensaje;
import com.example.springboot.app.model.Product;
import com.example.springboot.app.service.ProductService;

@RestController
@RequestMapping("/ropa")
public class ProductController {


	@Autowired
	private ProductService productService;


	@GetMapping("/listaropa")
	public ResponseEntity<?> getAllProduct() {
		List<Product> lista = productService.getAllProduct();
		if(lista.isEmpty()){
			return new ResponseEntity<>(new Mensaje("Sin productos en la Base de Datos"), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(productService.getAllProduct());
	}


	@GetMapping("/detalleropa/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable long id) {
		return ResponseEntity.ok().body(productService.getProductById(id));
	}
	

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/creaproducto")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return ResponseEntity.ok().body(this.productService.createProduct(product));
	}

	@PutMapping("/actualizarproducto/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product) {
		product.setId(id);
		return ResponseEntity.ok().body(this.productService.updateProduct(product));
	}


	@DeleteMapping("/eliminaproducto/{id}")
	public HttpStatus deleteProduct(@PathVariable long id) {
		this.productService.deleteProduct(id);
		return HttpStatus.OK;
	}
}
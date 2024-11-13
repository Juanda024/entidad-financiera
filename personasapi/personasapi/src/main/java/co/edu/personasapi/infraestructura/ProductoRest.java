package co.edu.personasapi.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.edu.personasapi.domain.PoductoService;
import co.edu.personasapi.domain.Producto;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/productorest"})

public class ProductoRest {

	@Autowired
	PoductoService service;
	
	@GetMapping("/getall")
	public List<Producto> listar(){
		return service.Listar();
	}
	
	@PostMapping("/submit")
	public Producto agregar(@RequestBody Producto p){
		return service.add(p);
	}
	
	@GetMapping("/getbyid/{id}")
	 public Producto listarId(@PathVariable("id") int id){
	 return service.listarId(id);
	 }

	 @PutMapping("/editar/{id}")
	 public Producto editar(@RequestBody Producto p, @PathVariable("id") int id){
	 p.setId_pr(id);
	 return service.edit(p);
	 }

	 @DeleteMapping("/eliminar/{id}")
	 public Producto eliminar(@RequestBody Producto p, @PathVariable("id") int id){
	 p.setId_pr(id);
	 return service.delete(id);
	 }
	
}

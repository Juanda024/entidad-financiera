package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicelmp implements PoductoService{
	
	@Autowired
	private ProductoRepository repositorio;
	
	@Override
	public List<Producto> Listar() {
		return repositorio.findAll();
	}
	@Override
	public Producto listarId(int id) {
		return repositorio.findById(id);
	}
	@Override
	public Producto add(Producto p) {
	return repositorio.save(p);
	}
	@Override
	public Producto edit(Producto p) {
	return repositorio.save(p);
	}
	@Override
	public Producto delete(int id) {
		Producto p = repositorio.findById(id);
	     
	     if (p != null){
	          
	         repositorio.delete(p);
	        
	     }
		return p;
	}

}

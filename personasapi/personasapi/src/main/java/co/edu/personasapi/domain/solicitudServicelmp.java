package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class solicitudServicelmp {
	
	@Autowired
	private solicitudRepository repositorio;
	
	
	public List<solicitud> listar() {
		return repositorio.findAll();
	}
	
	
	public solicitud listarId(int id) {
		return repositorio.findById(id);
	}
	
	
	public solicitud add(solicitud p) {
	return repositorio.save(p);
	}
	
	
	public solicitud edit(solicitud p) {
	return repositorio.save(p);
	}
	
	
	public solicitud delete(int id) {
		solicitud p = repositorio.findById(id);
	     
	     if (p != null){
	          
	         repositorio.delete(p);
	        
	     }
	      
	      return p;
	 }

}

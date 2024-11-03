package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ProductoRepository extends Repository<Producto, Integer>{
	
	List<Producto> FindAll();
	
	Producto findById(int id);
	Producto save(Producto p);
	void delete(Producto p); 
	
}

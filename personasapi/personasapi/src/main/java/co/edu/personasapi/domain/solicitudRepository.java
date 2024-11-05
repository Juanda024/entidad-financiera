package co.edu.personasapi.domain;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface solicitudRepository extends Repository<solicitud, Integer> {
	
	List<solicitud> findAll();
	solicitud findById(int id);
	solicitud save(solicitud s);
	void delete(solicitud s);
	
}

package co.edu.personasapi.domain;

import java.util.List;

public interface solicitudService {
	
	List<solicitud> listar();
	solicitud listarid(int id);
	solicitud add(solicitud s);
	solicitud edit(solicitud s);
	solicitud delete(int id);
	
}

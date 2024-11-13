package co.edu.personasapi.domain;
import java.util.List;

public interface solicitudService {
	solicitud listarId(int id);
	solicitud add(solicitud p);
	solicitud edit(solicitud p);
	solicitud delete(int id);

	List<solicitud> Listar();

	
}

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
import co.edu.personasapi.domain.solicitud;
import co.edu.personasapi.domain.solicitudService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/solicitudrest" })

public class SolicitudRest {

	@Autowired
	private solicitudService service;

	@GetMapping("/getall")
	public List<solicitud> listar() {
		return service.Listar();
	}

	@PostMapping("/submit")
	public solicitud agregar(@RequestBody solicitud p) {
		return service.add(p);
	}

	@GetMapping("/getbyid/{id}")
	public solicitud listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}

	@PutMapping("/editar/{id}")
	public solicitud editar(@RequestBody solicitud p, @PathVariable("id") int id) {
		p.setId_pr(id);
		return service.edit(p);
	}

	@DeleteMapping("/eliminar/{id}")
	public solicitud eliminar(@RequestBody solicitud p, @PathVariable("id") int id) {
		p.setId_pr(id);
		return service.delete(id);
	}

}

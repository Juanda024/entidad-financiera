
package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPersonaServiceImp implements TipoPersonaService{

 @Autowired
 private TipoPersonaRepository tp_repositorio;
 
 @Override
 public List<TipoPersona> listar() {
 return tp_repositorio.findAll();
 }
 
 @Override
 public TipoPersona listarId(int id) {
 return tp_repositorio.findById(id);
 }
 
 @Override
 public TipoPersona add(TipoPersona p) {
 return tp_repositorio.save(p);
 }
 
 @Override
 public TipoPersona edit(TipoPersona p) {
 return tp_repositorio.save(p);
 }
 
 @Override
 public TipoPersona delete(int id) {
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 }
 
}

package co.unicauca.demo.interfaceService;
import java.util.List;
import java.util.Optional;

import co.unicauca.demo.modelo.*;

public interface ICervezaService {
	public List<Cerveza>listar();
	public Optional<Cerveza>listarId(int id);
	public int save(Cerveza c);
	public void delete(int id);
}

package co.unicauca.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unicauca.demo.interfaceService.ICervezaService;
import co.unicauca.demo.interfaces.ICerveza;
import co.unicauca.demo.modelo.Cerveza;

@Service
public class CervezaService implements ICervezaService{
	//para que el auto?
	@Autowired
	private ICerveza data;
	
	
	@Override
	public List<Cerveza> listar() {
		//tipo lista
		return (List<Cerveza>) data.findAll();
	}

	@Override
	public Optional<Cerveza> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(Cerveza c) {
		int res=0;
		Cerveza cerveza = data.save(c);
		if(!cerveza.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	
	
}

package co.unicauca.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.unicauca.demo.modelo.Cerveza;


@Repository
public interface ICerveza extends CrudRepository<Cerveza,Integer>{
	
	
	
}

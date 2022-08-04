package co.unicauca.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cerveza")
public class Cerveza {
	//hacer referencia que product id es el id de la tabla cerveza
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    /**
     * Peso del producto, en ml.
     *
     */
    private double weight;


    public Cerveza() {
    }


	public Cerveza(int id, String name, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
}

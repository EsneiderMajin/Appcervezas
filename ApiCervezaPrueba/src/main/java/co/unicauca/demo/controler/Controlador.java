package co.unicauca.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import co.unicauca.demo.interfaceService.ICervezaService;
import co.unicauca.demo.modelo.Cerveza;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private ICervezaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Cerveza>cervezas = service.listar();
		model.addAttribute("cervezas",cervezas);
		return "index";
	}
	
	//para mostrar el formulario
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("cerveza",new Cerveza());
		return "form";
	}
	
	//@Valid @Validate @Value cual? ninguno :v
	@PostMapping("/save")
	public String save(Cerveza c, Model model) {
		service.save(c);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Cerveza>cerveza=service.listarId(id);
		//enviar al formulario para mostrar
		model.addAttribute("cerveza",cerveza);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);	
		return "redirect:/listar";
	}
	
	
	
}

package pe.edu.upeu.lp2_exa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lp2_exa.service.DetallePedidoService;

@RestController
@RequestMapping("/detalle")
public class DetallePedidoController {

	@Autowired
	private DetallePedidoService detallePedido;
	
	@GetMapping("/lista")
	public List<Map<String, Object>> listar(){
		return detallePedido.readAll();
	}
}

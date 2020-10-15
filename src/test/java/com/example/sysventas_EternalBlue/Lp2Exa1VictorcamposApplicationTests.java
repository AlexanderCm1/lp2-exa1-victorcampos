package com.example.sysventas_EternalBlue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.lp2_exa.dao.DetallePedidoDao;

@SpringBootTest
class Lp2Exa1VictorcamposApplicationTests {
	
	@Autowired
	private DetallePedidoDao detallePedido;

	@Test
	void contextLoads() {
		System.out.println(detallePedido.readAll());
	}

}

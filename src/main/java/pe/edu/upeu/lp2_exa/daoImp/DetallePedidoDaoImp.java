package pe.edu.upeu.lp2_exa.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2_exa.dao.DetallePedidoDao;

@Repository
public class DetallePedidoDaoImp implements DetallePedidoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM detalle_pedido";
		return jdbcTemplate.queryForList(sql);
	}
	
}

package pe.edu.upeu.lp2_exa.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2_exa.dao.DetallePedidoDao;
import pe.edu.upeu.lp2_exa.service.DetallePedidoService;

@Service
public class DetallePedidoServiceImp implements DetallePedidoService{
	@Autowired
	private DetallePedidoDao detallePedidoDao;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detallePedidoDao.readAll();
	}

}

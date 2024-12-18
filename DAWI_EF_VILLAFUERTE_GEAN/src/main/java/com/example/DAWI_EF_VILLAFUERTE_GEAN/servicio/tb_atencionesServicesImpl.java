package com.example.DAWI_EF_VILLAFUERTE_GEAN.servicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_atenciones;
import com.example.DAWI_EF_VILLAFUERTE_GEAN.repositorio.Tb_atencionesRepositorio;

@Service

public class tb_atencionesServicesImpl implements tb_atencionesServicio {
	@Autowired
	private Tb_atencionesRepositorio repositorio;
	@Override
	public List<tb_atenciones> listar_tb_atenciones() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public tb_atenciones guardar_tb_atenciones_registro(tb_atenciones data) {
		// TODO Auto-generated method stub
		return repositorio.save(data);
	}

	@Override
	public tb_atenciones obtener_tb_atenciones_registro(long codAtencion) {
		// TODO Auto-generated method stub
		return repositorio.findById(codAtencion).get();
	}

	@Override
	public tb_atenciones actualizar_tb_atenciones(tb_atenciones data) {
		// TODO Auto-generated method stub
		return repositorio.save(data);
	}

	@Override
	public void eliminar_registro_tb_atenciones(long codAtencion) {
		// TODO Auto-generated method stub
		repositorio.deleteById(codAtencion);
	}

}

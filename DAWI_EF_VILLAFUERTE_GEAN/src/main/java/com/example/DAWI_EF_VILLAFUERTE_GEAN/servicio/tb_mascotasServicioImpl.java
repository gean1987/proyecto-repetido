package com.example.DAWI_EF_VILLAFUERTE_GEAN.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_atenciones;
import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_mascotas;
import com.example.DAWI_EF_VILLAFUERTE_GEAN.repositorio.Tb_mascotasRepositorio;

@Service

public class tb_mascotasServicioImpl implements tb_mascotasServicio{
	@Autowired
	private Tb_mascotasRepositorio repositorio;

	@Override
	public List<tb_mascotas> listar_tb_mascotas() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public tb_mascotas guardar_tb_mascotas_registro(tb_mascotas data) {
		// TODO Auto-generated method stub
		return repositorio.save(data);
	}

	@Override
	public tb_mascotas obtener_tb_mascotas_registro(long codMascota) {
		// TODO Auto-generated method stub
		return repositorio.findById(codMascota).get();	
	}

	@Override
	public tb_mascotas actualizar_tb_mascotas(tb_mascotas data) {
		// TODO Auto-generated method stub
		return repositorio.save(data);
	}

	@Override
	public void eliminar_registro_tb_mascotas(long codMascota) {
		// TODO Auto-generated method stub
		repositorio.deleteById(codMascota);		

	}

}

package com.example.DAWI_EF_VILLAFUERTE_GEAN.servicio;
import java.util.List;

import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_mascotas;

public interface tb_mascotasServicio {
	public List<tb_mascotas> listar_tb_mascotas();
	public tb_mascotas guardar_tb_mascotas_registro(tb_mascotas mascota);
	
	public tb_mascotas obtener_tb_mascotas_registro(long codMascota);
	public tb_mascotas actualizar_tb_mascotas(tb_mascotas data);

	public void eliminar_registro_tb_mascotas(long codMascota);
}

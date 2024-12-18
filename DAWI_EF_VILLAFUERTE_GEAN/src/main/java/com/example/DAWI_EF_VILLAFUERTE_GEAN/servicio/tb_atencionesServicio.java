package com.example.DAWI_EF_VILLAFUERTE_GEAN.servicio;
import java.util.List;

import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_atenciones;

public interface tb_atencionesServicio {
	public List<tb_atenciones> listar_tb_atenciones();
	public tb_atenciones guardar_tb_atenciones_registro(tb_atenciones data);
	
	public tb_atenciones obtener_tb_atenciones_registro(long codAtencion);
	public tb_atenciones actualizar_tb_atenciones(tb_atenciones data);

	public void eliminar_registro_tb_atenciones(long codAtencion);
}

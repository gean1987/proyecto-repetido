package com.example.DAWI_EF_VILLAFUERTE_GEAN.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_atenciones;
import com.example.DAWI_EF_VILLAFUERTE_GEAN.servicio.tb_atencionesServicesImpl;


import jakarta.websocket.server.PathParam;

@Controller
public class tb_atencionesController {
	@Autowired
    private tb_atencionesServicesImpl servicio;

  // Listar productos
    @GetMapping({"/listar_tb_atenciones"})
    public String listarRegistros_Atenciones(Model modelo) {
        modelo.addAttribute("dataAtencion", servicio.listar_tb_atenciones());
        return "listar_tb_atenciones"; // Asegúrate de tener el archivo producto.html en templates/
    }

    @GetMapping("/tb_atenciones/nuevo")
    public String mostrarFormularioCrearRegistro_Atencion(Model modelo) {
        modelo.addAttribute("data", new tb_atenciones()); // Cambiado de "producto" a "atencion"
        return "crear_tb_atenciones"; 
    }

    @PostMapping("/listar_tb_atenciones")
    public String guardarAtencion(@ModelAttribute("data") tb_atenciones data) { // Cambiado de "producto" a "atencion"
        servicio.guardar_tb_atenciones_registro(data);
        return "redirect:/listar_tb_atenciones"; // Cambiado a minúscula para coincidir con listarProducto()
    }
    @GetMapping("/tb_atenciones/editar/{id}")
    public String mostrarFormularioEditarRegistro_Atencion(@PathVariable("id") Long id, Model modelo) {
        modelo.addAttribute("registro", servicio.obtener_tb_atenciones_registro(id));
        return "editar_tb_atenciones.html"; // Asegúrate de que el archivo exista
    }




    @PostMapping("/tb_atenciones/{codAtencion}")
    public String actualizarProducto_Atencion(@PathVariable Long codAtencion ,@ModelAttribute("tb_atenciones") tb_atenciones producto, Model modelo) {
    	tb_atenciones productoexiste=servicio.obtener_tb_atenciones_registro(codAtencion);
    	productoexiste.setCod_atencion(codAtencion);
    	productoexiste.setNombre_cliente(producto.getNombre_cliente());
    	productoexiste.setTipo_atencion(producto.getTipo_atencion());
    	
    	productoexiste.setFecha_atencion(producto.getFecha_atencion());

    	productoexiste.setHora(producto.getHora());
    	productoexiste.setEstado(producto.getEstado());

    	servicio.actualizar_tb_atenciones(productoexiste);
    	return "redirect:/listar_tb_atenciones";
    }


    @GetMapping("/eliminar_registro_atencion/{id}")
    public String eliminarAtencion(@PathVariable Long id) {
        servicio.eliminar_registro_tb_atenciones(id);
        return "redirect:/listar_tb_atenciones";
    }

    

}


package com.example.DAWI_EF_VILLAFUERTE_GEAN.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_mascotas;
import com.example.DAWI_EF_VILLAFUERTE_GEAN.servicio.tb_mascotasServicioImpl;


import jakarta.websocket.server.PathParam;

@Controller
public class tb_mascotasController {
	 @Autowired
	    private tb_mascotasServicioImpl servicio;

	  // Listar productos
	    @GetMapping({"/listar_tb_mascotas", "/"})
	    public String listarRegistros(Model modelo) {
	        modelo.addAttribute("dataMascota", servicio.listar_tb_mascotas());
	        return "listar_tb_mascotas"; // Asegúrate de tener el archivo producto.html en templates/
	    }

	    @GetMapping("/tb_mascotas/nuevo")
	    public String mostrarFormularioCrearRegistro(Model modelo) {
	        modelo.addAttribute("data", new tb_mascotas()); // Cambiado de "producto" a "atencion"
	        return "crear_tb_mascotas"; 
	    }

	    @PostMapping("/listar_tb_mascotas")
	    public String guardarProducto(@ModelAttribute("data") tb_mascotas data) { // Cambiado de "producto" a "atencion"
	        servicio.guardar_tb_mascotas_registro(data);
	        return "redirect:/listar_tb_mascotas"; // Cambiado a minúscula para coincidir con listarProducto()
	    }
	    @GetMapping("/tb_mascotas/editar/{id}")
	    public String mostrarFormularioEditarRegistro(@PathVariable("id") Long id, Model modelo) {
	        modelo.addAttribute("registro", servicio.obtener_tb_mascotas_registro(id));
	        return "editar_tb_mascotas.html"; // Asegúrate de que el archivo exista
	    }




	    @PostMapping("/tb_mascotas/{codMascota}")
	    public String actualizarProducto(@PathVariable Long codMascota ,@ModelAttribute("tb_mascotas") tb_mascotas producto, Model modelo) {
	    	tb_mascotas productoexiste=servicio.obtener_tb_mascotas_registro(codMascota);
	    	productoexiste.setCod_mascota(codMascota);
	    	productoexiste.setNombre_dueno(producto.getNombre_dueno());
	    	productoexiste.setNombre_mascota(producto.getNombre_mascota());
	    	
	    	productoexiste.setPeso_de_mascotas(producto.getPeso_de_mascotas());

	    	productoexiste.setTipo_mascotas(producto.getTipo_mascotas());
	    
	    	servicio.actualizar_tb_mascotas(productoexiste);
	    	return "redirect:/listar_tb_mascotas";
	    }


	    @GetMapping("/eliminar_registro/{idproducto}")
	    public String eliminarProducto(@PathVariable Long idproducto) {
	        servicio.eliminar_registro_tb_mascotas(idproducto);
	        return "redirect:/listar_tb_mascotas";
	    }

	    
	
}


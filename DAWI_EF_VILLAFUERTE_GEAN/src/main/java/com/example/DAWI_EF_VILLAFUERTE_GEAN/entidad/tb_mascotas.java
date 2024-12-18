package com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_mascotas")
public class tb_mascotas {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long cod_mascota;

	    @Column(name="nombre_mascota", nullable=false, length=45)
	    private String nombre_mascota;

	    @Column(name="nombre_dueno", nullable=false, length=45) // Cambio aquí: Evitamos la "ñ"
	    private String nombre_dueno;

	    @Column(name="peso_de_mascotas", nullable=false)
	    private float peso_de_mascotas; // Se cambió de Double a float para coincidir con la BD (opcional)

	    @Column(name="tipo_mascotas", nullable=false, length=45)
	    private String tipo_mascotas;

		
	@Override
	public String toString() {
		return "tb_mascotas [cod_mascota=" + cod_mascota + ", nombre_mascota=" + nombre_mascota + ", nombre_Dueño="
				+ nombre_dueno + ", peso_de_mascotas=" + peso_de_mascotas + ", tipo_mascotas=" + tipo_mascotas + "]";
	}
	
	



	public tb_mascotas(long cod_mascota, String nombre_mascota, String nombre_dueno, float peso_de_mascotas,
			String tipo_mascotas) {
		super();
		this.cod_mascota = cod_mascota;
		this.nombre_mascota = nombre_mascota;
		this.nombre_dueno = nombre_dueno;
		this.peso_de_mascotas = peso_de_mascotas;
		this.tipo_mascotas = tipo_mascotas;
	}





	public tb_mascotas() {
		
	}

	 // Getters y Setters
    public long getCod_mascota() {
        return cod_mascota;
    }

    public void setCod_mascota(long cod_mascota) {
        this.cod_mascota = cod_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getNombre_dueno() {
        return nombre_dueno;
    }

    public void setNombre_dueno(String nombre_dueno) {
        this.nombre_dueno = nombre_dueno;
    }

    public float getPeso_de_mascotas() {
        return peso_de_mascotas;
    }

    public void setPeso_de_mascotas(float peso_de_mascotas) {
        this.peso_de_mascotas = peso_de_mascotas;
    }

    public String getTipo_mascotas() {
        return tipo_mascotas;
    }

    public void setTipo_mascotas(String tipo_mascotas) {
        this.tipo_mascotas = tipo_mascotas;
    }

}

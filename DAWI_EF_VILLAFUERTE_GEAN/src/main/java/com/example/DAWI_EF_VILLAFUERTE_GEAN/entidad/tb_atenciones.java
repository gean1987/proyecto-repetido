package com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_atenciones")
public class tb_atenciones {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long cod_atencion;

	@Column(name="nombre_cliente",nullable=false,length=45)
	private String nombre_cliente;

	@Column(name="tipo_atencion",nullable=false,length=45)
	private String tipo_atencion;

	@Column(name = "fecha_atencion", nullable = false)
	private LocalDateTime fecha_atencion; // Cambiado a LocalDateTime
	@Column(name = "hora", nullable = false)
    private LocalTime hora;

	
	@Column(name="estado",nullable=false,length=45)
	private String estado;
	
	public tb_atenciones(long cod_atencion, String nombre_cliente, String tipo_atencion, LocalDateTime fecha_atencion,
			LocalTime hora, String estado) {
		super();
		this.cod_atencion = cod_atencion;
		this.nombre_cliente = nombre_cliente;
		this.tipo_atencion = tipo_atencion;
		this.fecha_atencion = fecha_atencion;
		this.hora = hora;
		this.estado = estado;
	}

	public tb_atenciones()
	{
		
	}
	@Override
	public String toString() {
		return "tb_atenciones [cod_atencion=" + cod_atencion + ", nombre_cliente=" + nombre_cliente + ", tipo_atencion="
				+ tipo_atencion + ", fecha_atencion=" + fecha_atencion + ", hora=" + hora + ", estado=" + estado + "]";
	}


	public long getCod_atencion() {
		return cod_atencion;
	}


	public void setCod_atencion(long cod_atencion) {
		this.cod_atencion = cod_atencion;
	}


	public String getNombre_cliente() {
		return nombre_cliente;
	}


	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}


	public String getTipo_atencion() {
		return tipo_atencion;
	}


	public void setTipo_atencion(String tipo_atencion) {
		this.tipo_atencion = tipo_atencion;
	}


	public LocalDateTime getFecha_atencion() {
		return fecha_atencion;
	}


	public void setFecha_atencion(LocalDateTime fecha_atencion) {
		this.fecha_atencion = fecha_atencion;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	
	
	
	
}

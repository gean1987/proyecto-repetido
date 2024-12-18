package com.example.DAWI_EF_VILLAFUERTE_GEAN.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_atenciones;
import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_mascotas;

@Repository
public interface Tb_mascotasRepositorio  extends JpaRepository<tb_mascotas,Long> {

}

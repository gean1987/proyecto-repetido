package com.example.DAWI_EF_VILLAFUERTE_GEAN.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DAWI_EF_VILLAFUERTE_GEAN.entidad.tb_atenciones;

@Repository
public interface Tb_atencionesRepositorio  extends JpaRepository<tb_atenciones,Long> {

}

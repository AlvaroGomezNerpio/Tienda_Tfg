package com.proyecto.TFG.repositorios;

import com.proyecto.TFG.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findOneByEmail(String email);

//    @Query(value = "SELECT u FROM usuario u WHERE u.rol = :id")
//    List<Usuario> getUsersByRolId(@Param("id") Long id);

    List<Usuario> findByRolId(Long rolId);

}

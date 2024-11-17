package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Usuario;
import com.kciao.GS24.domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findById(Integer id);
    List<Usuario> findAll();
    Optional<Usuario> updateById(Integer id, Usuario usuario);
    void deleteById(Integer id);
}

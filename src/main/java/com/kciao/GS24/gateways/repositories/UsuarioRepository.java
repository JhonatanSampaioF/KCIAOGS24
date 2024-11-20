package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findById(Integer id);
    List<Usuario> findAll();
    Optional<Usuario> updateById(Integer id, Usuario usuario);
    void deleteById(Integer id);
    @Modifying
    @Transactional
    @Query(value = "CALL inserir_usuario(" +
            ":nome, " +
            ":email)", nativeQuery = true)
    void insertUsuario(String nome, String email);
}

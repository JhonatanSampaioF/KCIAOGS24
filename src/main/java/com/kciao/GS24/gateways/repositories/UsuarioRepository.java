package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Modifying
    @Transactional
    @Query(value = "CALL inserir_usuario(" +
            ":nome, " +
            ":email)", nativeQuery = true)
    void insertUsuario(String nome, String email);
}

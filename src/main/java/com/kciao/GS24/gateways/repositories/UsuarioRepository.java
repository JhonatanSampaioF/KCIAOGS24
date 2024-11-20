package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findById(Integer id);
    Page<Usuario> findAll(Pageable pageable);
    void deleteById(Integer id);
    @Modifying
    @Transactional
    @Query(
            "UPDATE Usuario u SET " +
                    "u.nome = :nome," +
                    "u.email = :email " +
                    "WHERE u.id = :id"
    )
    int updateById(Integer id, String nome, String email);
}

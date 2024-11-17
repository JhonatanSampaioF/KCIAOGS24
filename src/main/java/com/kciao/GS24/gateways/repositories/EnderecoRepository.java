package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    Optional<Endereco> findById(Integer id);
    List<Endereco> findAll();
    Optional<Endereco> updateById(Integer id, Endereco endereco);
    void deleteById(Integer id);
}

package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.EnergiaEolica;
import com.kciao.GS24.domains.EnergiaEolica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnergiaEolicaRepository extends JpaRepository<EnergiaEolica, Integer> {
    Optional<EnergiaEolica> findById(Integer id);
    List<EnergiaEolica> findAll();
    Optional<EnergiaEolica> updateById(Integer id, EnergiaEolica energiaEolica);
    void deleteById(Integer id);
}

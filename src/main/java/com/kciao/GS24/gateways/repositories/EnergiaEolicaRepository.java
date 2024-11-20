package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.EnergiaEolica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EnergiaEolicaRepository extends JpaRepository<EnergiaEolica, Integer> {
    Optional<EnergiaEolica> findById(Integer id);
    Page<EnergiaEolica> findAll(Pageable pageable);
    Optional<EnergiaEolica> updateById(Integer id, EnergiaEolica energiaEolica);
    void deleteById(Integer id);
}

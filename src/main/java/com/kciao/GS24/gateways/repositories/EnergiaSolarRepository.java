package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.EnergiaSolar;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EnergiaSolarRepository extends JpaRepository<EnergiaSolar, Integer> {
    Optional<EnergiaSolar> findById(Integer id);
    Page<EnergiaSolar> findAll(Pageable pageable);
    void deleteById(Integer id);
    @Modifying
    @Transactional
    @Query(
            "UPDATE EnergiaSolar es SET " +
                    "es.areaPlaca = :areaPlaca," +
                    "es.energiaNecessaria = :energiaNecessaria," +
                    "es.irradiacaoSolar = :irradiacaoSolar " +
                    "WHERE es.id = :id"
    )
    int updateById(Integer id, int areaPlaca, Double energiaNecessaria, Double irradiacaoSolar);
}

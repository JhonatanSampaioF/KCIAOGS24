package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.EnergiaEolica;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EnergiaEolicaRepository extends JpaRepository<EnergiaEolica, Integer> {
    Optional<EnergiaEolica> findById(Integer id);
    Page<EnergiaEolica> findAll(Pageable pageable);
    void deleteById(Integer id);
    @Modifying
    @Transactional
    @Query(
            "UPDATE EnergiaEolica ee SET " +
                    "ee.potenciaNominal = :potenciaNominal," +
                    "ee.alturaTorre = :alturaTorre," +
                    "ee.diametroRotor = :diametroRotor, " +
                    "ee.energiaEstimadaGerada = :energiaEstimadaGerada " +
                    "WHERE ee.id = :id"
    )
    int updateById(Integer id, Double potenciaNominal, Double alturaTorre, Double diametroRotor, Double energiaEstimadaGerada);
}

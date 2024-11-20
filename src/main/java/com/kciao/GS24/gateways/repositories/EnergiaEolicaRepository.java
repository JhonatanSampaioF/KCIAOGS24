package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Endereco;
import com.kciao.GS24.domains.EnergiaEolica;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface EnergiaEolicaRepository extends JpaRepository<EnergiaEolica, Integer> {
    @Modifying
    @Transactional
    @Query(value = "CALL inserir_energia_eolica(" +
            ":potenciaNominal, " +
            ":alturaTorre, " +
            ":diametroRotor," +
            ":energiaEstimadaGerada," +
            ":fk_endereco)", nativeQuery = true)
    void insertEnergiaEolica(Double potenciaNominal, Double alturaTorre, Double diametroRotor, Double energiaEstimadaGerada, Endereco fk_endereco);
}

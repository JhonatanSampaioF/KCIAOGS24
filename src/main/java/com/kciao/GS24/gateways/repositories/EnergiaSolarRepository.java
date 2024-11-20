package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Endereco;
import com.kciao.GS24.domains.EnergiaSolar;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface EnergiaSolarRepository extends JpaRepository<EnergiaSolar, Integer> {
    @Modifying
    @Transactional
    @Query(value = "CALL inserir_energia_solar(" +
            ":areaPlaca, " +
            ":irradiacaoSolar," +
            ":fk_endereco)", nativeQuery = true)
    void insertEnergiaSolar(Integer areaPlaca, Double irradiacaoSolar, Endereco fk_endereco);
}

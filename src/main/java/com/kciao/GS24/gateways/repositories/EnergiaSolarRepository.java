package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.EnergiaSolar;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EnergiaSolarRepository extends JpaRepository<EnergiaSolar, Integer> {
    Optional<EnergiaSolar> findById(Integer id);
    List<EnergiaSolar> findAll();
    Optional<EnergiaSolar> updateById(Integer id, EnergiaSolar energiaSolar);
    void deleteById(Integer id);
    @Modifying
    @Transactional
    @Query(value = "CALL inserir_energia_solar(" +
            ":areaPlaca, " +
            ":energiaNecessaria, " +
            ":irradiacaoSolar," +
            ":fk_endereco)", nativeQuery = true)
    void insertEnergiaSolar(Integer areaPlaca, Double energiaNecessaria, Double irradiacaoSolar, Integer fk_endereco);
}

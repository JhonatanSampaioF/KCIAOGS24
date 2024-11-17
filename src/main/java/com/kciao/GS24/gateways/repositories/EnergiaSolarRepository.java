package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.EnergiaSolar;
import com.kciao.GS24.domains.EnergiaSolar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnergiaSolarRepository extends JpaRepository<EnergiaSolar, Integer> {
    Optional<EnergiaSolar> findById(Integer id);
    List<EnergiaSolar> findAll();
    Optional<EnergiaSolar> updateById(Integer id, EnergiaSolar energiaSolar);
    void deleteById(Integer id);
}

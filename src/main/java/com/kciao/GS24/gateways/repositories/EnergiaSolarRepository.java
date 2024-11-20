package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.EnergiaSolar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EnergiaSolarRepository extends JpaRepository<EnergiaSolar, Integer> {
    Optional<EnergiaSolar> findById(Integer id);
    Page<EnergiaSolar> findAll(Pageable pageable);
    Optional<EnergiaSolar> updateById(Integer id, EnergiaSolar energiaSolar);
    void deleteById(Integer id);
}

package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CrudEnergiaSolar {
    EnergiaSolarResponseDto save(EnergiaSolarRequestPostDto energiaSolar);
    Optional<EnergiaSolarResponseDto> findById(Integer id);
    Page<EnergiaSolarResponseDto> findAll(Pageable pageable);
    Optional<EnergiaSolarResponseDto> update(Integer id, EnergiaSolarRequestPatchDto energiaSolar);
    void delete(Integer id);
}

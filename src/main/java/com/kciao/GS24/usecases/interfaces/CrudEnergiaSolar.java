package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudEnergiaSolar {
    EnergiaSolarResponseDto save(EnergiaSolarRequestPostDto energiaSolar);
    Optional<EnergiaSolarResponseDto> findById(Integer id);
    List<EnergiaSolarResponseDto> findAll();
    Optional<EnergiaSolarResponseDto> update(Integer id, EnergiaSolarRequestPatchDto energiaSolar);
    void delete(Integer id);
}

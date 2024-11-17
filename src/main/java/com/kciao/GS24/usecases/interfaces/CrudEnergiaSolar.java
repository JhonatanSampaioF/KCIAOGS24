package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.EnergiaSolarRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudEnergiaSolar {
    EnergiaSolarResponseDto save(EnergiaSolarRequestDto energiaSolarRequestDto);
    Optional<EnergiaSolarResponseDto> findById(int id);
    List<EnergiaSolarResponseDto> findAll();
    Optional<EnergiaSolarResponseDto> update(int id, EnergiaSolarRequestDto energiaSolarRequestDto);
    void delete(int id);
}

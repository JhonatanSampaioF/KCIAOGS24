package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.EnergiaEolicaRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudEnergiaEolica {
    EnergiaEolicaResponseDto save(EnergiaEolicaRequestDto energiaEolicaRequestDto);
    Optional<EnergiaEolicaResponseDto> findById(int id);
    List<EnergiaEolicaResponseDto> findAll();
    Optional<EnergiaEolicaResponseDto> update(int id, EnergiaEolicaRequestDto energiaEolicaRequestDto);
    void delete(int id);
}

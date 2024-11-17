package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudEnergiaEolica {
    EnergiaEolicaResponseDto save(EnergiaEolicaRequestPostDto energiaEolica);
    Optional<EnergiaEolicaResponseDto> findById(Integer id);
    List<EnergiaEolicaResponseDto> findAll();
    Optional<EnergiaEolicaResponseDto> update(Integer id, EnergiaEolicaRequestPatchDto energiaEolica);
    void delete(Integer id);
}

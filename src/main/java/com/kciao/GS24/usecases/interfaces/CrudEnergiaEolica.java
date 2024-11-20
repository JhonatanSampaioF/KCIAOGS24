package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CrudEnergiaEolica {
    EnergiaEolicaResponseDto save(EnergiaEolicaRequestPostDto energiaEolica);
    Optional<EnergiaEolicaResponseDto> findById(Integer id);
    Page<EnergiaEolicaResponseDto> findAll(Pageable pageable);
    Optional<EnergiaEolicaResponseDto> update(Integer id, EnergiaEolicaRequestPatchDto energiaEolica);
    void delete(Integer id);
}

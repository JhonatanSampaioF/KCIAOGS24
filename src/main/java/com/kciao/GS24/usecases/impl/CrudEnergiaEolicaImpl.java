package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.requests.EnergiaEolicaRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEnergiaEolica;

import java.util.List;
import java.util.Optional;

public class CrudEnergiaEolicaImpl implements CrudEnergiaEolica {
    @Override
    public EnergiaEolicaResponseDto save(EnergiaEolicaRequestDto energiaEolicaRequestDto) {
        return null;
    }

    @Override
    public Optional<EnergiaEolicaResponseDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<EnergiaEolicaResponseDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<EnergiaEolicaResponseDto> update(Integer id, EnergiaEolicaRequestDto energiaEolicaRequestDto) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}

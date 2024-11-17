package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.requests.EnergiaSolarRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEnergiaSolar;

import java.util.List;
import java.util.Optional;

public class CrudEnergiaSolarImpl implements CrudEnergiaSolar {
    @Override
    public EnergiaSolarResponseDto save(EnergiaSolarRequestDto energiaSolarRequestDto) {
        return null;
    }

    @Override
    public Optional<EnergiaSolarResponseDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<EnergiaSolarResponseDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<EnergiaSolarResponseDto> update(Integer id, EnergiaSolarRequestDto energiaSolarRequestDto) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}

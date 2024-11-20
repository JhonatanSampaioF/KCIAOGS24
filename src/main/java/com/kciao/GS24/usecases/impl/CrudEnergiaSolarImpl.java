package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.repositories.EnergiaSolarRepository;
import com.kciao.GS24.gateways.requests.EnergiaSolarRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEnergiaSolar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudEnergiaSolarImpl implements CrudEnergiaSolar {

    private final EnergiaSolarRepository energiaSolarRepository;

    @Override
    public EnergiaSolarResponseDto save(EnergiaSolarRequestDto energiaSolar) {
        
        energiaSolarRepository.insertEnergiaSolar(
                energiaSolar.getAreaPlaca(),
                energiaSolar.getIrradiacaoSolar(),
                energiaSolar.getEnergiaEstimadaGerada(),
                energiaSolar.getFk_endereco()
        );
        
        EnergiaSolarResponseDto energiaSolarResponse = EnergiaSolarResponseDto.builder()
                .areaPlaca(energiaSolar.getAreaPlaca())
                .irradiacaoSolar(energiaSolar.getIrradiacaoSolar())
                .energiaEstimadaGerada(energiaSolar.getEnergiaEstimadaGerada())
                .build();
        
        return energiaSolarResponse;
        
    }
}

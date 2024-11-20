package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.repositories.EnergiaSolarRepository;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEnergiaSolar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudEnergiaSolarImpl implements CrudEnergiaSolar {

    private final EnergiaSolarRepository energiaSolarRepository;

    @Override
    public EnergiaSolarResponseDto save(EnergiaSolarRequestPostDto energiaSolar) {
        
        energiaSolarRepository.insertEnergiaSolar(
                energiaSolar.getAreaPlaca(),
                energiaSolar.getEnergiaNecessaria(),
                energiaSolar.getIrradiacaoSolar(),
                energiaSolar.getFk_endereco()
        );
        
        EnergiaSolarResponseDto energiaSolarResponse = EnergiaSolarResponseDto.builder()
                .areaPlaca(energiaSolar.getAreaPlaca())
                .energiaNecessaria(energiaSolar.getEnergiaNecessaria())
                .irradiacaoSolar(energiaSolar.getIrradiacaoSolar())
                .build();
        
        return energiaSolarResponse;
        
    }
}

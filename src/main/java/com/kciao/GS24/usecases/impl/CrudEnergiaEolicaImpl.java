package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.repositories.EnergiaEolicaRepository;
import com.kciao.GS24.gateways.requests.EnergiaEolicaRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEnergiaEolica;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudEnergiaEolicaImpl implements CrudEnergiaEolica {

    private final EnergiaEolicaRepository energiaEolicaRepository;

    @Override
    public EnergiaEolicaResponseDto save(EnergiaEolicaRequestDto energiaEolica) {

        energiaEolicaRepository.insertEnergiaEolica(
            energiaEolica.getPotenciaNominal(),
            energiaEolica.getAlturaTorre(),
            energiaEolica.getDiametroRotor(),
            energiaEolica.getEnergiaEstimadaGerada(),
            energiaEolica.getFk_endereco()
        );

        EnergiaEolicaResponseDto energiaEolicaResponse = EnergiaEolicaResponseDto.builder()
                .potenciaNominal(energiaEolica.getPotenciaNominal())
                .alturaTorre(energiaEolica.getAlturaTorre())
                .diametroRotor(energiaEolica.getDiametroRotor())
                .energiaEstimadaGerada(energiaEolica.getEnergiaEstimadaGerada())
                .build();

        return energiaEolicaResponse;
    }
}

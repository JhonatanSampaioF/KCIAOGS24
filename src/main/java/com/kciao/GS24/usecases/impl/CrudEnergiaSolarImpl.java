package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.domains.EnergiaSolar;
import com.kciao.GS24.gateways.repositories.EnergiaSolarRepository;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEnergiaSolar;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CrudEnergiaSolarImpl implements CrudEnergiaSolar {

    private final EnergiaSolarRepository energiaSolarRepository;

    @Override
    public EnergiaSolarResponseDto save(EnergiaSolarRequestPostDto energiaSolar) {
        
        EnergiaSolar energiaSolarASerCriada = EnergiaSolar.builder()
                .areaPlaca(energiaSolar.getAreaPlaca())
                .energiaNecessaria(energiaSolar.getEnergiaNecessaria())
                .irradiacaoSolar(energiaSolar.getIrradiacaoSolar())
                .fk_endereco(energiaSolar.getFk_endereco())
                .build();
        
        EnergiaSolar energiaSolarSalva = energiaSolarRepository.save(energiaSolarASerCriada);
        
        EnergiaSolarResponseDto energiaSolarResponse = EnergiaSolarResponseDto.builder()
                .areaPlaca(energiaSolarSalva.getAreaPlaca())
                .energiaNecessaria(energiaSolarSalva.getEnergiaNecessaria())
                .irradiacaoSolar(energiaSolarSalva.getIrradiacaoSolar())
                .build();
        
        return energiaSolarResponse;
        
    }

    @Override
    public Optional<EnergiaSolarResponseDto> findById(Integer id) {
        
        Optional<EnergiaSolar> energiaSolar = energiaSolarRepository.findById(id);
        
        if (energiaSolar.isPresent()) {
            EnergiaSolarResponseDto energiaSolarResponse = EnergiaSolarResponseDto.builder()
                    .areaPlaca(energiaSolar.get().getAreaPlaca())
                    .energiaNecessaria(energiaSolar.get().getEnergiaNecessaria())
                    .irradiacaoSolar(energiaSolar.get().getIrradiacaoSolar())
                    .build();
            return Optional.of(energiaSolarResponse);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Page<EnergiaSolarResponseDto> findAll(Pageable pageable) {

        Page<EnergiaSolar> pageEnergiaSolar = energiaSolarRepository.findAll(pageable);

        Page<EnergiaSolarResponseDto> pageEnergiaSolarResponse = pageEnergiaSolar
                .map(energiaSolar -> EnergiaSolarResponseDto.builder()
                        .areaPlaca(energiaSolar.getAreaPlaca())
                        .energiaNecessaria(energiaSolar.getEnergiaNecessaria())
                        .irradiacaoSolar(energiaSolar.getIrradiacaoSolar())
                        .build());

        return pageEnergiaSolarResponse;
    }

    @Override
    public Optional<EnergiaSolarResponseDto> update(Integer id, EnergiaSolarRequestPatchDto energiaSolar) {

        EnergiaSolar energiaSolarASerAtualizada = EnergiaSolar.builder()
                .areaPlaca(energiaSolar.getAreaPlaca())
                .energiaNecessaria(energiaSolar.getEnergiaNecessaria())
                .irradiacaoSolar(energiaSolar.getIrradiacaoSolar())
                .build();

        Optional<EnergiaSolar> energiaSolarAtualizada = energiaSolarRepository.updateById(
                id,
                energiaSolarASerAtualizada
        );

        if (energiaSolarAtualizada.isPresent()) {
            Optional<EnergiaSolarResponseDto> energiaSolarResponse = findById(id);
            if (energiaSolarResponse.isPresent()) {
                return energiaSolarResponse;
            }
            return Optional.empty();
        } else {
            return Optional.empty();
        }

    }

    @Override
    public void delete(Integer id) {
        energiaSolarRepository.deleteById(id);
    }
}

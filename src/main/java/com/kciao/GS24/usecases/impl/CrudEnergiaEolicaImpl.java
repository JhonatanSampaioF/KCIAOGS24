package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.domains.Endereco;
import com.kciao.GS24.domains.EnergiaEolica;
import com.kciao.GS24.gateways.controllers.interfaces.EnderecoController;
import com.kciao.GS24.gateways.controllers.interfaces.EnergiaEolicaController;
import com.kciao.GS24.gateways.repositories.EnderecoRepository;
import com.kciao.GS24.gateways.repositories.EnergiaEolicaRepository;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEnergiaEolica;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
@RequiredArgsConstructor
public class CrudEnergiaEolicaImpl implements CrudEnergiaEolica {

    private final EnergiaEolicaRepository energiaEolicaRepository;
    private final EnderecoRepository enderecoRepository;

    @Override
    public EnergiaEolicaResponseDto save(EnergiaEolicaRequestPostDto energiaEolica) {

        Optional<Endereco> enderecoOptional = enderecoRepository.findById(energiaEolica.getFk_endereco());
        Endereco endereco = enderecoOptional.orElseThrow(() -> new RuntimeException("Endereco não encontrado com o ID: " + energiaEolica.getFk_endereco()));

        EnergiaEolica energiaEolicaASerCriada = EnergiaEolica.builder()
                .potenciaNominal(energiaEolica.getPotenciaNominal())
                .alturaTorre(energiaEolica.getAlturaTorre())
                .diametroRotor(energiaEolica.getDiametroRotor())
                .energiaEstimadaGerada(energiaEolica.getEnergiaEstimadaGerada())
                .fk_endereco(endereco)
                .build();

        EnergiaEolica energiaEolicaSalva = energiaEolicaRepository.save(energiaEolicaASerCriada);

        EnergiaEolicaResponseDto energiaEolicaResponse = EnergiaEolicaResponseDto.builder()
                .potenciaNominal(energiaEolicaSalva.getPotenciaNominal())
                .alturaTorre(energiaEolicaSalva.getAlturaTorre())
                .diametroRotor(energiaEolicaSalva.getDiametroRotor())
                .energiaEstimadaGerada(energiaEolicaSalva.getEnergiaEstimadaGerada())
                .build();

        energiaEolicaResponse.add(
                linkTo(
                        methodOn(EnergiaEolicaController.class)
                                .buscarEnergiaEolica(energiaEolicaSalva.getId())
                ).withSelfRel()
        );

        return energiaEolicaResponse;
    }

    @Override
    public Optional<EnergiaEolicaResponseDto> findById(Integer id) {

        Optional<EnergiaEolica> energiaEolica = energiaEolicaRepository.findById(id);

        if (energiaEolica.isPresent()) {
            EnergiaEolicaResponseDto energiaEolicaResponse = EnergiaEolicaResponseDto.builder()
                    .potenciaNominal(energiaEolica.get().getPotenciaNominal())
                    .alturaTorre(energiaEolica.get().getAlturaTorre())
                    .diametroRotor(energiaEolica.get().getDiametroRotor())
                    .energiaEstimadaGerada(energiaEolica.get().getEnergiaEstimadaGerada())
                    .build();
            return Optional.of(energiaEolicaResponse);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Page<EnergiaEolicaResponseDto> findAll(Pageable pageable) {

        Page<EnergiaEolica> pageEnergiaEolica = energiaEolicaRepository.findAll(pageable);

        Page<EnergiaEolicaResponseDto> pageEnergiaEolicaResponse = pageEnergiaEolica
                .map(energiaEolica -> EnergiaEolicaResponseDto.builder()
                        .potenciaNominal(energiaEolica.getPotenciaNominal())
                        .alturaTorre(energiaEolica.getAlturaTorre())
                        .diametroRotor(energiaEolica.getDiametroRotor())
                        .energiaEstimadaGerada(energiaEolica.getEnergiaEstimadaGerada())
                        .build());

        return pageEnergiaEolicaResponse;
    }

    @Override
    public Optional<EnergiaEolicaResponseDto> update(Integer id, EnergiaEolicaRequestPatchDto energiaEolica) {

        EnergiaEolica energiaEolicaASerAtualizada = EnergiaEolica.builder()
                .potenciaNominal(energiaEolica.getPotenciaNominal())
                .alturaTorre(energiaEolica.getAlturaTorre())
                .diametroRotor(energiaEolica.getDiametroRotor())
                .energiaEstimadaGerada(energiaEolica.getEnergiaEstimadaGerada())
                .build();

        int energiaEolicaAtualizada = energiaEolicaRepository.updateById(
                id,
                energiaEolicaASerAtualizada.getPotenciaNominal(),
                energiaEolicaASerAtualizada.getAlturaTorre(),
                energiaEolicaASerAtualizada.getDiametroRotor(),
                energiaEolica.getEnergiaEstimadaGerada()
        );

        if (energiaEolicaAtualizada != 0) {
            Optional<EnergiaEolicaResponseDto> energiaEolicaResponse = findById(id);

            if (energiaEolicaResponse.isPresent()) {
                return energiaEolicaResponse;
            }
            return Optional.empty();
        } else {
            return Optional.empty();
        }

    }

    @Override
    public void delete(Integer id) {
        energiaEolicaRepository.deleteById(id);
    }
}

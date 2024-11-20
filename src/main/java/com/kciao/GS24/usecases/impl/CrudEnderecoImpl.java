package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.repositories.EnderecoRepository;
import com.kciao.GS24.gateways.requests.EnderecoRequestDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEndereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudEnderecoImpl implements CrudEndereco {

    private final EnderecoRepository enderecoRepository;

    @Override
    public EnderecoResponseDto save(EnderecoRequestDto endereco) {

        enderecoRepository.insertEndereco(
                endereco.getFk_usuario(),
                endereco.getTipoResidencial(),
                endereco.getCep(),
                endereco.getTarifa(),
                endereco.getGastoMensal(),
                endereco.getNome()
                );

        EnderecoResponseDto enderecoResponse = EnderecoResponseDto.builder()
                .tipoResidencial(endereco.getTipoResidencial())
                .nome(endereco.getNome())
                .cep(endereco.getCep())
                .tarifa(endereco.getTarifa())
                .gastoMensal(endereco.getGastoMensal())
                .build();

        return enderecoResponse;
    }
}

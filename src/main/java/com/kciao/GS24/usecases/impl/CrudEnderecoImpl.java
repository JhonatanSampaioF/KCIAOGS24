package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.requests.EnderecoRequestDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudEndereco;

import java.util.List;
import java.util.Optional;

public class CrudEnderecoImpl implements CrudEndereco {
    @Override
    public EnderecoResponseDto save(EnderecoRequestDto enderecoRequestDto) {
        return null;
    }

    @Override
    public Optional<EnderecoResponseDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<EnderecoResponseDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<EnderecoResponseDto> update(Integer id, EnderecoRequestDto enderecoRequestDto) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}

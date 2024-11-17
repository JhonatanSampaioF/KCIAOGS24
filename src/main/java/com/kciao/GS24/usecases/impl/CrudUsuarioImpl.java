package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudUsuario;

import java.util.List;
import java.util.Optional;

public class CrudUsuarioImpl implements CrudUsuario {
    @Override
    public UsuarioResponseDto save(UsuarioRequestDto usuarioRequestDto) {
        return null;
    }

    @Override
    public Optional<UsuarioResponseDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<UsuarioResponseDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<UsuarioResponseDto> update(Integer id, UsuarioRequestDto usuarioRequestDto) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}

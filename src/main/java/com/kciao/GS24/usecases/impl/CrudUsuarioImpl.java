package com.kciao.GS24.usecases.impl;

import com.kciao.GS24.gateways.repositories.UsuarioRepository;
import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import com.kciao.GS24.usecases.interfaces.CrudUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudUsuarioImpl implements CrudUsuario {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponseDto save(UsuarioRequestDto usuario) {

        usuarioRepository.insertUsuario(
                usuario.getNome(),
                usuario.getEmail()
        );

        UsuarioResponseDto usuarioResponse = UsuarioResponseDto.builder()
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .build();

        return usuarioResponse;
    }
}

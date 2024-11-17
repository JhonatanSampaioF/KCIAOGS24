package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudUsuario {
    UsuarioResponseDto save(UsuarioRequestDto usuarioRequestDto);
    Optional<UsuarioResponseDto> findById(int id);
    List<UsuarioResponseDto> findAll();
    Optional<UsuarioResponseDto> update(int id, UsuarioRequestDto usuarioRequestDto);
    void delete(int id);
}

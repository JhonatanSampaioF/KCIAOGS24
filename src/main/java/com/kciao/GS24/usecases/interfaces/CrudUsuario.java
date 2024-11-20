package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CrudUsuario {
    UsuarioResponseDto save(UsuarioRequestDto usuario);
    Optional<UsuarioResponseDto> findById(Integer id);
    Page<UsuarioResponseDto> findAll(Pageable pageable);
    Optional<UsuarioResponseDto> update(Integer id, UsuarioRequestDto usuario);
    void delete(Integer id);
}

package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CrudUsuario {
    UsuarioResponseDto save(UsuarioRequestDto usuario);
}

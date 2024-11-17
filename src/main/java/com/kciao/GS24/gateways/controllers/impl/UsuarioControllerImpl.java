package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.UsuarioController;
import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UsuarioControllerImpl implements UsuarioController {
    @Override
    public ResponseEntity<Optional<UsuarioResponseDto>> buscarUsuario(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<UsuarioResponseDto>> buscarTodosUsuario() {
        return null;
    }

    @Override
    public ResponseEntity<UsuarioResponseDto> criarUsuario(UsuarioRequestDto usuario) {
        return null;
    }

    @Override
    public ResponseEntity<Optional<UsuarioResponseDto>> atualizarUsuario(String id, UsuarioRequestDto usuario) {
        return null;
    }

    @Override
    public void deletarUsuario(String id) {

    }
}

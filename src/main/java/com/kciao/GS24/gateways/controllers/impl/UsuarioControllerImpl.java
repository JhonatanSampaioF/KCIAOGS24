package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.UsuarioController;
import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import com.kciao.GS24.usecases.impl.CrudUsuarioImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UsuarioControllerImpl implements UsuarioController {

    private final CrudUsuarioImpl crudUsuario;

    @Override
    public ResponseEntity<Optional<UsuarioResponseDto>> buscarUsuario(Integer id) {

        Optional<UsuarioResponseDto> usuarioResponse = crudUsuario.findById(id);

        return ResponseEntity.of(Optional.of(usuarioResponse));
    }

    @Override
    public ResponseEntity<List<UsuarioResponseDto>> buscarTodosUsuario() {

        List<UsuarioResponseDto> listUsuarioResponse = crudUsuario.findAll();

        return ResponseEntity.ok(listUsuarioResponse);
    }

    @Override
    public ResponseEntity<UsuarioResponseDto> criarUsuario(UsuarioRequestDto usuario) {

        UsuarioResponseDto usuarioResponse = crudUsuario.save(usuario);

        return ResponseEntity.of(Optional.of(usuarioResponse));
    }

    @Override
    public ResponseEntity<Optional<UsuarioResponseDto>> atualizarUsuario(Integer id, UsuarioRequestDto usuario) {

        Optional<UsuarioResponseDto> usuarioResponse = crudUsuario.findById(id);

        return ResponseEntity.of(Optional.of(usuarioResponse));
    }

    @Override
    public void deletarUsuario(Integer id) {
        crudUsuario.delete(id);
    }
}

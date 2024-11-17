package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnderecoController;
import com.kciao.GS24.gateways.requests.EnderecoRequestDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnderecoControllerImpl implements EnderecoController {

    @Override
    public ResponseEntity<Optional<EnderecoResponseDto>> buscarEndereco(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<EnderecoResponseDto>> buscarTodosEndereco() {
        return null;
    }

    @Override
    public ResponseEntity<EnderecoResponseDto> criarEndereco(EnderecoRequestDto endereco) {
        return null;
    }

    @Override
    public ResponseEntity<Optional<EnderecoResponseDto>> atualizarEndereco(String id, EnderecoRequestDto endereco) {
        return null;
    }

    @Override
    public void deletarEndereco(String id) {

    }
}

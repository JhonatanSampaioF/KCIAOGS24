package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnderecoController;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPatchDto;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
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
    public ResponseEntity<Optional<EnderecoResponseDto>> buscarEndereco(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<EnderecoResponseDto>> buscarTodosEndereco() {
        return null;
    }

    @Override
    public ResponseEntity<EnderecoResponseDto> criarEndereco(EnderecoRequestPostDto endereco) {
        return null;
    }

    @Override
    public ResponseEntity<Optional<EnderecoResponseDto>> atualizarEndereco(Integer id, EnderecoRequestPatchDto endereco) {
        return null;
    }

    @Override
    public void deletarEndereco(Integer id) {

    }
}

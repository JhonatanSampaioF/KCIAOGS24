package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnderecoController;
import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import com.kciao.GS24.usecases.impl.CrudEnderecoImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnderecoControllerImpl implements EnderecoController {

    private final CrudEnderecoImpl crudEnderecoImpl;

    @Override
    public ResponseEntity<EnderecoResponseDto> criarEndereco(EnderecoRequestPostDto endereco) {

        EnderecoResponseDto enderecoResponse = crudEnderecoImpl.save(endereco);

        return ResponseEntity.of(Optional.of(enderecoResponse));
    }
}

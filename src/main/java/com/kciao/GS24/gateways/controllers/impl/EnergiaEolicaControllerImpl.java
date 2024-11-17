package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnergiaEolicaController;
import com.kciao.GS24.gateways.requests.EnergiaEolicaRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnergiaEolicaControllerImpl implements EnergiaEolicaController {
    @Override
    public ResponseEntity<Optional<EnergiaEolicaResponseDto>> buscarEnergiaEolica(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<EnergiaEolicaResponseDto>> buscarTodosEnergiaEolica() {
        return null;
    }

    @Override
    public ResponseEntity<EnergiaEolicaResponseDto> criarEnergiaEolica(EnergiaEolicaRequestDto energiaEolica) {
        return null;
    }

    @Override
    public ResponseEntity<Optional<EnergiaEolicaResponseDto>> atualizarEnergiaEolica(String id, EnergiaEolicaRequestDto energiaEolica) {
        return null;
    }

    @Override
    public void deletarEnergiaEolica(String id) {

    }
}

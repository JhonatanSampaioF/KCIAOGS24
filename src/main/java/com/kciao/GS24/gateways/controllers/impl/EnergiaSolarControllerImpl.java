package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnergiaSolarController;
import com.kciao.GS24.gateways.requests.EnergiaSolarRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnergiaSolarControllerImpl implements EnergiaSolarController {
    @Override
    public ResponseEntity<Optional<EnergiaSolarResponseDto>> buscarEnergiaSolar(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<EnergiaSolarResponseDto>> buscarTodosEnergiaSolar() {
        return null;
    }

    @Override
    public ResponseEntity<EnergiaSolarResponseDto> criarEnergiaSolar(EnergiaSolarRequestDto energiaSolar) {
        return null;
    }

    @Override
    public ResponseEntity<Optional<EnergiaSolarResponseDto>> atualizarEnergiaSolar(Integer id, EnergiaSolarRequestDto energiaSolar) {
        return null;
    }

    @Override
    public void deletarEnergiaSolar(Integer id) {

    }
}

package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnergiaEolicaController;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import com.kciao.GS24.usecases.impl.CrudEnergiaEolicaImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnergiaEolicaControllerImpl implements EnergiaEolicaController {

    private final CrudEnergiaEolicaImpl crudEnergiaEolica;

    @Override
    public ResponseEntity<EnergiaEolicaResponseDto> criarEnergiaEolica(EnergiaEolicaRequestPostDto energiaEolica) {

        EnergiaEolicaResponseDto energiaEolicaResponse = crudEnergiaEolica.save(energiaEolica);

        return ResponseEntity.of(Optional.of(energiaEolicaResponse));
    }
}

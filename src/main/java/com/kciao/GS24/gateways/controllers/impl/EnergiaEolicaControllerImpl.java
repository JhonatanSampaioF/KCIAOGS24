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
    public ResponseEntity<Optional<EnergiaEolicaResponseDto>> buscarEnergiaEolica(Integer id) {

        Optional<EnergiaEolicaResponseDto> energiaEolicaResponse = crudEnergiaEolica.findById(id);

        return ResponseEntity.of(Optional.of(energiaEolicaResponse));
    }

    @Override
    public ResponseEntity<List<EnergiaEolicaResponseDto>> buscarTodosEnergiaEolica() {

        List<EnergiaEolicaResponseDto> listEnergiaEolicaResponse =  crudEnergiaEolica.findAll();

        return ResponseEntity.ok(listEnergiaEolicaResponse);
    }

    @Override
    public ResponseEntity<EnergiaEolicaResponseDto> criarEnergiaEolica(EnergiaEolicaRequestPostDto energiaEolica) {

        EnergiaEolicaResponseDto energiaEolicaResponse = crudEnergiaEolica.save(energiaEolica);

        return ResponseEntity.of(Optional.of(energiaEolicaResponse));
    }

    @Override
    public ResponseEntity<Optional<EnergiaEolicaResponseDto>> atualizarEnergiaEolica(Integer id, EnergiaEolicaRequestPatchDto energiaEolica) {

        Optional<EnergiaEolicaResponseDto> energiaEolicaResponse =  crudEnergiaEolica.update(id, energiaEolica);

        return ResponseEntity.of(Optional.of(energiaEolicaResponse));
    }

    @Override
    public void deletarEnergiaEolica(Integer id) {
        crudEnergiaEolica.delete(id);
    }
}

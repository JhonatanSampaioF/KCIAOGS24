package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnergiaEolicaController;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import com.kciao.GS24.usecases.impl.CrudEnergiaEolicaImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Page<EnergiaEolicaResponseDto>> buscarTodosEnergiaEolica(int page, int size, String sort, Sort.Direction direction) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(direction,sort));

        Page<EnergiaEolicaResponseDto> pageEnergiaEolicaResponse =  crudEnergiaEolica.findAll(pageable);

        return ResponseEntity.ok(pageEnergiaEolicaResponse);
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

package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnergiaSolarController;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import com.kciao.GS24.usecases.impl.CrudEnergiaSolarImpl;
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
public class EnergiaSolarControllerImpl implements EnergiaSolarController {

    private final CrudEnergiaSolarImpl crudEnergiaSolar;

    @Override
    public ResponseEntity<Optional<EnergiaSolarResponseDto>> buscarEnergiaSolar(Integer id) {

        Optional<EnergiaSolarResponseDto> energiaSolarResponse = crudEnergiaSolar.findById(id);

        return ResponseEntity.of(Optional.of(energiaSolarResponse));
    }

    @Override
    public ResponseEntity<Page<EnergiaSolarResponseDto>> buscarTodosEnergiaSolar(int page, int size, String sort, Sort.Direction direction) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(direction,sort));

        Page<EnergiaSolarResponseDto> pageEnergiaSolarResponse = crudEnergiaSolar.findAll(pageable);

        return ResponseEntity.ok(pageEnergiaSolarResponse);
    }

    @Override
    public ResponseEntity<EnergiaSolarResponseDto> criarEnergiaSolar(EnergiaSolarRequestPostDto energiaSolar) {

        EnergiaSolarResponseDto energiaSolarResponse =  crudEnergiaSolar.save(energiaSolar);

        return ResponseEntity.of(Optional.of(energiaSolarResponse));
    }

    @Override
    public ResponseEntity<Optional<EnergiaSolarResponseDto>> atualizarEnergiaSolar(Integer id, EnergiaSolarRequestPatchDto energiaSolar) {

        Optional<EnergiaSolarResponseDto> energiaSolarResponse =  crudEnergiaSolar.update(id, energiaSolar);

        return ResponseEntity.of(Optional.of(energiaSolarResponse));
    }

    @Override
    public void deletarEnergiaSolar(Integer id) {
        crudEnergiaSolar.delete(id);
    }
}

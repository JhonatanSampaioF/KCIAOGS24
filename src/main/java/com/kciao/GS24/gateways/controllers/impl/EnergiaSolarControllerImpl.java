package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnergiaSolarController;
import com.kciao.GS24.gateways.requests.EnergiaSolarRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import com.kciao.GS24.usecases.impl.CrudEnergiaSolarImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnergiaSolarControllerImpl implements EnergiaSolarController {

    private final CrudEnergiaSolarImpl crudEnergiaSolar;

    @Override
    public ResponseEntity<EnergiaSolarResponseDto> criarEnergiaSolar(EnergiaSolarRequestDto energiaSolar) {

        EnergiaSolarResponseDto energiaSolarResponse =  crudEnergiaSolar.save(energiaSolar);

        return ResponseEntity.of(Optional.of(energiaSolarResponse));
    }
}

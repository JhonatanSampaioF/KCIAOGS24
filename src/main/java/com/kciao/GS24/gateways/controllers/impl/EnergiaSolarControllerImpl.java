package com.kciao.GS24.gateways.controllers.impl;

import com.kciao.GS24.gateways.controllers.interfaces.EnergiaSolarController;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import com.kciao.GS24.usecases.impl.CrudEnergiaSolarImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class EnergiaSolarControllerImpl implements EnergiaSolarController {

    private final CrudEnergiaSolarImpl crudEnergiaSolar;

    @Override
    public ResponseEntity<EnergiaSolarResponseDto> criarEnergiaSolar(EnergiaSolarRequestPostDto energiaSolar) {

        EnergiaSolarResponseDto energiaSolarResponse =  crudEnergiaSolar.save(energiaSolar);

        return ResponseEntity.of(Optional.of(energiaSolarResponse));
    }
}

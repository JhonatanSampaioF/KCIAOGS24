package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/energiaEolica")
public interface EnergiaEolicaController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<EnergiaEolicaResponseDto> criarEnergiaEolica(@RequestBody @Valid EnergiaEolicaRequestPostDto energiaEolica);
}

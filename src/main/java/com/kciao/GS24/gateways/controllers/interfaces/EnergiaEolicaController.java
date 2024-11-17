package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.EnergiaEolicaRequestoDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/energiaEolica")
public interface EnergiaEolicaController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<EnergiaEolicaResponseDto>> buscarEnergiaEolica(@PathVariable @Valid String id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<EnergiaEolicaResponseDto>> buscarTodosEnergiaEolica();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<EnergiaEolicaResponseDto> criarEnergiaEolica(@RequestBody @Valid EnergiaEolicaRequestoDto energiaEolica);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<EnergiaEolicaResponseDto>> atualizarEnergiaEolica(@PathVariable @Valid String id, @RequestBody @Valid EnergiaEolicaRequestoDto energiaEolica);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deletarEnergiaEolica(@PathVariable @Valid String id);
}

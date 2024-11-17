package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.EnergiaEolicaRequestDto;
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
    ResponseEntity<Optional<EnergiaEolicaResponseDto>> buscarEnergiaEolica(@PathVariable @Valid Integer id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<EnergiaEolicaResponseDto>> buscarTodosEnergiaEolica();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<EnergiaEolicaResponseDto> criarEnergiaEolica(@RequestBody @Valid EnergiaEolicaRequestDto energiaEolica);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<EnergiaEolicaResponseDto>> atualizarEnergiaEolica(@PathVariable @Valid Integer id, @RequestBody @Valid EnergiaEolicaRequestDto energiaEolica);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deletarEnergiaEolica(@PathVariable @Valid Integer id);
}

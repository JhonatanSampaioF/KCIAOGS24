package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.EnergiaSolarRequestDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/energiaSolar")
public interface EnergiaSolarController {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<EnergiaSolarResponseDto>> buscarEnergiaSolar(@PathVariable @Valid Integer id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<EnergiaSolarResponseDto>> buscarTodosEnergiaSolar();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<EnergiaSolarResponseDto> criarEnergiaSolar(@RequestBody @Valid EnergiaSolarRequestDto energiaSolar);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Optional<EnergiaSolarResponseDto>> atualizarEnergiaSolar(@PathVariable @Valid Integer id, @RequestBody @Valid EnergiaSolarRequestDto energiaSolar);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deletarEnergiaSolar(@PathVariable @Valid Integer id);
}

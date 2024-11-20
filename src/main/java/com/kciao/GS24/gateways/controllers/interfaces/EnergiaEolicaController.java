package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/energiaEolica")
@Tag(name = "Energia Eólica", description = "Endpoints para gerenciamento da tabela de energia eólica")
public interface EnergiaEolicaController {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca o registro de uma energia eólica", description = "Retorna um registro de uma energia eólica com o id especificado.")
    ResponseEntity<Optional<EnergiaEolicaResponseDto>> buscarEnergiaEolica(@PathVariable @Valid Integer id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca todos os registros de energias eólicas", description = "Retorna uma lista paginada de todas as energias eólicas registrados.")
    ResponseEntity<Page<EnergiaEolicaResponseDto>> buscarTodosEnergiaEolica(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sort,
            @RequestParam(defaultValue = "ASC") Sort.Direction direction
    );

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria o registro de uma energia eólica", description = "Cria um registro de uma energia eólica e retorna o mesmo.")
    ResponseEntity<EnergiaEolicaResponseDto> criarEnergiaEolica(@RequestBody @Valid EnergiaEolicaRequestPostDto energiaEolica);

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Atualiza o registro de uma energia eólica", description = "Atualiza o registro de uma energia eólica e retorna o mesmo atualizado.")
    ResponseEntity<Optional<EnergiaEolicaResponseDto>> atualizarEnergiaEolica(
            @PathVariable @Valid Integer id,
            @RequestBody @Valid EnergiaEolicaRequestPatchDto energiaEolica
    );

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Deleta o registro de uma energia eólica", description = "Deleta um registro de uma energia eólica.")
    void deletarEnergiaEolica(@PathVariable @Valid Integer id);
}

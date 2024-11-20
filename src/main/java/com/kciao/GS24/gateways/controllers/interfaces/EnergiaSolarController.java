package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPatchDto;
import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
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
@RequestMapping("/energiaSolar")
@Tag(name = "Energia Solar", description = "Endpoints para gerenciamento da tabela de energia solar")
public interface EnergiaSolarController {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca o registro de uma energia solar", description = "Retorna um registro de uma energia solar com o id especificado.")
    ResponseEntity<Optional<EnergiaSolarResponseDto>> buscarEnergiaSolar(@PathVariable @Valid Integer id);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Busca todos os registros de energias solares", description = "Retorna uma lista paginada de todas as energias solares registrados.")
    ResponseEntity<Page<EnergiaSolarResponseDto>> buscarTodosEnergiaSolar(
            @RequestParam(defaultValue = "0") int page,
          @RequestParam(defaultValue = "5") int size,
          @RequestParam(defaultValue = "id") String sort,
          @RequestParam(defaultValue = "ASC") Sort.Direction direction
    );

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Cria o registro de uma energia solar", description = "Cria um registro de uma energia solar e retorna o mesmo.")
    ResponseEntity<EnergiaSolarResponseDto> criarEnergiaSolar(@RequestBody @Valid EnergiaSolarRequestPostDto energiaSolar);

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Atualiza o registro de uma energia solar", description = "Atualiza o registro de uma energia solar e retorna o mesmo atualizado.")
    ResponseEntity<Optional<EnergiaSolarResponseDto>> atualizarEnergiaSolar(
            @PathVariable @Valid Integer id, 
            @RequestBody @Valid EnergiaSolarRequestPatchDto energiaSolar
    );

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Deleta o registro de uma energia solar", description = "Deleta um registro de uma energia solar.")
    void deletarEnergiaSolar(@PathVariable @Valid Integer id);
}

package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.EnderecoRequestDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public interface EnderecoController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<EnderecoResponseDto> criarEndereco(@RequestBody @Valid EnderecoRequestDto endereco);
}

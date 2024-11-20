package com.kciao.GS24.gateways.controllers.interfaces;

import com.kciao.GS24.gateways.requests.UsuarioRequestDto;
import com.kciao.GS24.gateways.responses.UsuarioResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public interface UsuarioController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<UsuarioResponseDto> criarUsuario(@RequestBody @Valid UsuarioRequestDto usuario);
}

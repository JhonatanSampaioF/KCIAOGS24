package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.EnderecoRequestDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CrudEndereco {
    EnderecoResponseDto save(EnderecoRequestDto endereco);
}

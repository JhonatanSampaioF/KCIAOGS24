package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.endereco.EnderecoRequestPostDto;
import com.kciao.GS24.gateways.responses.EnderecoResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CrudEndereco {
    EnderecoResponseDto save(EnderecoRequestPostDto endereco);
}

package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.energiaEolica.EnergiaEolicaRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaEolicaResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CrudEnergiaEolica {
    EnergiaEolicaResponseDto save(EnergiaEolicaRequestPostDto energiaEolica);
}

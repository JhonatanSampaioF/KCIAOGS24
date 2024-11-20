package com.kciao.GS24.usecases.interfaces;

import com.kciao.GS24.gateways.requests.energiaSolar.EnergiaSolarRequestPostDto;
import com.kciao.GS24.gateways.responses.EnergiaSolarResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CrudEnergiaSolar {
    EnergiaSolarResponseDto save(EnergiaSolarRequestPostDto energiaSolar);
}

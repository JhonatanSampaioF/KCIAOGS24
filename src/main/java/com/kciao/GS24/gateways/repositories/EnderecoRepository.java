package com.kciao.GS24.gateways.repositories;

import com.kciao.GS24.domains.Endereco;
import com.kciao.GS24.gateways.responses.EnderecoUsuarioResponseDto;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    Optional<Endereco> findById(Integer id);
    Page<Endereco> findAll(Pageable pageable);
    void deleteById(Integer id);
    @Modifying
    @Transactional
    @Query(
            "UPDATE Endereco e SET " +
                    "e.tipoResidencial = :tipoResidencial," +
                    "e.nome = :nome," +
                    "e.cep = :cep," +
                    "e.tarifa = :tarifa," +
                    "e.gastoMensal = :gastoMensal, " +
                    "e.economia = :economia " +
                    "WHERE e.id = :id"
    )
    int updateById(Integer id, String tipoResidencial, String nome, String cep, Double tarifa, Double gastoMensal, Double economia);

    @Query(
            "SELECT NEW com.kciao.GS24.gateways.responses.EnderecoUsuarioResponseDto(" +
                    "e.id, e.tipoResidencial, e.nome, e.cep, e.tarifa, e.gastoMensal, e.economia, " +
                    "ee.potenciaNominal, ee.alturaTorre, ee.diametroRotor, ee.energiaEstimadaGerada, " +
                    "es.areaPlaca, es.irradiacaoSolar, es.energiaEstimadaGerada) " +
                    "FROM Endereco e " +
                    "LEFT JOIN EnergiaEolica ee ON ee.fk_endereco.id = e.id " +
                    "LEFT JOIN EnergiaSolar es ON es.fk_endereco.id = e.id " +
                    "WHERE e.fk_usuario.id = :id"
    )
    Page<EnderecoUsuarioResponseDto> findAllEnderecoWithEolicaAndSolar(Pageable pageable, Integer id);
}

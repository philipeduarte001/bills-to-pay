package com.philipeduarte.payments.bills_to_pay.infrastructure.repository;

import com.philipeduarte.payments.bills_to_pay.domain.entities.Conta;
import com.philipeduarte.payments.bills_to_pay.domain.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    List<Conta> findByUsuario(Usuario usuario);

    @Query("SELECT c FROM Conta c WHERE " +
            "(COALESCE(:data, c.dataVencimento) = c.dataVencimento) AND " +
            "(COALESCE(:nome, '') = '' OR c.nome LIKE %:nome%)")
    Page<Conta> findByFilters(@Param("data") LocalDate data,
                              @Param("nome") String nome,
                              Pageable pageable);
}

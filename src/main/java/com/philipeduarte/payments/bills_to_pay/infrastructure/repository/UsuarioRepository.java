package com.philipeduarte.payments.bills_to_pay.infrastructure.repository;

import com.philipeduarte.payments.bills_to_pay.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}

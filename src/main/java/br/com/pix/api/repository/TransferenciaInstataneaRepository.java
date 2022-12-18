package br.com.pix.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pix.api.model.entity.TransferenciaInstantanea;

public interface TransferenciaInstataneaRepository extends JpaRepository<TransferenciaInstantanea, Long> {}

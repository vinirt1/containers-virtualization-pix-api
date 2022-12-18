package br.com.pix.api.model.dto;

import java.time.LocalDateTime;

import br.com.pix.api.model.entity.TransferenciaInstantanea;

public class PixDTO {

    public PixDTO(TransferenciaInstantanea transferenciaInstantanea) {
        this.id = transferenciaInstantanea.getId();
        this.clienteId = transferenciaInstantanea.getClienteId();
        this.chave = transferenciaInstantanea.getChave();
        this.inicioVigencia = transferenciaInstantanea.getInicioVigencia();
        this.fimVigencia = transferenciaInstantanea.getFimVigencia();
    }

    private Long id;
    private Long clienteId;
    private String chave;
    private LocalDateTime inicioVigencia;
    private LocalDateTime fimVigencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public LocalDateTime getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(LocalDateTime inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public LocalDateTime getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(LocalDateTime fimVigencia) {
        this.fimVigencia = fimVigencia;
    }
}

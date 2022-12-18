package br.com.pix.api.service.impl;

import org.springframework.stereotype.Service;

import br.com.pix.api.model.dto.CriaChavePixDTO;
import br.com.pix.api.model.dto.PixDTO;
import br.com.pix.api.model.entity.TransferenciaInstantanea;
import br.com.pix.api.repository.TransferenciaInstataneaRepository;
import br.com.pix.api.service.PixService;

@Service
public class PixServiceImpl implements PixService {
    private TransferenciaInstataneaRepository apoliceRepository;

    public PixServiceImpl(TransferenciaInstataneaRepository apoliceRepository) {
        this.apoliceRepository = apoliceRepository;
    }

    @Override
    public PixDTO contratar(final Long clienteId, final CriaChavePixDTO criaChavePixDTO) {
        final TransferenciaInstantanea novoCadastroPix = this.apoliceRepository
                .save(new TransferenciaInstantanea(clienteId, criaChavePixDTO));

        return new PixDTO(novoCadastroPix);
    }
}

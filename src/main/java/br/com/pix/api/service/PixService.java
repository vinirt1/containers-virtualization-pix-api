package br.com.pix.api.service;

import br.com.pix.api.model.dto.CriaChavePixDTO;
import br.com.pix.api.model.dto.PixDTO;

public interface PixService {
    PixDTO contratar(final Long clienteId, final CriaChavePixDTO criaChavePixDTO);
}

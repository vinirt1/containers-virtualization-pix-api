package br.com.pix.api.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pix.api.model.dto.CriaChavePixDTO;
import br.com.pix.api.model.dto.PixDTO;
import br.com.pix.api.service.PixService;

@RestController
@RequestMapping("/api/pix")
public class PixController {

    private PixService emprestimoService;

    public PixController(PixService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping()
    public ResponseEntity<PixDTO> contratar(@RequestHeader("clienteId") Long clienteId,
            @Valid @RequestBody final CriaChavePixDTO criaChavePixDTO) {
        final PixDTO novoSeguro = this.emprestimoService.contratar(clienteId, criaChavePixDTO);

        return new ResponseEntity<PixDTO>(novoSeguro, HttpStatus.CREATED);
    }
}

package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Cliente;


import lombok.Data;

@Data

public class ClienteResponseDto {
	private Long id;
	private String nome;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;
    private static final ModelMapper modelMapper = new ModelMapper();

}
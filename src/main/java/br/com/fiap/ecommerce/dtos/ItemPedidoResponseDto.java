package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.ItemPedido;

import lombok.Data;

@Data

public class ItemPedidoResponseDto {
	private Long id;
	private Long idPedido;
    private Long idProduto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
    private static final ModelMapper modelMapper = new ModelMapper();
    
    public ItemPedidoResponseDto toDto(ItemPedido itemPedido) {
        return modelMapper.map(itemPedido, ItemPedidoResponseDto.class);
    }

}

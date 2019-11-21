package com.wpl.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE (1,"Pendente"),
	QUITADO (2,"Quitado"),
	CANCELADO (3,"Cancelado");

	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod=cod;
		this.descricao= descricao;
	}

	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
			if (cod == null) {
				return null;
		}
	
			for (EstadoPagamento x : EstadoPagamento.values()){ //Para todo objeto 'x' nos valores possíves de meu objeto enumerado 'EstadoPagamento,
					if(cod.equals(x.getCod())) {		//se este objeto 'x' foi igual ao 'cod' que recebi como parâmetro, 
						return x;						//então retorne o x
					}
			}
	
	throw new IllegalArgumentException("Id Inválido: " + cod);
	}
}


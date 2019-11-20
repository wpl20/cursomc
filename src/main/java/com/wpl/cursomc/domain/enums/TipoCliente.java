package com.wpl.cursomc.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1,"Pessoa Física"),
	PESSOAJURIDICA(2,"Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod=cod;
		this.descricao= descricao;
	}

	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
			if (cod == null) {
				return null;
		}
	
			for (TipoCliente x : TipoCliente.values()){ //Para todo objeto 'x' nos valores possíves de meu objeto enumerado 'TipoCliente,
					if(cod.equals(x.getCod())) {		//se este objeto 'x' foi igual ao 'cod' que recebi como parâmetro, 
						return x;						//então retorne o x
					}
			}
	
	throw new IllegalArgumentException("Id Inválido: " + cod);
	}
}

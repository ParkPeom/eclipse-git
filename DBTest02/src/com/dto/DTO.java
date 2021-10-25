package com.dto;

// DTO = Data Transfer Object
// VO = Value Object

// db�� �ִ� data�� ����
// db�� �÷��� ���� �̸����� �ʵ带 �����.



// DTO(VO) �ڵ� 
public class DTO {
	
	private int NO;
	private String NAME;
	private String NICKNAME;
	
	public DTO() {
		super();
	}
	
	public DTO(int nO , String nAME , String nICKNAME) {
		super();
		this.NO = nO;
		this.NAME = nAME;
		this.NICKNAME = nICKNAME;
	}

	public int getNO() {
		return NO;
	}

	public void setNO(int nO) {
		NO = nO;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getNICKNAME() {
		return NICKNAME;
	}

	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}

	@Override
	public String toString() {
		return "DTO [NO=" + NO + ", NAME=" + NAME + ", NICKNAME=" + NICKNAME + "]";
	}
	
}

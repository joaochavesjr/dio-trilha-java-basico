package br.com.chaves.model;

public enum GameStatusEnum {

    NON_STARTED("Não iniciado"),
    INCOMPLETE("incompleto"),
    COMPLETE("completo");

    private String label;

    public String getLabel() {
        return label;
    }

    GameStatusEnum(final String label){
        this.label = label;
    }



}

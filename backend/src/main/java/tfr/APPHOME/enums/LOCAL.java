package tfr.APPHOME.enums;

public enum LOCAL {

    WC (1, "WC"),
    COZINHA (2, "COZINHA"),
    SALA(3, "SALA"),
    HALLENTRADA(4, "HALLENTRADA"),
    QUARTOTOMAS(5, "Quarto Tomás"),
    QUARTO(6, "Quarto"),
    OTHER(7, "OTHER");

    private int cod;
    private String description;

    private LOCAL(int cod, String description){
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static LOCAL toEnum(Integer cod){
        if (cod == null){
            return null;
        }
        for (LOCAL x : LOCAL.values()) {
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("invalid id " + cod);
    }
}

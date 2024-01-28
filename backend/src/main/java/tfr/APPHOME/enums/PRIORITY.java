package tfr.APPHOME.enums;

public enum PRIORITY {

    NORMAL(1, "Normal"),
    LOW (2, "Baixa"),
    HIGH (3, "Alta"),

    OTHER (4, "Outra");

    private int cod;
    private String description;
    private PRIORITY(int cod, String description){
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static PRIORITY toEnum(Integer type){
        if (type == null){
            return null;
        }
        for(PRIORITY x : PRIORITY.values()){
            if (type.equals(x.getCod())){
                return x;
            }

        }
        throw new IllegalArgumentException("invalid code: " + type);
    }
}

package tfr.APPHOME.enums;

public enum STATEOFOCCURRENCE {

    OPEN (1, "Aberto"),
    CLOSE (2, "Fechado"),
    TREATMENT (3, "Em tratamento"),
    OTHER (4, "Outro");

    private int cod;
    private String description;

    private STATEOFOCCURRENCE(int cod, String description){
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static STATEOFOCCURRENCE toEnum(Integer type){
        if (type == null){
            return null;
        }
        for (STATEOFOCCURRENCE x: STATEOFOCCURRENCE.values()){
            if(type.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("invalid code" + type);
    }
}

package tfr.APPHOME.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends  CustomError{

    private List<FieldMessage> erros = new ArrayList<>();
    public ValidationError(Instant instant, Integer status, String error, String path) {
        super(instant, status, error, path);

    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void addErros(String fieldName, String message){
        erros.add(new FieldMessage(fieldName,message));
    }
}

package tfr.APPHOME.dto;

import tfr.APPHOME.Projections.UserAPPMinProjection;

public class UserAPPMinDTO {

    private String name;

    public UserAPPMinDTO(){}

    public UserAPPMinDTO(String name) {
        this.name = name;
    }

   public UserAPPMinDTO(UserAPPMinProjection projection){
        name = projection.getName();
   }

    public String getName() {
        return name;
    }
}

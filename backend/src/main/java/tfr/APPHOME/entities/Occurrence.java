package tfr.APPHOME.entities;

import tfr.APPHOME.enums.PRIORITY;
import tfr.APPHOME.enums.STATEOFOCCURRENCE;

import java.util.Date;

public class Occurrence {

    private Long id;
    private String occorrenceName;

    private Date dataOpenOccorrence;

    private Date dataCloseOccorrence;

    private STATEOFOCCURRENCE state;

    private PRIORITY priority;

    private String img;
    


}

package tfr.APPHOME.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import tfr.APPHOME.entities.Occurrence;


import java.util.Date;

public class OccurrenceDTO {
    private Long id;
    @Size(min=3, max = 80, message = "occurrence description must be between 3 and 300 characters")
    @NotBlank(message = "required field")
    private String occurrenceName;

    private Date dataOpenOccurrence;

    private Date dataCloseOccurrence;

    private Integer state;

    private Integer priority;

    private String img;

    private UserAPPDTO userAppDto;

    private LocalDTO localDto;

    private AddressedDTO addressDto;

    public OccurrenceDTO(){}

    public OccurrenceDTO(Long id, String occurrenceName, Date dataOpenOccurrence,
                         Date dataCloseOccurrence, Integer state, Integer priority, String img, UserAPPDTO userAppDto, LocalDTO localDto, AddressedDTO addressedDTO) {
        this.id = id;
        this.occurrenceName = occurrenceName;
        this.dataOpenOccurrence = dataOpenOccurrence;
        this.dataCloseOccurrence = dataCloseOccurrence;
        this.state = state;
        this.priority = priority;
        this.img = img;
        this.userAppDto = userAppDto;
        this.localDto = localDto;
        this.addressDto = addressedDTO;
    }

    public OccurrenceDTO(Occurrence entity){
        id = entity.getId();
        occurrenceName = entity.getOccurrenceName();
        dataOpenOccurrence = entity.getDataOpenOccurrence();
        dataCloseOccurrence = entity.getDataCloseOccurrence();
        state = entity.getState().getCod();
        priority = entity.getPriority().getCod();
        img = entity.getImg();
        userAppDto = new UserAPPDTO(entity.getUserAPP());
        localDto = new LocalDTO(entity.getLocal());
        addressDto = new AddressedDTO(entity.getAddressed());
    }

    public Long getId() {
        return id;
    }

    public String getOccurrenceName() {
        return occurrenceName;
    }

    public Date getDataOpenOccurrence() {
        return dataOpenOccurrence;
    }

    public Date getDataCloseOccurrence() {
        return dataCloseOccurrence;
    }

    public Integer getState() {
        return state;
    }

    public Integer getPriority() {
        return priority;
    }

    public String getImg() {
        return img;
    }

    public UserAPPDTO getUserAppDto() {
        return userAppDto;
    }

    public LocalDTO getLocalDto() {
        return localDto;
    }

    public AddressedDTO getAddressDto() {
        return addressDto;
    }
}

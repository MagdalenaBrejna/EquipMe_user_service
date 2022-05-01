package mb.equipme_user_service.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class LocalisationDto {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("upc")
    private String upc;

    @JsonProperty("city")
    private String city;

    @JsonProperty("province")
    private String province;
}

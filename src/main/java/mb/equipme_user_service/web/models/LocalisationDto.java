package mb.equipme_user_service.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

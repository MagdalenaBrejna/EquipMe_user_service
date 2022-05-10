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
public class PersonDto {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("upc")
    private String upc;

    @JsonProperty("name")
    private String name;

    @JsonProperty("lastname")
    private String lastName;

    @JsonProperty("localisationId")
    private UUID localisationId;

    @JsonProperty("email")
    private String userEmail;

    @JsonProperty("password")
    private String userPassword;

    @JsonProperty("userTelephone")
    private String userTelephone;

    @JsonProperty("image")
    private byte[] userImage;

    @JsonProperty("notification")
    private Boolean getNotification;

    @JsonProperty("bank_account_number")
    private String userBankAccountNumber;

}

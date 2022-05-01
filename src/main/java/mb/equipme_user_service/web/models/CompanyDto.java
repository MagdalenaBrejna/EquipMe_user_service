package mb.equipme_user_service.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;
import java.util.UUID;

public class CompanyDto {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("upc")
    private String upc;

    @JsonProperty("name")
    private String name;

    @JsonProperty("NIP")
    private String NIP;

    @JsonProperty("localisations")
    private Set<UUID> localisations;

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

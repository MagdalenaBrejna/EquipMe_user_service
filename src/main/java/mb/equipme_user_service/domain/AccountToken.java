package mb.equipme_user_service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tokens")
public class AccountToken extends BaseEntity {

    public AccountToken(UUID id, String upc, String token, LocalDate expirationDate) {
        super(id, upc);
        this.token = token;
        this.expirationDate = expirationDate;
    }

    @Column(name="token")
    private String token;

    @Column(name="exp_date")
    private LocalDate expirationDate;

    @OneToOne()
    @JoinColumn(name = "id")
    private User user;

}

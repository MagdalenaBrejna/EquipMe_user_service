package mb.equipme_user_service.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

    public BaseEntity(UUID id, String upc) {
        this.id = id;
        this.upc = upc;
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id;

    @Column(name="upc", unique = true)
    private String upc;

}


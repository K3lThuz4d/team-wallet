package backend.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class player {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private List<punishment> punishmentList;


}

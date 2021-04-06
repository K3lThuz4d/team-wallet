package backend.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class punishment {


  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long Id;

  @Column(nullable=false)
  private String name;

  @Column(nullable = false)
  private float amount;



}

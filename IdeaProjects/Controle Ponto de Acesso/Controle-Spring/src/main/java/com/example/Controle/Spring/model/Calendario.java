package com.example.Controle.Spring.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.transform.sax.SAXResult;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}

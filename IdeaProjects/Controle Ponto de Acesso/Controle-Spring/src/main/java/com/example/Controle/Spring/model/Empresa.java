package com.example.Controle.Spring.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    private Long id;
    private String desacricao;
    private String cnjp;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}

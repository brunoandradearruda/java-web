package dev.fujioka.java.avancado.web.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
public class Aluno {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;


    @NotEmpty
    @Max(value = 300, message = "O Valor Máximo é de 300 Caracteres")
    @Min(value = 100, message = "O Valor Minimo é de 100 Caracteres")
    private String matricula;

    @Email(message = "Digite um Email Válido")
    private String email;



}

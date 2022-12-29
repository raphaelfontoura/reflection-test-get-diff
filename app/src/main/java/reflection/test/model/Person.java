package reflection.test.model;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String nome;
    private LocalDate aniversario;
    private Boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nome, person.nome) && Objects.equals(aniversario, person.aniversario) && Objects.equals(ativo, person.ativo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, aniversario, ativo);
    }
}

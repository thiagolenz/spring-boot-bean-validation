package canal.masterdev.tarefas;

import javax.validation.constraints.*;

public class TarefaDTO {
    private Long id;

    @NotNull(message = "Título não pode ser null")
    @Size(message = "O Campo título deve possuir de 5 a 100 caracteres", min = 5, max = 100)
    private String titulo;

    @NotNull(message = "Descrição não pode ser nulo")
    @NotEmpty
    private String descricao;

    // 1 a 5
    @Min(message = "O valor minímo é 1", value = 1)
    @Max(message = "O valor máximo é 5", value = 5)
    @NotNull(message = "O campo prioridade não pode ser null")
    private Integer prioridade;

    @Email(message = "Formato inválido de email")
    @NotNull(message = "O campo email não pode ser null")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


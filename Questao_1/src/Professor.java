import java.time.LocalDate;

public class Professor extends Pessoa {
    private String registro;
    private LocalDate dataContratacao;
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsrcao, String registro, LocalDate dataContratacao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsrcao);
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }
    public Professor(){

    }
    
}

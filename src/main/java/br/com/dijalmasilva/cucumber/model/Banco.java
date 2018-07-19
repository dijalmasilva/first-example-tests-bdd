package br.com.dijalmasilva.cucumber.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banco {

    private String nome;
    private List<Conta> contas;

    public int getTotalDeContas() {
        return this.contas.size();
    }

    public Double getTotalDinheiro() {
        return this.contas.stream().mapToDouble(Conta::getSaldo).sum();
    }
}

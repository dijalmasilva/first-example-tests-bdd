package br.com.dijalmasilva.cucumber.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    private String dono;
    private int numero;
    private Double limite;
    private Double saldo;

    public boolean depositar(Double valorDepositado) {
        if (valorDepositado <= limite) {
            saldo+= valorDepositado;
            return true;
        }

        return false;
    }

    public boolean sacar(Double valorSaque) {
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            return true;
        }

        return false;
    }
}

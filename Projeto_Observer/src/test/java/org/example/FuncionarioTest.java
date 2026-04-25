package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveNotificarUmAluno() {
        Contrato contrato = new Contrato(5000);
        Funcionario funcionario = new Funcionario("Funcionario");
        funcionario.receber(contrato);
        contrato.pagarSalario();
        assertEquals("Funcionario seu salário foi pago!! \n" + "Salario bruto = R$5000.0", funcionario.getNotificacaoSalario());
    }

    @Test
    void deveNotificarAlunos() {
        Contrato contrato = new Contrato(5000);
        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        Funcionario funcionario2 = new Funcionario("Funcionario 2");
        funcionario1.receber(contrato);
        funcionario2.receber(contrato);
        contrato.pagarSalario();
        assertEquals("Funcionario 1 seu salário foi pago!! \n" + "Salario bruto = R$5000.0", funcionario1.getNotificacaoSalario());
        assertEquals("Funcionario 2 seu salário foi pago!! \n" + "Salario bruto = R$5000.0", funcionario2.getNotificacaoSalario());
    }

    @Test
    void naoDeveNotificarAluno() {
        Contrato contrato = new Contrato(5000);
        Funcionario funcionario = new Funcionario("Funcionario 1");
        contrato.pagarSalario();
        assertEquals(null, funcionario.getNotificacaoSalario());
    }

    @Test
    void deveNotificarAlunoTurmaA() {
        Contrato contratoA = new Contrato(7000);
        Contrato contratoB = new Contrato(5000);
        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        Funcionario funcionario2 = new Funcionario("Funcionario 2");
        funcionario1.receber(contratoA);
        funcionario2.receber(contratoB);
        contratoA.pagarSalario();
        assertEquals("Funcionario 1 seu salário foi pago!! \n" + "Salario bruto = R$7000.0", funcionario1.getNotificacaoSalario());
        assertEquals(null, funcionario2.getNotificacaoSalario());
    }
}
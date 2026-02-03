package br.com.jonataspaes.barbearia;

import java.util.HashMap;
import java.util.Map;

public class Servico {

    private Map<String, Double> servicos = new HashMap<>();

    public Servico() {
        servicos.put("Sobrancelha", 15.00);
        servicos.put("Corte maquina", 35.00);
        servicos.put("Corte maquina e tesoura", 40.00);
        servicos.put("Corte tesoura", 45.00);
        servicos.put("Corte navalhado", 45.00);
        servicos.put("Corte e barba", 80.00);
    }

    public void mostrarServicos() {
        for (String nome : servicos.keySet()) {
            System.out.println(nome + " - R$ " + servicos.get(nome));
        }
    }

    public void adicionarServico(String nome, Double preco) {
        servicos.put(nome, preco);
    }

    public double getPreco(String nomeServico) {
        return servicos.getOrDefault(nomeServico, 0.0);
    }
}

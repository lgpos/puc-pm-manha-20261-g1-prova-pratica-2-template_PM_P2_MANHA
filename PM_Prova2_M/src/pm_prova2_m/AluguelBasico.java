package pm_prova2_m;

import java.util.ArrayList;
import java.util.List;

public class AluguelBasico extends Aluguel {

    private static final double LIMITE_KM_DIA = 100.0;
    private List<Veiculo> veiculos;

    public AluguelBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo " + veiculo.getModelo() + " associado ao aluguel básico de " + getNomeCliente());
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return false;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println(" === ALUGUEL BÁSIICO ===");
        System.out.println("Cliente: " + getNomeCliente());
        System.out.println("Dias: " + getQuantidadeDias());
        System.out.println("Valor Total: R$" + getValorTotal());
        System.out.println("Status: " + getStatus());
        System.out.println("Seguro Incluso: " + possuiSeguroIncluso());
        System.out.println("Limite de KM/dia: " + LIMITE_KM_DIA + " km");
        System.out.println("Veículos: " + veiculos.size());
        for (Veiculo v : veiculos) {
            System.out.println("  - " + v.getModelo() + " [" + v.getPlaca() + "]");
        }
    }
}

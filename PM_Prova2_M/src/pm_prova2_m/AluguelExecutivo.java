package pm_prova2_m;

import java.util.ArrayList;
import java.util.List;

public class AluguelExecutivo extends Aluguel implements Avaliavel {

    private String nomeMotorista;
    private int avaliacao;
    private List<Veiculo> veiculos;

    public AluguelExecutivo(String nomeCliente, int quantidadeDias, double valorTotal,
                            StatusAluguel status, String nomeMotorista) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.nomeMotorista = nomeMotorista;
        this.avaliacao = 0;
        this.veiculos = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo " + veiculo.getModelo() + " associado ao aluguel executivo de " + getNomeCliente());
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    @Override
    public void avaliar(int nota) {
        this.avaliacao = nota;
        System.out.println("Aluguel executivo. Cliente: " + getNomeCliente() + " avaliado com nota: " + nota);
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return true;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== ALUGUEL EXECUTIVO ===");
        System.out.println("Cliente: " + getNomeCliente());
        System.out.println("Motorista: " + nomeMotorista);
        System.out.println("Dias: " + getQuantidadeDias());
        System.out.println("Valor Total: R$" + getValorTotal());
        System.out.println("Status: " + getStatus());
        System.out.println("Seguro Incluso: " + possuiSeguroIncluso());
        System.out.println("Quilometragem: Ilimitada");
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Veículos: " + veiculos.size());
        for (Veiculo v : veiculos) {
            System.out.println("  - " + v.getModelo() + " [" + v.getPlaca() + "]");
        }
    }
}

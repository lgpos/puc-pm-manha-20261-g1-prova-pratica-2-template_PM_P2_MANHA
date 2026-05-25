package pm_prova2_m;

public class Carro extends Veiculo implements Avaliavel {

    private int qtdPortas;
    private int avaliacao;

    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria,
                 double quilometragem, StatusVeiculo status, int qtdPortas) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.qtdPortas = qtdPortas;
        this.avaliacao = 0;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void avaliar(int nota) {
        this.avaliacao = nota;
        System.out.println("Carro " + getModelo() + " avaliado com nota: " + nota);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== CARRO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAnoFabricacao());
        System.out.println("Valor Diária: R$" + getValorDiaria());
        System.out.println("Quilometragem: " + getQuilometragem() + " km");
        System.out.println("Status: " + getStatus());
        System.out.println("Qtd Portas: " + qtdPortas);
        System.out.println("Avaliação: " + avaliacao);
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return false;
    }
}

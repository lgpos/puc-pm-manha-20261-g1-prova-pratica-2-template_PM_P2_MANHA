package pm_prova2_m;

public class Van extends Veiculo implements Avaliavel, Inspecionavel {

    private int maxPassageiros;
    private int avaliacao;

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria,
               double quilometragem, StatusVeiculo status, int maxPassageiros) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.maxPassageiros = maxPassageiros;
        this.avaliacao = 0;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    @Override
    public void avaliar(int nota) {
        this.avaliacao = nota;
        System.out.println("Van " + getModelo() + " avaliada com nota: " + nota);
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Inspeção realizada na Van: " + getModelo() + " (max passageiros: " + maxPassageiros + ")");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== VAN ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAnoFabricacao());
        System.out.println("Valor Diária: R$" + getValorDiaria());
        System.out.println("Quilometragem: " + getQuilometragem() + " km");
        System.out.println("Status: " + getStatus());
        System.out.println("Máx. Passageiros: " + maxPassageiros);
        System.out.println("Avaliação: " + avaliacao);
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return true;
    }
}

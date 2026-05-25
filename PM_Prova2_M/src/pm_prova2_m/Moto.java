package pm_prova2_m;

public class Moto extends Veiculo implements Inspecionavel {

    private double cilindrada;

    public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria,
                double quilometragem, StatusVeiculo status, double cilindrada) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Inspeção realizada na Moto: " + getModelo() + " (cilindrada: " + cilindrada + "cc)");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== MOTO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAnoFabricacao());
        System.out.println("Valor Diária: R$" + getValorDiaria());
        System.out.println("Quilometragem:  " + getQuilometragem() + " km");
        System.out.println("Status: " + getStatus());
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return false;
    }
}

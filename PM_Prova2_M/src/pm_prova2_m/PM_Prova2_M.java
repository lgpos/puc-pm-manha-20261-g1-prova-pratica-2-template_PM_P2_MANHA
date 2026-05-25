package pm_prova2_m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PM_Prova2_M {

    static List<Veiculo> veiculos = new ArrayList<>();
    static List<Aluguel> alugueis = new ArrayList<>();

    public static void main(String[] args) {

        popularDados();

        System.out.println("\n========== TODOS OS VEÍCULOS ==========");
        exibirTodosVeiculos();

        System.out.println("\n========== TODOS OS ALUGUÉIS ==========");
        exibirTodosAlugueis();

        System.out.println("\n========== VEÍCULOS DISPONÍVEIS ==========");
        exibirVeiculosDisponiveis();

        System.out.println("\n========== AVALIAÇÕES ==========");
        avaliarObjetos();

        System.out.println("\n========== INSPEÇÕES ==========");
        inspecionarVeiculos();

        System.out.println("\n========== REMOVENDO VEICULOS EM MANUTENÇÃO ==========");
        removerVeiculosEmManutencao();

        System.out.println("\n========== VEÍCULOS APÓS REMOÇÃO ==========");
        exibirTodosVeiculos();
    }

    public static void popularDados() {
    
        Carro carro = new Carro("NYC-4E91", "Gol 1.6", 2022, 150.0, 30000, StatusVeiculo.DISPONIVEL, 4);
        Moto moto = new Moto("XLM-5P68", "Moto do Motoqueiro Fantasma", 2021, 80.0, 15000, StatusVeiculo.MANUTENCAO, 600);
        Van van = new Van("FLF-9M12", "Van do Scooby Doo", 2020, 300.0, 60000, StatusVeiculo.DISPONIVEL, 15);

        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(van);

        
        AluguelBasico basico = new AluguelBasico("Lucas", 5, 750.0, StatusAluguel.ATIVO);
        AluguelExecutivo executivo = new AluguelExecutivo("Ana", 3, 1350.0, StatusAluguel.ATIVO, "Carlos Motorista");

        System.out.println("========== ASSOCIANDO VEÍCULOS ==========");
        basico.adicionarVeiculo(carro);
        executivo.adicionarVeiculo(van);

        alugueis.add(basico);
        alugueis.add(executivo);
    }

    public static void exibirTodosVeiculos() {
        for (Veiculo v : veiculos) {
            v.exibirDetalhes();
            System.out.println();
        }
    }

    public static void exibirTodosAlugueis() {
        for (Aluguel a : alugueis) {
            a.exibirDetalhes();
            System.out.println();
        }
    }

    public static void exibirVeiculosDisponiveis() {
        for (Veiculo v : veiculos) {
            if (v.getStatus() == StatusVeiculo.DISPONIVEL) {
                v.exibirDetalhes();
                System.out.println();
            }
        }
    }

    public static void avaliarObjetos() {
        for (Veiculo v : veiculos) {
            if (v instanceof Avaliavel) {
                ((Avaliavel) v).avaliar(10);
            }
        }
        for (Aluguel a : alugueis) {
            if (a instanceof Avaliavel) {
                ((Avaliavel) a).avaliar(10);
            }
        }
    }

    public static void inspecionarVeiculos() {
        for (Veiculo v : veiculos) {
            if (v instanceof Inspecionavel) {
                ((Inspecionavel) v).realizarInspecao();
            }
        }
    }

    public static void removerVeiculosEmManutencao() {
        Iterator<Veiculo> it = veiculos.iterator();
        while (it.hasNext()) {
            Veiculo v = it.next();
            if (v.getStatus() == StatusVeiculo.MANUTENCAO) {
                System.out.println("Removendo este veículo em manutenção: " + v.getModelo());
                it.remove();
            }
        }
    }
}

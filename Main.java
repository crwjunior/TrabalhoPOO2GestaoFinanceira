import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Gastos> gastos = new ArrayList<>();
    gastos.add(new Gastos("Cinema", new Date(), 60.0, "Cartão de Débito"));
    gastos.add(new Gastos("Mercado", new Date(), 600.0, "Dinheiro"));
    gastos.add(new Gastos("Tênis", new Date(), 400.0, "Cartão de Débito"));
    gastos.add(new Gastos("Hambúrguer", new Date(), 50.0, "PIX"));
    gastos.add(new Gastos("Viagem", new Date(), 1250.0, "Cartão de Crédito"));

    List<Ganhos> ganhos = new ArrayList<>();
    ganhos.add(new Ganhos("Salário", new Date(), 6900.0));
    ganhos.add(new Ganhos("Apostas(.bet)", new Date(), 1313.0));

    Relatorios relatorio = new Relatorios();
    relatorio.gerarRelatorioGastos(gastos);
    relatorio.gerarRelatorioGanhos(ganhos);
    relatorio.gerarRelatorioSaldoMensal(ganhos, gastos);
  }
}

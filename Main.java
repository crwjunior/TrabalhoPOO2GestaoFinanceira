import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Gastos> gastos = new ArrayList<>();
    gastos.add(new Gastos("Celesc", new Date(), 140.0, "Cartão de Crédito"));
    gastos.add(new Gastos("Cinema", new Date(), 60.0, "PIX"));
    gastos.add(new Gastos("Mercado", new Date(), 600.0, "Dinheiro"));
    gastos.add(new Gastos("Gasolina", new Date(), 200.0, "Cartão de Débito"));
    gastos.add(new Gastos("Roupas", new Date(), 450.0, "PIX"));
    gastos.add(new Gastos("Presentes", new Date(), 400.0, "Cartão de Crédito"));

    List<Ganhos> ganhos = new ArrayList<>();
    ganhos.add(new Ganhos("Salário", new Date(), 2500.0));
    ganhos.add(new Ganhos("Freelance", new Date(), 1300.0));

    Relatorios relatorio = new Relatorios();
    relatorio.gerarRelatorioGastos(gastos);
    relatorio.gerarRelatorioGanhos(ganhos);
    relatorio.gerarRelatorioSaldoMensal(ganhos, gastos);
  }
}

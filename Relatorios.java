import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Relatorios {
  public void gerarRelatorioDespesas(List<Gastos> gastos) {
    double total = 0.0;
    System.out.println("Relatório de Despesas");
    System.out.println("---------------------");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    for (Gastos gasto : gastos) {
      String formatDate = sdf.format(gasto.getData());
      System.out.println("Tipo: " + gasto.getTipo());
      System.out.println("Data: " + formatDate);
      System.out.println("Valor: " + gasto.getValor());
      System.out.println("Forma de Pagamento: " + gasto.getFormaPagamento());
      System.out.println();
      total += gasto.getValor();
    }
    System.out.println("Total de Despesas: " + total);
    System.out.println();
  }

  public void gerarRelatorioReceitas(List<Ganhos> ganhos) {
    double total = 0.0;
    System.out.println("Relatório de Receitas");
    System.out.println("---------------------");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    for (Ganhos ganho : ganhos) {
      String formatDate = sdf.format(ganho.getData());
      System.out.println("Tipo: " + ganho.getTipo());
      System.out.println("Data: " + formatDate);
      System.out.println("Valor: " + ganho.getValor());
      System.out.println();
      total += ganho.getValor();
    }
  }

  public void gerarRelatorioSaldoMensal(List<Ganhos> ganhos, List<Gastos> gastos) {
    double totalGanhos = 0.0;
    double totalGastos = 0.0;
    for (Ganhos ganho : ganhos) {
      totalGanhos += ganho.getValor();
    }
    for (Gastos gasto : gastos) {
      totalGastos += gasto.getValor();
    }
    double saldo = totalGanhos - totalGastos;
    System.out.println("Relatório de Saldo Mensal");
    System.out.println("-------------------------");
    System.out.println("Total de Receitas: " + totalGanhos);
    System.out.println("Total de Despesas: " + totalGastos);
    System.out.println("Saldo: " + saldo);
    System.out.println();
  }
}
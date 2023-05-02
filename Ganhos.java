import java.util.Date;

public class Ganhos {
  private String tipo;
  private Date data;
  private double valor;

  public Ganhos(String tipo, Date date, double valor) {
    this.tipo = tipo;
    this.data = date;
    this.valor = valor;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}

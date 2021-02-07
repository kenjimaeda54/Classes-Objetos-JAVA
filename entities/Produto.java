package entities;

public class Produto {
	public String nome;
	 public double preco;
	 public double estoque;
	 
	 public double valor() {
		  return preco * estoque;
	 }
     public void addTotal(int estoque) {
    	 this.estoque += estoque;
     }
     public void removeTotal(int estoque) {
    	 this.estoque -= estoque;
     }
     public String toString(){
    	 return nome
    	 + ",$"
    	 + String.format("%.2f",preco)
    	 + ","
    	 + String.format("%.0f", estoque)
    	 + " unidades "
    	 + ",Total $"
    	 + valor();
    	 
     }
}

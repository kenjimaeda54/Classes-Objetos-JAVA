package entities;

public class Produto {
        public String nome;
        public double preco;
        public double quantidade;
        
        public double valor() {
        	return preco * quantidade;
        }
        public void addTotal(int quantidade) {
        	this.quantidade  += quantidade;
        }     
        public void removeTotal(int quantidade) {
        	this.quantidade -= quantidade;	
        }
        public String toString() {
        	return "Dados do produto: "
        	+ nome
        	+ ",$"
        	+ String.format("%.2f", preco)
        	+ ", "
        	+ String.format("%.0f",quantidade)
        	+" unidades, Total: $ "
        	+ valor();
        }
}     


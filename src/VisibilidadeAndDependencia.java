


/**
 * @author vitorbrangioni
 * 
 * 
 * 1) VISIBILIDADE ASSOCIAÇÃO/ATRIBUTOS
 * 
 * 		Existe de A para B, quando B é um atributo de A
 * 
 * 
 * 		1.1) Permanente
 * 			
 * 			Persiste enquanto A e B existirem
 * 
 * 
 * 
 * 2) VISIBILIDADE POR PARÂMETRO
 * 
 * 		É obtida quando ao executar um método, rece outro objeto com parâmetros
 * 
 * 		2.1) Temporária
 * 			
 * 			Persiste apenas dentro do escopo do método de A (permanete se B é atributo de A)
 * 
 *	3) VISIBILIDADE LOCAL
 *
 *		É criado um objeto dentro de um método
 */
public class VisibilidadeAndDependencia {
	
	/**
	 * Visibilidade: atributo ou associacao
	 * Relacionamento: Associacao
	 * 
	 */
	private Cliente cliente;
	
	
	/**
	 * @param cliente
	 * Visibilidade: Parametro
	 * Relacionamento: Dependencia
	 * 
	 */
	public void method(Cliente cliente) { // Visibilidade
		
		
		/**
		 * Visibilidade: local 
		 * Relacionamento: Dependencia
		 * 
		 */
		Cliente var = new Cliente();
	}
	
	

}

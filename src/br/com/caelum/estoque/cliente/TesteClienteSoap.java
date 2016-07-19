package br.com.caelum.estoque.cliente;

public class TesteClienteSoap {

	public static void main(String[] args) throws Exception {

		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSPort();
		ListaItens lista = cliente.todosOsItens();

		System.out.println("Resposta do serviço: " + lista);
		for (Item item : lista.item) {
			System.out.println(item.getNome());
		}

		/*
		 * URL url = new URL("http://localhost:8080/estoquews?wsdl"); QName
		 * qname = new QName("http://ws.estoque.caelum.com.br/",
		 * "EstoqueWSService");
		 * 
		 * Service service = Service.create(url, qname);
		 * 
		 * EstoqueWS cliente = service.getPort(EstoqueWS.class);
		 * 
		 * Filtro filtro = new Filtro(); filtro.setNome("IPhone");
		 * filtro.setTipo(TipoItem.CELULAR); ;
		 * 
		 * ListaItens lista = cliente.todosOsItens();
		 * 
		 * for (Item item : lista.item) { System.out.println(item.getNome()); }
		 */

	}

}

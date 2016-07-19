
package br.com.caelum.estoque.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.estoque.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CadastrarItemResponse_QNAME = new QName("http://ws.estoque.caelum.com.br/", "CadastrarItemResponse");
    private final static QName _TodosOsItens_QNAME = new QName("http://ws.estoque.caelum.com.br/", "todosOsItens");
    private final static QName _Token_QNAME = new QName("http://ws.estoque.caelum.com.br/", "token");
    private final static QName _CadastrarItem_QNAME = new QName("http://ws.estoque.caelum.com.br/", "CadastrarItem");
    private final static QName _TodosOsItens2_QNAME = new QName("http://ws.estoque.caelum.com.br/", "todosOsItens2");
    private final static QName _Filtros_QNAME = new QName("http://ws.estoque.caelum.com.br/", "filtros");
    private final static QName _TodosOsItens3_QNAME = new QName("http://ws.estoque.caelum.com.br/", "todosOsItens3");
    private final static QName _TodosOsItens2Response_QNAME = new QName("http://ws.estoque.caelum.com.br/", "todosOsItens2Response");
    private final static QName _AutorizacaoFault_QNAME = new QName("http://ws.estoque.caelum.com.br/", "AutorizacaoFault");
    private final static QName _ListaItens_QNAME = new QName("http://ws.estoque.caelum.com.br/", "listaItens");
    private final static QName _TodosOsItensResponse_QNAME = new QName("http://ws.estoque.caelum.com.br/", "todosOsItensResponse");
    private final static QName _Itens_QNAME = new QName("http://ws.estoque.caelum.com.br/", "itens");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.estoque.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Itens }
     * 
     */
    public Itens createItens() {
        return new Itens();
    }

    /**
     * Create an instance of {@link InfoFault }
     * 
     */
    public InfoFault createInfoFault() {
        return new InfoFault();
    }

    /**
     * Create an instance of {@link ListaItens }
     * 
     */
    public ListaItens createListaItens() {
        return new ListaItens();
    }

    /**
     * Create an instance of {@link TodosOsItensResponse }
     * 
     */
    public TodosOsItensResponse createTodosOsItensResponse() {
        return new TodosOsItensResponse();
    }

    /**
     * Create an instance of {@link TodosOsItens2Response }
     * 
     */
    public TodosOsItens2Response createTodosOsItens2Response() {
        return new TodosOsItens2Response();
    }

    /**
     * Create an instance of {@link CadastrarItem }
     * 
     */
    public CadastrarItem createCadastrarItem() {
        return new CadastrarItem();
    }

    /**
     * Create an instance of {@link TodosOsItens2 }
     * 
     */
    public TodosOsItens2 createTodosOsItens2() {
        return new TodosOsItens2();
    }

    /**
     * Create an instance of {@link Filtros }
     * 
     */
    public Filtros createFiltros() {
        return new Filtros();
    }

    /**
     * Create an instance of {@link TodosOsItens3 }
     * 
     */
    public TodosOsItens3 createTodosOsItens3() {
        return new TodosOsItens3();
    }

    /**
     * Create an instance of {@link CadastrarItemResponse }
     * 
     */
    public CadastrarItemResponse createCadastrarItemResponse() {
        return new CadastrarItemResponse();
    }

    /**
     * Create an instance of {@link TodosOsItens }
     * 
     */
    public TodosOsItens createTodosOsItens() {
        return new TodosOsItens();
    }

    /**
     * Create an instance of {@link TokenUsuario }
     * 
     */
    public TokenUsuario createTokenUsuario() {
        return new TokenUsuario();
    }

    /**
     * Create an instance of {@link Filtro }
     * 
     */
    public Filtro createFiltro() {
        return new Filtro();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "CadastrarItemResponse")
    public JAXBElement<CadastrarItemResponse> createCadastrarItemResponse(CadastrarItemResponse value) {
        return new JAXBElement<CadastrarItemResponse>(_CadastrarItemResponse_QNAME, CadastrarItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "todosOsItens")
    public JAXBElement<TodosOsItens> createTodosOsItens(TodosOsItens value) {
        return new JAXBElement<TodosOsItens>(_TodosOsItens_QNAME, TodosOsItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "token")
    public JAXBElement<TokenUsuario> createToken(TokenUsuario value) {
        return new JAXBElement<TokenUsuario>(_Token_QNAME, TokenUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "CadastrarItem")
    public JAXBElement<CadastrarItem> createCadastrarItem(CadastrarItem value) {
        return new JAXBElement<CadastrarItem>(_CadastrarItem_QNAME, CadastrarItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItens2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "todosOsItens2")
    public JAXBElement<TodosOsItens2> createTodosOsItens2(TodosOsItens2 value) {
        return new JAXBElement<TodosOsItens2>(_TodosOsItens2_QNAME, TodosOsItens2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filtros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "filtros")
    public JAXBElement<Filtros> createFiltros(Filtros value) {
        return new JAXBElement<Filtros>(_Filtros_QNAME, Filtros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItens3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "todosOsItens3")
    public JAXBElement<TodosOsItens3> createTodosOsItens3(TodosOsItens3 value) {
        return new JAXBElement<TodosOsItens3>(_TodosOsItens3_QNAME, TodosOsItens3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItens2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "todosOsItens2Response")
    public JAXBElement<TodosOsItens2Response> createTodosOsItens2Response(TodosOsItens2Response value) {
        return new JAXBElement<TodosOsItens2Response>(_TodosOsItens2Response_QNAME, TodosOsItens2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "AutorizacaoFault")
    public JAXBElement<InfoFault> createAutorizacaoFault(InfoFault value) {
        return new JAXBElement<InfoFault>(_AutorizacaoFault_QNAME, InfoFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "listaItens")
    public JAXBElement<ListaItens> createListaItens(ListaItens value) {
        return new JAXBElement<ListaItens>(_ListaItens_QNAME, ListaItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "todosOsItensResponse")
    public JAXBElement<TodosOsItensResponse> createTodosOsItensResponse(TodosOsItensResponse value) {
        return new JAXBElement<TodosOsItensResponse>(_TodosOsItensResponse_QNAME, TodosOsItensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Itens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.estoque.caelum.com.br/", name = "itens")
    public JAXBElement<Itens> createItens(Itens value) {
        return new JAXBElement<Itens>(_Itens_QNAME, Itens.class, null, value);
    }

}

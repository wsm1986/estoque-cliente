
package br.com.caelum.estoque.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de todosOsItens2Response complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="todosOsItens2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itens2" type="{http://ws.estoque.caelum.com.br/}listaItens" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "todosOsItens2Response", propOrder = {
    "itens2"
})
public class TodosOsItens2Response {

    protected ListaItens itens2;

    /**
     * Obtém o valor da propriedade itens2.
     * 
     * @return
     *     possible object is
     *     {@link ListaItens }
     *     
     */
    public ListaItens getItens2() {
        return itens2;
    }

    /**
     * Define o valor da propriedade itens2.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaItens }
     *     
     */
    public void setItens2(ListaItens value) {
        this.itens2 = value;
    }

}

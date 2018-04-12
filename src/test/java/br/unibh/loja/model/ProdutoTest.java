/**
 * 
 */
package br.unibh.loja.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * @author Timoshenko
 *
 */
public class ProdutoTest {

	/**
	 * Criação e impressão de um objeto
	 */
	@Test
	public void testCreateNewObject() {

		Categoria categoria10 = new Categoria(10l, "Categoria 10");
		Produto produto10 = new Produto(10l, "Produto 10", "Descrição Produto 10", categoria10, new BigDecimal(10),
				"Fabricante 10");
		assertEquals(produto10.getId(), new Long(10l));
		assertEquals(produto10.getNome(), "Produto 10");
		assertEquals(produto10.getDescricao(), "Descrição Produto 10");
		assertEquals(produto10.getCategoria(), categoria10);
		assertEquals(produto10.getPreco(), new BigDecimal(10));
		assertEquals(produto10.getFabricante(), "Fabricante 10");

	}

	/**
	 * Comparação de objetos
	 */
	@Test
	public void testCompareTwoObjects() {

		Categoria categoria10 = new Categoria(10l, "Categoria 10");
		Produto produto1 = new Produto(10l, "Produto 10", "Descrição Produto 10", categoria10, new BigDecimal(10),
				"Fabricante 10");
		Produto produto2 = new Produto(10l, "Produto 10", "Descrição Produto 10", categoria10, new BigDecimal(10),
				"Fabricante 10");
		assertEquals(produto1, produto2);

	}

	private static final String OBJECT = "Produto [id=10, nome=Produto 10, descricao=Descrição Produto 10, categoria=Categoria [id=10, descricao=Categoria 10], preco=10, fabricante=Fabricante 10]";

	/**
	 * Impressão do objeto utilizando o toString()
	 */
	@Test
	public void testPrintObject() {
		Categoria categoria10 = new Categoria(10l, "Categoria 10");
		Produto produto1 = new Produto(10l, "Produto 10", "Descrição Produto 10", categoria10, new BigDecimal(10),
				"Fabricante 10");
		assertEquals(produto1.toString(), OBJECT);
	}

}

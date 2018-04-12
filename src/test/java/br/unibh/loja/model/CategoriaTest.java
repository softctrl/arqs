/**
 * 
 */
package br.unibh.loja.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Timoshenko
 *
 */
public class CategoriaTest {

	/**
	 * Criação e impressão de um objeto
	 */
	@Test
	public void testCreateNewObject() {

		Categoria categoria10 = new Categoria(10l, "Categoria 10");
		assertEquals(categoria10.getId(), new Long(10l));
		assertEquals(categoria10.getDescricao(), "Categoria 10");

	}

	/**
	 * Comparação de objetos
	 */
	@Test
	public void testCompareTwoObjects() {

		Categoria categoria1 = new Categoria(10l, "Categoria 10");
		Categoria categoria2 = new Categoria(10l, "Categoria 10");
		assertEquals(categoria1, categoria2);

	}

	private static final String OBJECT = "Categoria [id=10, descricao=Categoria 10]";

	/**
	 * Impressão do objeto utilizando o toString()
	 */
	@Test
	public void testPrintObject() {
		Categoria categoria10 = new Categoria(10l, "Categoria 10");
		assertEquals(categoria10.toString(), OBJECT);
	}

}

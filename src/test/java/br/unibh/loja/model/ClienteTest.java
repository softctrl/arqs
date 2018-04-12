/**
 * 
 */
package br.unibh.loja.model;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * @author Timoshenko
 *
 */
public class ClienteTest {

	private static final Date NASCIMENTO;
	private static final Date CADASTRO;

	static {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			NASCIMENTO = sdf.parse("20010510");
			CADASTRO = sdf.parse("20180411");
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * Criação e impressão de um objeto
	 */
	@Test
	public void testCreateNewObject() {

		Cliente cliente = new Cliente(10l, "Cliente 10", "login10", "senha10", "perfil10", "99999999999",
				"3198756453254654", "fulano@email.com", NASCIMENTO, CADASTRO);

		assertEquals(cliente.getId(), new Long(10l));
		assertEquals(cliente.getNome(), "Cliente 10");
		assertEquals(cliente.getLogin(), "login10");
		assertEquals(cliente.getSenha(), "senha10");
		assertEquals(cliente.getPerfil(), "perfil10");
		assertEquals(cliente.getCpf(), "99999999999");
		assertEquals(cliente.getTelefone(), "3198756453254654");
		assertEquals(cliente.getEmail(), "fulano@email.com");
		assertEquals(cliente.getDataNascimento(), NASCIMENTO);
		assertEquals(cliente.getDataCadastro(), CADASTRO);

	}

	/**
	 * Comparação de objetos
	 */
	@Test
	public void testCompareTwoObjects() {

		Date dataNascimento = new Date();
		Date dataCadastro = new Date();
		Cliente cliente1 = new Cliente(10l, "Cliente 10", "login10", "senha10", "perfil10", "99999999999",
				"3198756453254654", "fulano@email.com", dataNascimento, dataCadastro);
		Cliente cliente2 = new Cliente(10l, "Cliente 10", "login10", "senha10", "perfil10", "99999999999",
				"3198756453254654", "fulano@email.com", dataNascimento, dataCadastro);
		assertEquals(cliente1, cliente2);

	}

	private static final String OBJECT = "Cliente [id=10, nome=Cliente 10, login=login10, senha=senha10, perfil=perfil10, cpf=99999999999, telefone=3198756453254654, email=fulano@email.com, dataNascimento=Thu May 10 00:00:00 BRT 2001, dataCadastro=Wed Apr 11 00:00:00 BRT 2018]";

	/**
	 * Impressão do objeto utilizando o toString()
	 */
	@Test
	public void testPrintObject() {
		Cliente cliente = new Cliente(10l, "Cliente 10", "login10", "senha10", "perfil10", "99999999999",
				"3198756453254654", "fulano@email.com", NASCIMENTO, CADASTRO);
		assertEquals(cliente.toString(), OBJECT);
	}

}

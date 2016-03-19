package br.edu.veris.service.impl;

import org.junit.Test;

import br.edu.veris.service.LogLevel;

/**
 * Casos de teste de log
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 1.0.1
 *
 */
public class LogFactoryTest {

	@Test
	public void LogInfo() {
		String mensagem = "Mensagem Log Info.";

		LogFactory factory = LogFactory.getInstance();
		factory.logger(LogLevel.INFO, mensagem);
	}

	@Test
	public void LogWarning() {
		String mensagem = "Mensagem Log Warning.";

		LogFactory factory = LogFactory.getInstance();
		factory.logger(LogLevel.WARNING, mensagem);
	}

	@Test
	public void LogError() {
		String mensagem = "Mensagem Log Error.";

		LogFactory factory = LogFactory.getInstance();
		factory.logger(LogLevel.ERROR, mensagem);
	}
}

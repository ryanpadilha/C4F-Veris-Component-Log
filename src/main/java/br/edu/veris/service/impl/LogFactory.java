package br.edu.veris.service.impl;

import br.edu.veris.service.ILogService;
import br.edu.veris.service.LogLevel;

/**
 * Factory
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 1.0.1
 *
 */
public class LogFactory implements ILogService {

	private static LogFactory instance;

	private LogFactory() {
	}

	public static LogFactory getInstance() {
		if (null == instance) {
			instance = new LogFactory();
		}

		return instance;
	}

	public void logger(LogLevel nivelLog, String mensagem) {

		switch (nivelLog) {
		case INFO:
			System.out.println("INFO: " + mensagem);
			break;
		case WARNING:
			System.out.println("WARNING: " + mensagem);
			break;

		case ERROR:
			System.out.println("ERROR: " + mensagem);
			break;
		default:
			// TODO: verificar comportamento padrao
			break;
		}
	}

}

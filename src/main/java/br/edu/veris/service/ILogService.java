package br.edu.veris.service;

/**
 * Contrato de serviço de log factory.
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 1.0.1
 *
 */
public interface ILogService {
	void logger(LogLevel nivelLog, String mensagem);
}

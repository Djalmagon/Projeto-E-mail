package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AppTest {

	@org.junit.Test
	public void testeEmail() throws Exception {

		StringBuilder stringBuilderTextoEmail = new StringBuilder();

		stringBuilderTextoEmail.append("Olá <br/><br/>");
		stringBuilderTextoEmail.append("Clique aqui. <br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://www.google.com.br/\" style=\"color:#2525a7; padding:14px 25px; text-align:center; text-decoration:none; display:inline-block; border-radius:30px; font-size:20px; font-family:courier; border:3px solid green; background-color:#99DA39;\">Clique AQUI</a>");

		String listaDestinatario = "projetosteste9393@gmail.com";

		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail(listaDestinatario, "Djalma Souza",
				"Testando E-mail com Java.", stringBuilderTextoEmail.toString());

		enviaEmail.enviarEmailAnexo(true);
	}
}

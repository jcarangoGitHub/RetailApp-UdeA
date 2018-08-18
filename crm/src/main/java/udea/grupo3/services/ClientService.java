package udea.grupo3.services;

import io.swagger.model.Client;

public class ClientService {

	public Client getClientById(String id) {
		Client client = new Client();
		if (id.equals("1")) {
			client.setId("1");
			client.setName("Diana Ciro");
		} else if (id.equals("2")) {
			client.setId("2");
			client.setName("Jorge Agudelo");
		}
		return client;
	}

}

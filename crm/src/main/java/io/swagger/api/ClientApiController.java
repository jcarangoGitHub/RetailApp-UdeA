package io.swagger.api;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Client;
import udea.grupo3.services.ClientService;

@Controller
public class ClientApiController implements ClientApi {

	private ClientService clientService;
	
    public ClientApiController() {
        clientService = new ClientService();
    }

    public ResponseEntity<Client> getClientById(@ApiParam(value = "client's ID",required=true) @PathVariable("clientId") String clientId) {
       Client client = clientService.getClientById(clientId);
       client.add(linkTo(ClientApi.class).slash(client.getIdClient()).withSelfRel());
       
       HttpHeaders responseHeaders = new HttpHeaders();
       responseHeaders.setExpires(1000);
       responseHeaders.set("MiHeader", "valor x");

		return new ResponseEntity<Client>(client, responseHeaders, HttpStatus.OK);
    }

}

/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Client;

@Api(value = "client", description = "the client API")
@RequestMapping("/client")
public interface ClientApi {

    @ApiOperation(value = "get client by ID", nickname = "getClientById", notes = "Returns a client", response = Client.class, tags={ "analistasDeCartera", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "devolver el resultado obtenido", response = Client.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Client not found") })
    @RequestMapping(value = "/{clientId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Client> getClientById(@ApiParam(value = "client's ID",required=true) @PathVariable("clientId") String clientId);

}

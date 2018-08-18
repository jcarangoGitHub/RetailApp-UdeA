/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Venta;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "venta", description = "the venta API")
public interface VentaApi {

    @ApiOperation(value = "registra una venta", nickname = "registerSale", notes = "registrar una venta", tags={ "vendedores","administradores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "venta registrada"),
        @ApiResponse(code = 400, message = "entrada no valida, objeto no valido"),
        @ApiResponse(code = 409, message = "ya existe esta venta") })
    @RequestMapping(value = "/venta",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> registerSale(@ApiParam(value = "venta a registrar"  )  @Valid @RequestBody Venta venta);

}

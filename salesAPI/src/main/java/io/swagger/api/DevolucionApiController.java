package io.swagger.api;

import io.swagger.infraestructura.KafkaSender;
import io.swagger.model.Devolucion;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class DevolucionApiController implements DevolucionApi {

    @Autowired
    private KafkaSender sender;

    private static final Logger log = LoggerFactory.getLogger(DevolucionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DevolucionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> registerRefund(@ApiParam(value = "devolucion a registrar"  )  @Valid @RequestBody Devolucion devolucion) {
        sender.enviarMensaje("aubde8gv-devoluciones", devolucion.toString());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

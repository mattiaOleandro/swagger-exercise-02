package co.develhope.swaggerexercise02.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @GetMapping
    @ApiOperation(value = "Default message", notes = "Print out the default message for the User")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 202, message = "Created"),
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 500, message = "Internal error from spring", response = String.class)
    })
    public String getDefault(){

        return "Welcome on exercise Swagger 02";
    }
}

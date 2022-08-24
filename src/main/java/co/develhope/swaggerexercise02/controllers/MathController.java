package co.develhope.swaggerexercise02.controllers;

import co.develhope.swaggerexercise02.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping(value = "")
    @ApiOperation(value = "Math message", notes = "Print out the math message for the User")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 202, message = "Created"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal error from spring", response = String.class)
    })
    public String welcomeMathMsg(){

        return "Welcome in Math";
    }

    @GetMapping(value = "division-info")
    @ApiOperation(value = "Division info", notes = "Print out the message with all the details about the division for the User")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 202, message = "Created"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Internal error from spring", response = String.class)
    })
    public ArithmeticOperation divisionInfo(){

        return new ArithmeticOperation("Division info",2,"Performs the division",
                new String[]{"Invariant property", "Distributive property"});
    }

    @GetMapping(value = "multiplication")
    @ApiOperation(value = "Multiplication", notes = "It takes the input parameters and print out the multiplication value for the User")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 202, message = "Created"),
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 500, message = "Internal error from spring", response = String.class)
    })
    public int multiplication(@RequestParam int x, int y){

        return Math.multiplyExact(x,y);
    }

    @GetMapping(value = "square/{n}")
    @ApiOperation(value = "square", notes = "Print out the square of the `n` for the User")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 202, message = "Created"),
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 500, message = "Internal error from spring", response = String.class)
    })
    public double square(@ApiParam(value = "Is the number on which to square") @PathVariable int n){

        return Math.pow(n,2);
    }
}

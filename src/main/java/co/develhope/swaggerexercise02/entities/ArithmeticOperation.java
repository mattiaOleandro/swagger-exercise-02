package co.develhope.swaggerexercise02.entities;

import io.swagger.annotations.ApiModelProperty;

public class ArithmeticOperation {

    @ApiModelProperty(value = "The name of the arithmetic operation", example = "Division")
    private String name;
    @ApiModelProperty(value = "Minimum number of operands needed to perform the operation", example = "2")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "The description of the operation", example = "addend + addend = sum")
    private String description;
    @ApiModelProperty(value = "A list of properties of the specific operation", example = "[Invariant property, Distributive property]")
    private String[] properties;

    public ArithmeticOperation(){}

    public ArithmeticOperation(String name, int minNumberOfOperands, String description, String[] properties){

        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}

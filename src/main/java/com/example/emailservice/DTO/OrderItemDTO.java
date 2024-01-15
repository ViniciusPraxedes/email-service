package com.example.emailservice.DTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {
    @NotBlank(message = "Item code cannot be blank")
    private String itemCode;

    @NotBlank(message = "Product name cannot be blank")
    private String productName;

    @DecimalMin(value = "0.01", inclusive = true, message = "Price must be greater than or equal to 0.01")
    private BigDecimal price;

    @Min(value = 1, message = "Quantity must be greater than or equal to 1")
    private Integer quantity;
}

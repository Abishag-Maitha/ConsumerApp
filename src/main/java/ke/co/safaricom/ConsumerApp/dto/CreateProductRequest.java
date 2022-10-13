package ke.co.safaricom.ConsumerApp.dto;

import javax.validation.constraints.NotBlank;

public class CreateProductRequest {
    @NotBlank
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

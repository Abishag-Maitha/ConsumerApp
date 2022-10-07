package ke.co.safaricom.ConsumerApp.dto;

import javax.validation.constraints.NotBlank;

public class CreateProductRequest {
    @NotBlank
    private String product_name;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}

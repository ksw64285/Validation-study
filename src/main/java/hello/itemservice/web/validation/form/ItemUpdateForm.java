package hello.itemservice.web.validation.form;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String itemName;

    @org.jetbrains.annotations.NotNull
    @Range(min = 1000, max = 1000000)
    private Integer price;

    @NotNull // 수정에서는 수량을 자유롭게 바꿀 수 있다
    private Integer quantity;
}

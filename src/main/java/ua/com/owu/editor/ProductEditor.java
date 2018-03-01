package ua.com.owu.editor;

import org.springframework.stereotype.Component;
import ua.com.owu.entity.Product;

import java.beans.PropertyEditorSupport;

@Component
public class ProductEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Product product = new Product(text,"smartphone");
        setValue(product);
    }
}

package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void getName_whenProductMade_shouldReturnCorrectName(){
        Product currentProduct = new Product("Laptop",1200.00);
        String actualName = currentProduct.getName();
        assertThat(actualName)
                .isEqualTo("Laptop");
    }

    @Test
    void getPrice_whenProductCreated_shouldReturnCorrectPrice() {
        Product currentProduct = new Product("Laptop", 1200);
        double actualPrice = currentProduct.getPrice();
        assertThat(actualPrice)
                .isCloseTo(1200, within(0.01));
    }

    @Test
    void getPriceWithTax_whenProductCreated_shouldReturnCorrectTotal() {

        Product currentProduct = new Product("Laptop", 1200);
        double expectedTotal = 1200 * 1.05;
        double actualTotal = currentProduct.getPriceWithTax();
        assertThat(actualTotal)
                .isCloseTo(expectedTotal, within(0.01));
    }

    @Test
    void constructor_whenNameIsNull_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product(null, 100)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void constructor_whenNameIsEmpty_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product("", 100)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void constructor_whenNameIsBlank_shouldThrowException() {
        assertThatThrownBy(() ->
                new Product(" ", 100)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void constructor_whenPriceIsNegative_shouldThrowException(){
        assertThatThrownBy(() ->
                new Book("Laptop", -1.49)
        ).isInstanceOf(IllegalArgumentException.class);
    }

}
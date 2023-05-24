package indra.data;

import indra.Annotation.Fancy;

@Fancy(name = "Car", tags= {"Application","Java"})
public interface Car extends HasBrand {

    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    }
}

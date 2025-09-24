package r5a08.example.project;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserGreatingTest {
    @Test
    public void when_titi_provided_should_return_correct_greating(){
        //Arrange

        //Act
        String expected = "Bonjour, titi";
        String actual = UserGreating.formatGreating("titi");

        //assert

        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void when_input_is_more_than_10_character(){

        //act assert
        Assertions.assertThrows(UserGreatingFailureException.class,()-> {
            UserGreating.formatGreating("abcdefghijklmnopqres");
        });
    }
    @Test
    public void when_input_is_empty(){

        //act assert
         Assertions.assertThrows(UserGreatingFailureException.class,()-> {
            UserGreating.formatGreating("");
        });
    }
    @Test
    public void when_input_is_special_character(){

        //act assert
         Assertions.assertThrows(UserGreatingFailureException.class,()-> {
            UserGreating.formatGreating("/");
        });
    }
}

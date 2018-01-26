package tizazu.com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicNumber {
    @RequestMapping("/")

    public String MagicNumber(@RequestParam("number") int number) {
        String result="";
        result+=number +"<br/n>";
        
        while (number>1) {
            if ((number % 2) == 0){
                number = (number / 2);
                result += number +"<br/n>" ;}

            else if ((number % 2) != 0) {

                 number = (3 * number) + 1;
                result += number +"<br/n>";
            }

        }

        return  result;

    }
}

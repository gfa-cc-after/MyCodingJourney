package MavenTestProjectLogin.MavenTestProjectLogin.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    @RequestMapping(value = "/api/**", method = RequestMethod.OPTIONS)
    public void corsHeaders() {
        // The presence of this method will ensure that the preflight request is handled
    }
}

package tr.com.t2.labs.rest;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.UUID;

/**
 * Created by mertcaliskan
 * on 13/07/15.
 */
@Controller
@Path("/")
public class HelloWorldRestService {

    @GET
    @Produces("application/json")
    public Response sayHello() {
        return Response.status(200).entity(UUID.randomUUID().toString()).build();
    }
}

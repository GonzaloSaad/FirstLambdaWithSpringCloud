package example;

import example.model.Request;
import example.model.Response;
import org.springframework.stereotype.Component;

import java.util.function.Function;


@Component("gonzaFunction")
public class TheFunction implements Function<Request, Response> {

    @Override
    public Response apply(Request request) {
        Response response = new Response();
        response.setAnInt(request.getAnInt() + request.getAnOtherInt());
        response.setaString("The request had, " + request.getaString());
        return response;
    }
}

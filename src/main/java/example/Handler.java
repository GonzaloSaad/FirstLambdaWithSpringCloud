package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import org.springframework.cloud.function.adapter.aws.SpringBootApiGatewayRequestHandler;

public class Handler extends SpringBootApiGatewayRequestHandler {

    @Override
    public Object handleRequest(APIGatewayProxyRequestEvent event, Context context) {
        context.getLogger().log(event.getBody()+"\n");
        return super.handleRequest(event,context);
    }

}

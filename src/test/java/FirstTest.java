import org.junit.Test;
import org.mule.DefaultMuleEvent;
import org.mule.MessageExchangePattern;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.munit.runner.functional.FunctionalMunitSuite;
import org.mule.tck.MuleTestUtils;

import static org.junit.Assert.assertEquals;
import static org.mule.munit.common.mocking.Attribute.attribute;

public class FirstTest extends FunctionalMunitSuite {
    @Override
    protected String getConfigResources() {
        return "mule-config.xml";
    }

    @Test
    public void testEchoFlow() throws Exception {
        MuleEvent resultEvent = runFlow("echoFlow", testEvent("Hello world!"));
        assertEquals("Hello world!", resultEvent.getMessage().getPayloadAsString());
    }
}

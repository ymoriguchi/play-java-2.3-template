import static org.fest.assertions.Assertions.*;
import static play.test.Helpers.*;

import org.junit.Test;

import jp.co.imjp.ccjc.cokeoff.controllers.ControlPanelController.PurchaseData;
import play.data.Form;
import play.twirl.api.Content;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
    	
		Form<PurchaseData> form = Form.form(PurchaseData.class);
        Content html = jp.co.imjp.ccjc.cokeoff.views.html.pages.panel.Index.render(form);
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Your new application is ready.");
    }


}

/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.foodieland.components.fl__002d__subscribe;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class fl__002d__subscribe__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
out.write("\r\n");
_global_model = renderContext.call("use", com.foodieland.core.models.Subscribe.class.getName(), obj());
out.write("<div class=\"cmp-subscribe\">\r\n\t\r\n\t<div class=\"cmp-subscribe__title\">\r\n\t\t<h2 class=\"cmp-subscribe__title--text\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\r\n\t</div>\r\n\t\r\n\t<div class=\"cmp-subscribe__description\">\r\n\t\t<p class=\"cmp-subscribe__description--text\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\r\n\t</div>\r\n\t\r\n\t<div class=\"cmp-subscribe__email\">\r\n\t\t<form class=\"cmp-subscribe__email--form\" action=\"/test-components.html\">\r\n\t\t\t<input class=\"cmp-subscribe__email--text\" type=\"text\" value=\"Your email address...\"/>\r\n\t\t\t<input class=\"cmp-subscribe__email--button\" type=\"submit\" value=\"Subscribe\"/>\r\n\t\t</form>\r\n\t</div>\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


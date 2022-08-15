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
package org.apache.sling.scripting.sightly.apps.foodieland.components.fl__002d__title;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class fl__002d__title__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_fltitle = null;
Object _global_button = null;
out.write("\r\n");
_global_fltitle = renderContext.call("use", com.foodieland.core.models.FlTitle.class.getName(), obj());
_global_button = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Button.class.getName(), obj());
out.write("<div class=\"cmp-fltitle\">\r\n\t\r\n\t<div class=\"cmp-fltitle__title\">\r\n\t\t");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_fltitle, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<h2>");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_fltitle, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</h2>");
    }
}
out.write("\r\n\t</div>\r\n\t<div class=\"cmp-fltitle__button\">");
{
    Object var_includedresult2 = renderContext.call("include", "button.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult2));
}
out.write("</div>\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


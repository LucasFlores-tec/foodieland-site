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
package org.apache.sling.scripting.sightly.apps.foodieland.components.simplerecipe;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class simplerecipe__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_simplerecipe = null;
Object _global_placeholdertemplate = null;
out.write("\r\n");
_global_simplerecipe = renderContext.call("use", com.foodieland.core.models.SimpleRecipe.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-simplerecipe\">\r\n\t\r\n\t<div class=\"cmp-simplerecipe__image\">\r\n\t\t<div class=\"cmp-simplerecipe__image-sr\">");
{
    Object var_includedresult0 = renderContext.call("include", "image.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult0));
}
out.write("</div>\r\n\t</div>\r\n\t\r\n\t");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("<div class=\"cmp-simplerecipe__title\">\r\n\t\t<h4 class=\"cmp-simplerecipe__title-sr\">");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</h4>\r\n\t</div>");
    }
}
out.write("\r\n\t\r\n\t<div class=\"cmp-simplerecipe__timeandcategory\">\r\n\t\t");
{
    Object var_testvariable4 = renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "time");
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        out.write("<div class=\"cmp-simplerecipe__timeandcategory--time\">\r\n\t\t\t<p>");
        {
            Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "time"), "text");
            out.write(renderContext.getObjectModel().toString(var_5));
        }
        out.write("</p>\r\n\t\t</div>");
    }
}
out.write("\r\n\t\t");
{
    Object var_testvariable6 = renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "select");
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        out.write("<div class=\"cmp-simplerecipe__timeandcategory--category\">\r\n\t\t\t<p>");
        {
            Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "select"), "text");
            out.write(renderContext.getObjectModel().toString(var_7));
        }
        out.write("</p>\r\n\t\t</div>");
    }
}
out.write("\r\n\t</div>\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


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
package org.apache.sling.scripting.sightly.apps.foodieland.components.recipe;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class recipe__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_recipe = null;
Object _global_placeholdertemplate = null;
Object _global_hascontent = null;
out.write("\r\n");
_global_recipe = renderContext.call("use", com.foodieland.core.models.Recipe.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_hascontent = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_recipe, "empty")));
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("<div class=\"cmp-recipe\">\r\n\t\r\n\t<div class=\"cmp-recipe__data\">\r\n\t\t<h4 class=\"cmp-recipe__type\">");
    {
        Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "type"), "text");
        out.write(renderContext.getObjectModel().toString(var_0));
    }
    out.write("</h4>\r\n\t\t<h2 class=\"cmp-recipe__title\">");
    {
        Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "title"), "text");
        out.write(renderContext.getObjectModel().toString(var_1));
    }
    out.write("</h2>\r\n\t\t<p class=\"cmp-recipe__description\">");
    {
        Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "description"), "text");
        out.write(renderContext.getObjectModel().toString(var_2));
    }
    out.write("</p>\r\n\t\t<h4 class=\"cmp-recipe__time\">");
    {
        Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "prepare"), "text");
        out.write(renderContext.getObjectModel().toString(var_3));
    }
    out.write("</h4>\r\n\t\t<h4 class=\"cmp-recipe__ingredient\">");
    {
        Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "ingredient"), "text");
        out.write(renderContext.getObjectModel().toString(var_4));
    }
    out.write("</h4>\r\n\t\t<h4 class=\"cmp-recipe__authorName\">");
    {
        Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "name"), "text");
        out.write(renderContext.getObjectModel().toString(var_5));
    }
    out.write("</h4>\r\n\t\t<h4 class=\"cmp-recipe__date\">");
    {
        Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "date"), "text");
        out.write(renderContext.getObjectModel().toString(var_6));
    }
    out.write("</h4>\r\n\t\t<a");
    {
        Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_global_recipe, "link");
        {
            Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "uri");
            {
                boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                if (var_shoulddisplayattr10) {
                    out.write(" href");
                    {
                        boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                        if (!var_istrueattr9) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(">\r\n\t\t\t<button>View Recipe</button>\r\n\t\t</a>\r\n\t</div>\r\n\t\r\n\t<div class=\"cmp-recipe__image\">\r\n\t\t<div>");
    {
        Object var_resourcecontent11 = renderContext.call("includeResource", ".", obj().with("resourceType", "core/wcm/components/image/v3/image"));
        out.write(renderContext.getObjectModel().toString(var_resourcecontent11));
    }
    out.write("</div>\r\n\t</div>\r\n\t\r\n</div>");
}
out.write("\r\n");
{
    Object var_templatevar12 = renderContext.getObjectModel().resolveProperty(_global_placeholdertemplate, "placeholder");
    {
        boolean var_templateoptions13_field$_isempty = false;
        {
            java.util.Map var_templateoptions13 = obj().with("isEmpty", var_templateoptions13_field$_isempty);
            callUnit(out, renderContext, var_templatevar12, var_templateoptions13);
        }
    }
}
out.write("\r\n\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


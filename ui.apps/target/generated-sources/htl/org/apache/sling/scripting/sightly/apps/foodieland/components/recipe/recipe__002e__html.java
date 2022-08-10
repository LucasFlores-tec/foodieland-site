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
Object _global_image = null;
Object _global_button = null;
out.write("\n");
_global_recipe = renderContext.call("use", com.foodieland.core.models.Recipe.class.getName(), obj());
_global_image = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Image.class.getName(), obj());
out.write("<div class=\"cmp-recipe\">\n\t\n\t<div class=\"cmp-recipe__data\">\n\t\t");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_recipe, "type");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<h4 class=\"cmp-recipe__type\">");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "type"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</h4>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_global_recipe, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("<h2 class=\"cmp-recipe__title\">");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</h2>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable4 = renderContext.getObjectModel().resolveProperty(_global_recipe, "description");
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        out.write("<p class=\"cmp-recipe__description\">");
        {
            Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "description"), "text");
            out.write(renderContext.getObjectModel().toString(var_5));
        }
        out.write("</p>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable6 = renderContext.getObjectModel().resolveProperty(_global_recipe, "prepare");
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        out.write("<h4 class=\"cmp-recipe__time\">");
        {
            Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "prepare"), "text");
            out.write(renderContext.getObjectModel().toString(var_7));
        }
        out.write("</h4>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable8 = renderContext.getObjectModel().resolveProperty(_global_recipe, "ingredient");
    if (renderContext.getObjectModel().toBoolean(var_testvariable8)) {
        out.write("<h4 class=\"cmp-recipe__ingredient\">");
        {
            Object var_9 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "ingredient"), "text");
            out.write(renderContext.getObjectModel().toString(var_9));
        }
        out.write("</h4>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable10 = renderContext.getObjectModel().resolveProperty(_global_recipe, "name");
    if (renderContext.getObjectModel().toBoolean(var_testvariable10)) {
        out.write("<h4 class=\"cmp-recipe__authorName\">");
        {
            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "name"), "text");
            out.write(renderContext.getObjectModel().toString(var_11));
        }
        out.write("</h4>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable12 = renderContext.getObjectModel().resolveProperty(_global_recipe, "date");
    if (renderContext.getObjectModel().toBoolean(var_testvariable12)) {
        out.write("<h4 class=\"cmp-recipe__date\">");
        {
            Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_recipe, "date"), "text");
            out.write(renderContext.getObjectModel().toString(var_13));
        }
        out.write("</h4>");
    }
}
out.write("\n\t\t");
_global_button = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Button.class.getName(), obj());
out.write("<button>\n\t    \t<span class=\"cmp-button__text\">View Recipe</span>\n\t\t</button>\n\t</div>\n\t\n\t<div class=\"cmp-recipe__image\">\n\t\t<a");
{
    Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_global_image, "link");
    {
        Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "uri");
        {
            boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
            if (var_shoulddisplayattr17) {
                out.write(" href");
                {
                    boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                    if (!var_istrueattr16) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("> \n\t\t\t<img class=\"cmp-recipe__image--img\"");
{
    Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(_global_recipe, "imageReference");
    {
        Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "uri");
        {
            boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (!((Object)false).equals(var_attrvalue18))));
            if (var_shoulddisplayattr21) {
                out.write(" src");
                {
                    boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                    if (!var_istrueattr20) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n\t\t</a>\n\t</div>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


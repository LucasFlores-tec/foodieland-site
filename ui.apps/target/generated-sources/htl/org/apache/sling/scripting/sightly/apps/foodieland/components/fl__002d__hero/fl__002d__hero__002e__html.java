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
package org.apache.sling.scripting.sightly.apps.foodieland.components.fl__002d__hero;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class fl__002d__hero__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_button = null;
out.write("\n");
_global_model = renderContext.call("use", com.foodieland.core.models.Hero.class.getName(), obj());
_global_button = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Button.class.getName(), obj());
out.write("<div class=\"cmp-recipe\">\n\t\n\t<div class=\"cmp-recipe__data\">\n\t\t");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_model, "type");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cmp-recipe__type\">\n\t\t\t<h4 class=\"cmp-recipe__type--text\">");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "type"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</h4>\n\t\t</div>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_global_model, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("<div class=\"cmp-recipe__title\">\n\t\t\t<h2 class=\"cmp-recipe__title--text\">");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</h2>\n\t\t</div>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable4 = renderContext.getObjectModel().resolveProperty(_global_model, "description");
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        out.write("<div class=\"cmp-recipe__description\">\n\t\t\t<p class=\"cmp-recipe__description--text\">");
        {
            Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "text");
            out.write(renderContext.getObjectModel().toString(var_5));
        }
        out.write("</p>\n\t\t</div>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable6 = renderContext.getObjectModel().resolveProperty(_global_model, "time");
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        out.write("<div class=\"cmp-recipe__time\">\n\t\t\t<h4 class=\"cmp-recipe__time--text\">");
        {
            Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "time"), "text");
            out.write(renderContext.getObjectModel().toString(var_7));
        }
        out.write("</h4>\n\t\t</div>");
    }
}
out.write("\n\t\t");
{
    Object var_testvariable8 = renderContext.getObjectModel().resolveProperty(_global_model, "ingredient");
    if (renderContext.getObjectModel().toBoolean(var_testvariable8)) {
        out.write("<div class=\"cmp-recipe__ingredient\">\n\t\t\t<h4 class=\"cmp-recipe__ingredient--text\">");
        {
            Object var_9 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "ingredient"), "text");
            out.write(renderContext.getObjectModel().toString(var_9));
        }
        out.write("</h4>\n\t\t</div>");
    }
}
out.write("\n\t\t<div class=\"cmp-recipe__image-name-date\">\n\t\t\t");
{
    Object var_testvariable10 = renderContext.getObjectModel().resolveProperty(_global_model, "imageAuthorReference");
    if (renderContext.getObjectModel().toBoolean(var_testvariable10)) {
        out.write("<div class=\"cmp-recipe__image-name-date--image\">\n\t\t\t\t<img class=\"cmp-recipe__image-name-date--image--author\"");
        {
            Object var_attrvalue11 = renderContext.getObjectModel().resolveProperty(_global_model, "imageAuthorReference");
            {
                Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "uri");
                {
                    boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
                    if (var_shoulddisplayattr14) {
                        out.write(" src");
                        {
                            boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                            if (!var_istrueattr13) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\n\t\t\t</div>");
    }
}
out.write("\n\t\t\t<div class=\"cmp-recipe__image-name-date--name-date\">\n\t\t\t\t");
{
    Object var_testvariable15 = renderContext.getObjectModel().resolveProperty(_global_model, "name");
    if (renderContext.getObjectModel().toBoolean(var_testvariable15)) {
        out.write("<div class=\"cmp-recipe__image-name-date--name-date__name\">\n\t\t\t\t\t<h4 class=\"cmp-recipe__image-name-date--name-date__name--text\">");
        {
            Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "name"), "text");
            out.write(renderContext.getObjectModel().toString(var_16));
        }
        out.write("</h4>\n\t\t\t\t</div>");
    }
}
out.write("\n\t\t\t\t");
{
    Object var_testvariable17 = renderContext.getObjectModel().resolveProperty(_global_model, "date");
    if (renderContext.getObjectModel().toBoolean(var_testvariable17)) {
        out.write("<div class=\"cmp-recipe__image-name-date--name-date__date\">\n\t\t\t\t\t<h4 class=\"cmp-recipe__image-name-date--name-date__date--text\">");
        {
            Object var_18 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "date"), "text");
            out.write(renderContext.getObjectModel().toString(var_18));
        }
        out.write("</h4>\n\t\t\t\t</div>");
    }
}
out.write("\n\t\t\t</div>\n\t\t</div>\n\t\t");
{
    Object var_testvariable19 = renderContext.getObjectModel().resolveProperty(_global_button, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable19)) {
        out.write("<div class=\"cmp-recipe__button\">");
        {
            Object var_includedresult20 = renderContext.call("include", "button.html", obj());
            out.write(renderContext.getObjectModel().toString(var_includedresult20));
        }
        out.write("</div>");
    }
}
out.write("\n\t</div>\n\t\n\t");
{
    Object var_testvariable23 = renderContext.getObjectModel().resolveProperty(_global_model, "imageReference");
    if (renderContext.getObjectModel().toBoolean(var_testvariable23)) {
        out.write("<div class=\"cmp-recipe__image\">\n\t\t<a");
        {
            Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(_global_model, "linkURL");
            {
                Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "uri");
                {
                    boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
                    if (var_shoulddisplayattr27) {
                        out.write(" href");
                        {
                            boolean var_istrueattr26 = (var_attrvalue24.equals(true));
                            if (!var_istrueattr26) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent25));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("> \n\t\t\t<img class=\"cmp-recipe__image--img\"");
        {
            Object var_attrvalue28 = renderContext.getObjectModel().resolveProperty(_global_model, "imageReference");
            {
                Object var_attrcontent29 = renderContext.call("xss", var_attrvalue28, "uri");
                {
                    boolean var_shoulddisplayattr31 = (((null != var_attrcontent29) && (!"".equals(var_attrcontent29))) && ((!"".equals(var_attrvalue28)) && (!((Object)false).equals(var_attrvalue28))));
                    if (var_shoulddisplayattr31) {
                        out.write(" src");
                        {
                            boolean var_istrueattr30 = (var_attrvalue28.equals(true));
                            if (!var_istrueattr30) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent29));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\n\t\t</a>\n\t</div>");
    }
}
out.write("\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


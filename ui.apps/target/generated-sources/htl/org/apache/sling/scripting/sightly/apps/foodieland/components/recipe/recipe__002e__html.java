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
Object _global_placeholdertemplate = null;
Object _global_button = null;
Collection var_attrmap15_list_coerced$ = null;
out.write("\r\n");
_global_recipe = renderContext.call("use", com.foodieland.core.models.Recipe.class.getName(), obj());
_global_image = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Image.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-recipe\">\r\n\t\r\n\t<div class=\"cmp-recipe__data\">\r\n\t\t");
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
out.write("\r\n\t\t");
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
out.write("\r\n\t\t");
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
out.write("\r\n\t\t");
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
out.write("\r\n\t\t");
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
out.write("\r\n\t\t");
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
out.write("\r\n\t\t");
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
out.write("\r\n\t\t");
_global_button = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Button.class.getName(), obj());
{
    Object var_tagvar14 = renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "buttonLink"), "valid")) ? "a" : "button"), "elementName");
    if (renderContext.getObjectModel().toBoolean(var_tagvar14)) {
        out.write("<");
        out.write(renderContext.getObjectModel().toString(var_tagvar14));
    }
    if (!renderContext.getObjectModel().toBoolean(var_tagvar14)) {
        out.write("<button");
    }
    {
        Object var_attrmap15 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "buttonLink"), "htmlAttributes");
        {
            Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_button, "accessibilityLabel");
            {
                Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
                {
                    boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
                    if (var_shoulddisplayattr19) {
                        out.write(" aria-label");
                        {
                            boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                            if (!var_istrueattr18) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            boolean var_attrvalue20 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_button, "data")) ? true : false);
            {
                Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
                {
                    boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (false != var_attrvalue20)));
                    if (var_shoulddisplayattr23) {
                        out.write(" data-cmp-clickable");
                        {
                            boolean var_istrueattr22 = (var_attrvalue20 == true);
                            if (!var_istrueattr22) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "data"), "json");
            {
                Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "attribute");
                {
                    boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
                    if (var_shoulddisplayattr27) {
                        out.write(" data-cmp-data-layer");
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
        {
            boolean var_ignoredattributes28_field$_data__002d__cmp__002d__data__002d__layer = true;
            {
                boolean var_ignoredattributes28_field$_data__002d__cmp__002d__clickable = true;
                {
                    boolean var_ignoredattributes28_field$_aria__002d__label = true;
                    {
                        java.util.Map var_ignoredattributes28 = obj().with("data-cmp-data-layer", var_ignoredattributes28_field$_data__002d__cmp__002d__data__002d__layer).with("data-cmp-clickable", var_ignoredattributes28_field$_data__002d__cmp__002d__clickable).with("aria-label", var_ignoredattributes28_field$_aria__002d__label);
                        if (var_attrmap15_list_coerced$ == null) {
                            var_attrmap15_list_coerced$ = renderContext.getObjectModel().toCollection(var_attrmap15);
                        }
                        long var_attrindex31 = 0;
                        for (Object var_attrname29 : var_attrmap15_list_coerced$) {
                            {
                                Object var_attrnameescaped30 = renderContext.call("xss", var_attrname29, "attributeName");
                                if (renderContext.getObjectModel().toBoolean(var_attrnameescaped30)) {
                                    {
                                        Object var_isignoredattr32 = var_ignoredattributes28.get(var_attrname29);
                                        if (!renderContext.getObjectModel().toBoolean(var_isignoredattr32)) {
                                            {
                                                Object var_attrcontent33 = renderContext.getObjectModel().resolveProperty(var_attrmap15, var_attrname29);
                                                {
                                                    Object var_attrcontentescaped34 = renderContext.call("xss", var_attrcontent33, "attribute", var_attrnameescaped30);
                                                    {
                                                        boolean var_shoulddisplayattr35 = (((null != var_attrcontentescaped34) && (!"".equals(var_attrcontentescaped34))) && ((!"".equals(var_attrcontent33)) && (!((Object)false).equals(var_attrcontent33))));
                                                        if (var_shoulddisplayattr35) {
                                                            out.write(" ");
                                                            out.write(renderContext.getObjectModel().toString(var_attrnameescaped30));
                                                            {
                                                                boolean var_istrueattr36 = (var_attrcontent33.equals(true));
                                                                if (!var_istrueattr36) {
                                                                    out.write("=\"");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontentescaped34));
                                                                    out.write("\"");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            var_attrindex31++;
                        }
                    }
                }
            }
        }
        var_attrmap15_list_coerced$ = null;
    }
    out.write(">\r\n\t    \t<span class=\"cmp-button__text\">View Recipe</span>\r\n\t\t");
    if (renderContext.getObjectModel().toBoolean(var_tagvar14)) {
        out.write("</");
        out.write(renderContext.getObjectModel().toString(var_tagvar14));
        out.write(">");
    }
    if (!renderContext.getObjectModel().toBoolean(var_tagvar14)) {
        out.write("</button>");
    }
}
out.write("\r\n\t</div>\r\n\t\r\n\t<div class=\"cmp-recipe__image\">\r\n\t\t<a");
{
    Object var_attrvalue37 = renderContext.getObjectModel().resolveProperty(_global_image, "link");
    {
        Object var_attrcontent38 = renderContext.call("xss", var_attrvalue37, "uri");
        {
            boolean var_shoulddisplayattr40 = (((null != var_attrcontent38) && (!"".equals(var_attrcontent38))) && ((!"".equals(var_attrvalue37)) && (!((Object)false).equals(var_attrvalue37))));
            if (var_shoulddisplayattr40) {
                out.write(" href");
                {
                    boolean var_istrueattr39 = (var_attrvalue37.equals(true));
                    if (!var_istrueattr39) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent38));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("> \r\n\t\t\t<img class=\"cmp-recipe__image--img\"");
{
    Object var_attrvalue41 = renderContext.getObjectModel().resolveProperty(_global_image, "src");
    {
        Object var_attrcontent42 = renderContext.call("xss", var_attrvalue41, "uri");
        {
            boolean var_shoulddisplayattr44 = (((null != var_attrcontent42) && (!"".equals(var_attrcontent42))) && ((!"".equals(var_attrvalue41)) && (!((Object)false).equals(var_attrvalue41))));
            if (var_shoulddisplayattr44) {
                out.write(" src");
                {
                    boolean var_istrueattr43 = (var_attrvalue41.equals(true));
                    if (!var_istrueattr43) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent42));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n\t\t</a>\r\n\t</div>\r\n\t\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


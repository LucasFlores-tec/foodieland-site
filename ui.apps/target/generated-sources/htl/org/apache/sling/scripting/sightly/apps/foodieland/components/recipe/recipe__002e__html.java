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
Object _global_button = null;
Collection var_attrmap8_list_coerced$ = null;
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
    out.write("</h4>\r\n\t\t");
_global_button = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Button.class.getName(), obj());
    {
        Object var_tagvar7 = renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "buttonLink"), "valid")) ? "a" : "button"), "elementName");
        if (renderContext.getObjectModel().toBoolean(var_tagvar7)) {
            out.write("<");
            out.write(renderContext.getObjectModel().toString(var_tagvar7));
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar7)) {
            out.write("<button");
        }
        {
            Object var_attrmap8 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "buttonLink"), "htmlAttributes");
            {
                Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_global_button, "accessibilityLabel");
                {
                    Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "attribute");
                    {
                        boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
                        if (var_shoulddisplayattr12) {
                            out.write(" aria-label");
                            {
                                boolean var_istrueattr11 = (var_attrvalue9.equals(true));
                                if (!var_istrueattr11) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                boolean var_attrvalue13 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_button, "data")) ? true : false);
                {
                    Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "attribute");
                    {
                        boolean var_shoulddisplayattr16 = (((null != var_attrcontent14) && (!"".equals(var_attrcontent14))) && ((!"".equals(var_attrvalue13)) && (false != var_attrvalue13)));
                        if (var_shoulddisplayattr16) {
                            out.write(" data-cmp-clickable");
                            {
                                boolean var_istrueattr15 = (var_attrvalue13 == true);
                                if (!var_istrueattr15) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent14));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "data"), "json");
                {
                    Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
                    {
                        boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                        if (var_shoulddisplayattr20) {
                            out.write(" data-cmp-data-layer");
                            {
                                boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                                if (!var_istrueattr19) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                boolean var_ignoredattributes21_field$_data__002d__cmp__002d__data__002d__layer = true;
                {
                    boolean var_ignoredattributes21_field$_data__002d__cmp__002d__clickable = true;
                    {
                        boolean var_ignoredattributes21_field$_aria__002d__label = true;
                        {
                            java.util.Map var_ignoredattributes21 = obj().with("data-cmp-data-layer", var_ignoredattributes21_field$_data__002d__cmp__002d__data__002d__layer).with("data-cmp-clickable", var_ignoredattributes21_field$_data__002d__cmp__002d__clickable).with("aria-label", var_ignoredattributes21_field$_aria__002d__label);
                            if (var_attrmap8_list_coerced$ == null) {
                                var_attrmap8_list_coerced$ = renderContext.getObjectModel().toCollection(var_attrmap8);
                            }
                            long var_attrindex24 = 0;
                            for (Object var_attrname22 : var_attrmap8_list_coerced$) {
                                {
                                    Object var_attrnameescaped23 = renderContext.call("xss", var_attrname22, "attributeName");
                                    if (renderContext.getObjectModel().toBoolean(var_attrnameescaped23)) {
                                        {
                                            Object var_isignoredattr25 = var_ignoredattributes21.get(var_attrname22);
                                            if (!renderContext.getObjectModel().toBoolean(var_isignoredattr25)) {
                                                {
                                                    Object var_attrcontent26 = renderContext.getObjectModel().resolveProperty(var_attrmap8, var_attrname22);
                                                    {
                                                        Object var_attrcontentescaped27 = renderContext.call("xss", var_attrcontent26, "attribute", var_attrnameescaped23);
                                                        {
                                                            boolean var_shoulddisplayattr28 = (((null != var_attrcontentescaped27) && (!"".equals(var_attrcontentescaped27))) && ((!"".equals(var_attrcontent26)) && (!((Object)false).equals(var_attrcontent26))));
                                                            if (var_shoulddisplayattr28) {
                                                                out.write(" ");
                                                                out.write(renderContext.getObjectModel().toString(var_attrnameescaped23));
                                                                {
                                                                    boolean var_istrueattr29 = (var_attrcontent26.equals(true));
                                                                    if (!var_istrueattr29) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontentescaped27));
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
                                var_attrindex24++;
                            }
                        }
                    }
                }
            }
            var_attrmap8_list_coerced$ = null;
        }
        out.write(">\r\n\t    \t<span class=\"cmp-button__text\">View Recipe</span>\r\n\t\t");
        if (renderContext.getObjectModel().toBoolean(var_tagvar7)) {
            out.write("</");
            out.write(renderContext.getObjectModel().toString(var_tagvar7));
            out.write(">");
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar7)) {
            out.write("</button>");
        }
    }
    out.write("\r\n\t</div>\r\n\t\r\n\t<div class=\"cmp-recipe__image\">");
    {
        Object var_includedresult30 = renderContext.call("include", "image.html", obj());
        out.write(renderContext.getObjectModel().toString(var_includedresult30));
    }
    out.write("</div>\r\n\t\r\n</div>");
}
out.write("\r\n");
{
    Object var_templatevar32 = renderContext.getObjectModel().resolveProperty(_global_placeholdertemplate, "placeholder");
    {
        boolean var_templateoptions33_field$_isempty = false;
        {
            java.util.Map var_templateoptions33 = obj().with("isEmpty", var_templateoptions33_field$_isempty);
            callUnit(out, renderContext, var_templatevar32, var_templateoptions33);
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


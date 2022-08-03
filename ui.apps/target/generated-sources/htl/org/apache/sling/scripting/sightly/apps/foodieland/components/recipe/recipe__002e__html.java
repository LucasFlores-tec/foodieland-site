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
    out.write("</h4>\r\n\t\t\r\n\t\t");
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
                String var_attrname_type9 = "type";
                {
                    Object var_mapcontains_type10 = renderContext.getObjectModel().resolveProperty(var_attrmap8, "type");
                    {
                        Object var_attrcontentescaped11 = renderContext.call("xss", var_mapcontains_type10, "attribute", "type");
                        {
                            boolean var_shoulddisplayattr12 = (((null != var_attrcontentescaped11) && (!"".equals(var_attrcontentescaped11))) && ((!"".equals(var_mapcontains_type10)) && (!((Object)false).equals(var_mapcontains_type10))));
                            if (var_shoulddisplayattr12) {
                                out.write(" ");
                                out.write(renderContext.getObjectModel().toString(var_attrname_type9));
                                {
                                    boolean var_istrueattr13 = (var_mapcontains_type10.equals(true));
                                    if (!var_istrueattr13) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontentescaped11));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                    if (!renderContext.getObjectModel().toBoolean(var_mapcontains_type10)) {
                        {
                            String var_attrvalue14 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "buttonLink"), "valid")) ? "" : "button");
                            {
                                Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                                {
                                    boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                                    if (var_shoulddisplayattr17) {
                                        out.write(" type");
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
                    }
                }
            }
            {
                Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(_global_button, "accessibilityLabel");
                {
                    Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "attribute");
                    {
                        boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (!((Object)false).equals(var_attrvalue18))));
                        if (var_shoulddisplayattr21) {
                            out.write(" aria-label");
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
            {
                boolean var_attrvalue22 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_button, "data")) ? true : false);
                {
                    Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "attribute");
                    {
                        boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (false != var_attrvalue22)));
                        if (var_shoulddisplayattr25) {
                            out.write(" data-cmp-clickable");
                            {
                                boolean var_istrueattr24 = (var_attrvalue22 == true);
                                if (!var_istrueattr24) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent23));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue26 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "data"), "json");
                {
                    Object var_attrcontent27 = renderContext.call("xss", var_attrvalue26, "attribute");
                    {
                        boolean var_shoulddisplayattr29 = (((null != var_attrcontent27) && (!"".equals(var_attrcontent27))) && ((!"".equals(var_attrvalue26)) && (!((Object)false).equals(var_attrvalue26))));
                        if (var_shoulddisplayattr29) {
                            out.write(" data-cmp-data-layer");
                            {
                                boolean var_istrueattr28 = (var_attrvalue26.equals(true));
                                if (!var_istrueattr28) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent27));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                boolean var_ignoredattributes30_field$_data__002d__cmp__002d__data__002d__layer = true;
                {
                    boolean var_ignoredattributes30_field$_type = true;
                    {
                        boolean var_ignoredattributes30_field$_data__002d__cmp__002d__clickable = true;
                        {
                            boolean var_ignoredattributes30_field$_aria__002d__label = true;
                            {
                                java.util.Map var_ignoredattributes30 = obj().with("data-cmp-data-layer", var_ignoredattributes30_field$_data__002d__cmp__002d__data__002d__layer).with("type", var_ignoredattributes30_field$_type).with("data-cmp-clickable", var_ignoredattributes30_field$_data__002d__cmp__002d__clickable).with("aria-label", var_ignoredattributes30_field$_aria__002d__label);
                                if (var_attrmap8_list_coerced$ == null) {
                                    var_attrmap8_list_coerced$ = renderContext.getObjectModel().toCollection(var_attrmap8);
                                }
                                long var_attrindex33 = 0;
                                for (Object var_attrname31 : var_attrmap8_list_coerced$) {
                                    {
                                        Object var_attrnameescaped32 = renderContext.call("xss", var_attrname31, "attributeName");
                                        if (renderContext.getObjectModel().toBoolean(var_attrnameescaped32)) {
                                            {
                                                Object var_isignoredattr34 = var_ignoredattributes30.get(var_attrname31);
                                                if (!renderContext.getObjectModel().toBoolean(var_isignoredattr34)) {
                                                    {
                                                        Object var_attrcontent35 = renderContext.getObjectModel().resolveProperty(var_attrmap8, var_attrname31);
                                                        {
                                                            Object var_attrcontentescaped36 = renderContext.call("xss", var_attrcontent35, "attribute", var_attrnameescaped32);
                                                            {
                                                                boolean var_shoulddisplayattr37 = (((null != var_attrcontentescaped36) && (!"".equals(var_attrcontentescaped36))) && ((!"".equals(var_attrcontent35)) && (!((Object)false).equals(var_attrcontent35))));
                                                                if (var_shoulddisplayattr37) {
                                                                    out.write(" ");
                                                                    out.write(renderContext.getObjectModel().toString(var_attrnameescaped32));
                                                                    {
                                                                        boolean var_istrueattr38 = (var_attrcontent35.equals(true));
                                                                        if (!var_istrueattr38) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontentescaped36));
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
                                    var_attrindex33++;
                                }
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
    out.write("\r\n\r\n\t</div>\r\n\t\r\n\t<div class=\"cmp-recipe__image\">\r\n\t\t<div>");
    {
        Object var_resourcecontent39 = renderContext.call("includeResource", ".", obj().with("resourceType", "core/wcm/components/image/v3/image"));
        out.write(renderContext.getObjectModel().toString(var_resourcecontent39));
    }
    out.write("</div>\r\n\t</div>\r\n\t\r\n</div>");
}
out.write("\r\n");
{
    Object var_templatevar40 = renderContext.getObjectModel().resolveProperty(_global_placeholdertemplate, "placeholder");
    {
        boolean var_templateoptions41_field$_isempty = false;
        {
            java.util.Map var_templateoptions41 = obj().with("isEmpty", var_templateoptions41_field$_isempty);
            callUnit(out, renderContext, var_templatevar40, var_templateoptions41);
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


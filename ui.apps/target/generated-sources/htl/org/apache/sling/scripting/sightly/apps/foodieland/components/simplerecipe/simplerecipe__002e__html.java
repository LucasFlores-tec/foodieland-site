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
Object _global_image = null;
Object _global_placeholdertemplate = null;
out.write("\r\n");
_global_simplerecipe = renderContext.call("use", com.foodieland.core.models.SimpleRecipe.class.getName(), obj());
_global_image = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Image.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-simplerecipe\">\r\n\t\r\n\t<div class=\"cmp-simplerecipe__image\">\r\n\t\t<a");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_image, "link");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" href");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("> \r\n\t\t\t<img");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_image, "src");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" src");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n\t\t</a>\r\n\t</div>\r\n\t\r\n\t");
{
    Object var_testvariable8 = renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable8)) {
        out.write("<div class=\"cmp-simplerecipe__title\">\r\n\t\t<h4 class=\"cmp-simplerecipe__title-sr\">");
        {
            Object var_9 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_9));
        }
        out.write("</h4>\r\n\t</div>");
    }
}
out.write("\r\n\t\r\n\t<div class=\"cmp-simplerecipe__timeandcategory\">\r\n\t\t");
{
    Object var_testvariable10 = renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "time");
    if (renderContext.getObjectModel().toBoolean(var_testvariable10)) {
        out.write("<div class=\"cmp-simplerecipe__timeandcategory--time\">\r\n\t\t\t<p>");
        {
            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "time"), "text");
            out.write(renderContext.getObjectModel().toString(var_11));
        }
        out.write("</p>\r\n\t\t</div>");
    }
}
out.write("\r\n\t\t");
{
    Object var_testvariable12 = renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "select");
    if (renderContext.getObjectModel().toBoolean(var_testvariable12)) {
        out.write("<div class=\"cmp-simplerecipe__timeandcategory--category\">\r\n\t\t\t<p>");
        {
            Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_simplerecipe, "select"), "text");
            out.write(renderContext.getObjectModel().toString(var_13));
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


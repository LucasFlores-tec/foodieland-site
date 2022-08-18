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
package org.apache.sling.scripting.sightly.apps.foodieland.components.fl__002d__course;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class fl__002d__course__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_button = null;
out.write("\r\n");
_global_model = renderContext.call("use", com.foodieland.core.models.Course.class.getName(), obj());
_global_button = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Button.class.getName(), obj());
out.write("<div class=\"cmp-course\">\r\n\t\r\n\t<div class=\"cmp-course__data-button\">\r\n\t\t");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_model, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cmp-course__data--title\">\r\n\t\t\t<h2>");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</h2>\r\n\t\t</div>");
    }
}
out.write("\r\n\t\t");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_global_model, "description");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("<div class=\"cmp-course__data--description\">\r\n\t\t\t<p>");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "text");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</p>\r\n\t\t</div>");
    }
}
out.write("\r\n\t\t<div class=\"cmp-course__button\">");
{
    Object var_includedresult4 = renderContext.call("include", "button.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult4));
}
out.write("</div>\r\n\t</div>\r\n\t\r\n\t");
{
    Object var_testvariable8 = renderContext.getObjectModel().resolveProperty(_global_model, "imageReference");
    if (renderContext.getObjectModel().toBoolean(var_testvariable8)) {
        out.write("<div class=\"cmp-course__image\">\r\n\t\t");
        {
            Object var_testvariable9 = renderContext.getObjectModel().resolveProperty(_global_model, "linkURL");
            if (renderContext.getObjectModel().toBoolean(var_testvariable9)) {
                out.write("<a");
                {
                    Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_global_model, "linkURL");
                    {
                        Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                        {
                            boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                            if (var_shoulddisplayattr13) {
                                out.write(" href");
                                {
                                    boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                                    if (!var_istrueattr12) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(">\r\n\t\t\t<img class=\"cmp-course__image--img\"");
                {
                    Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_global_model, "imageReference");
                    {
                        Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "uri");
                        {
                            boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                            if (var_shoulddisplayattr17) {
                                out.write(" src");
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
                out.write("/>\r\n\t\t</a>");
            }
        }
        out.write("\r\n\t</div>");
    }
}
out.write("\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


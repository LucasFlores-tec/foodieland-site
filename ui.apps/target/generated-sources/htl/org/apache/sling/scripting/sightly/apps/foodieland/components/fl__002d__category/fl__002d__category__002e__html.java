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
package org.apache.sling.scripting.sightly.apps.foodieland.components.fl__002d__category;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class fl__002d__category__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
out.write("\n");
_global_model = renderContext.call("use", com.foodieland.core.models.Category.class.getName(), obj());
out.write("<div class=\"cmp-category\">\n\t\n\t");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_model, "imageReference");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cmp-category__image\">\n\t\t");
        {
            Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_global_model, "linkURL");
            if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
                out.write("<a");
                {
                    Object var_attrvalue2 = renderContext.getObjectModel().resolveProperty(_global_model, "linkURL");
                    {
                        Object var_attrcontent3 = renderContext.call("xss", var_attrvalue2, "uri");
                        {
                            boolean var_shoulddisplayattr5 = (((null != var_attrcontent3) && (!"".equals(var_attrcontent3))) && ((!"".equals(var_attrvalue2)) && (!((Object)false).equals(var_attrvalue2))));
                            if (var_shoulddisplayattr5) {
                                out.write(" href");
                                {
                                    boolean var_istrueattr4 = (var_attrvalue2.equals(true));
                                    if (!var_istrueattr4) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent3));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(">\n\t\t\t<img");
                {
                    Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_global_model, "imageReference");
                    {
                        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "uri");
                        {
                            boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
                            if (var_shoulddisplayattr9) {
                                out.write(" src");
                                {
                                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                                    if (!var_istrueattr8) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write("/>\n\t\t</a>");
            }
        }
        out.write("\n\t</div>");
    }
}
out.write("\n\t\n\t");
{
    Object var_testvariable10 = renderContext.getObjectModel().resolveProperty(_global_model, "name");
    if (renderContext.getObjectModel().toBoolean(var_testvariable10)) {
        out.write("<div class=\"cmp-category__name\">\n\t\t<p class=\"cmp-category__name-category\">");
        {
            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "name"), "text");
            out.write(renderContext.getObjectModel().toString(var_11));
        }
        out.write("</p>\n\t</div>");
    }
}
out.write("\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


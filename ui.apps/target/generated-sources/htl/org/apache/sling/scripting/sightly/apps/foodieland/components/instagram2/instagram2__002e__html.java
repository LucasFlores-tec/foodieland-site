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
package org.apache.sling.scripting.sightly.apps.foodieland.components.instagram2;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class instagram2__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_embed = null;
Object _dynamic_resource = bindings.get("resource");
out.write("\r\n");
_global_embed = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Embed.class.getName(), obj());
out.write("<div class=\"cmp-instagram2\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_embed, "data"), "json");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" data-cmp-data-layer");
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
out.write(">\r\n    ");
{
    Object var_testvariable4 = renderContext.getObjectModel().resolveProperty(_global_embed, "html");
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        {
            Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_embed, "html"), "html");
            out.write(renderContext.getObjectModel().toString(var_5));
        }
    }
}
out.write("\r\n    ");
{
    Object var_testvariable6 = renderContext.getObjectModel().resolveProperty(_global_embed, "embeddableResourceType");
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        {
            Object var_resourcecontent7 = renderContext.call("includeResource", renderContext.getObjectModel().resolveProperty(_dynamic_resource, "path"), obj().with("wcmmode", "disabled").with("resourceType", renderContext.getObjectModel().resolveProperty(_global_embed, "embeddableResourceType")));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent7));
        }
    }
}
out.write("\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}


<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePersonServiceImplProxyid" scope="session" class="com.med.PersonServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePersonServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePersonServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePersonServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.med.PersonServiceImpl getPersonServiceImpl10mtemp = samplePersonServiceImplProxyid.getPersonServiceImpl();
if(getPersonServiceImpl10mtemp == null){
%>
<%=getPersonServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String id_1id=  request.getParameter("id18");
        int id_1idTemp  = Integer.parseInt(id_1id);
        java.lang.String deletePerson15mtemp = samplePersonServiceImplProxyid.deletePerson(id_1idTemp);
if(deletePerson15mtemp == null){
%>
<%=deletePerson15mtemp %>
<%
}else{
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deletePerson15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String id_2id=  request.getParameter("id29");
        int id_2idTemp  = Integer.parseInt(id_2id);
        com.med.Person getPerson20mtemp = samplePersonServiceImplProxyid.getPerson(id_2idTemp);
if(getPerson20mtemp == null){
%>
<%=getPerson20mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(getPerson20mtemp != null){
%>
<%=getPerson20mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getPerson20mtemp != null){
java.lang.String typename25 = getPerson20mtemp.getName();
        String tempResultname25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename25));
        %>
        <%= tempResultname25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getPerson20mtemp != null){
%>
<%=getPerson20mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 31:
        gotMethod = true;
        String id_3id=  request.getParameter("id34");
        int id_3idTemp  = Integer.parseInt(id_3id);
        String name_4id=  request.getParameter("name36");
            java.lang.String name_4idTemp = null;
        if(!name_4id.equals("")){
         name_4idTemp  = name_4id;
        }
        String age_5id=  request.getParameter("age38");
        int age_5idTemp  = Integer.parseInt(age_5id);
        java.lang.String updatePerson31mtemp = samplePersonServiceImplProxyid.updatePerson(id_3idTemp,name_4idTemp,age_5idTemp);
if(updatePerson31mtemp == null){
%>
<%=updatePerson31mtemp %>
<%
}else{
        String tempResultreturnp32 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updatePerson31mtemp));
        %>
        <%= tempResultreturnp32 %>
        <%
}
break;
case 40:
        gotMethod = true;
        java.lang.Object[] getPersons40mtemp = samplePersonServiceImplProxyid.getPersons();
if(getPersons40mtemp == null){
%>
<%=getPersons40mtemp %>
<%
}else{
        String tempreturnp41 = null;
        if(getPersons40mtemp != null){
        java.util.List listreturnp41= java.util.Arrays.asList(getPersons40mtemp);
        tempreturnp41 = listreturnp41.toString();
        }
        %>
        <%=tempreturnp41%>
        <%
}
break;
case 43:
        gotMethod = true;
        String id_6id=  request.getParameter("id46");
        int id_6idTemp  = Integer.parseInt(id_6id);
        String name_7id=  request.getParameter("name48");
            java.lang.String name_7idTemp = null;
        if(!name_7id.equals("")){
         name_7idTemp  = name_7id;
        }
        String age_8id=  request.getParameter("age50");
        int age_8idTemp  = Integer.parseInt(age_8id);
        java.lang.String createPerson43mtemp = samplePersonServiceImplProxyid.createPerson(id_6idTemp,name_7idTemp,age_8idTemp);
if(createPerson43mtemp == null){
%>
<%=createPerson43mtemp %>
<%
}else{
        String tempResultreturnp44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(createPerson43mtemp));
        %>
        <%= tempResultreturnp44 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>
<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome 
  	<#if greeting??>
  		${greeting}
  	<#else>
  		No Info about Methods
  	</#if>
  </h1>
  
  <#if detaillist??>
	  <#list detaillist as detail>
	    <li>${detail.name} - ${detail.str1}
	  </#list>
  </#if>
</body>
</html>
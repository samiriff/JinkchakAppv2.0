<html lang="en">
<head>
<meta charset="utf-8" />
<title>Similarity Main Page</title>
<link rel="stylesheet" href="/resources/demos/style.css" />
<script>
$(function() {
	$( "#tabs_all_nav" ).tabs({
		beforeLoad: function( event, ui ) {
			ui.jqXHR.error(function() {
				ui.panel.html(
				"Couldn't load this tab. We'll try to fix this as soon as possible. " +
				"If this wasn't a demo." );
			});
		}
	});
});
</script>
</head>
<body>
	<div style="margin-top: 1%; margin-left: auto; margin-right: auto;" id="tabs_all_nav">
	<ul>
		<li><a href="./jsp/Similarity/main.jsp">Basic Java</a></li>		
		<li><a href="./jsp/Forecaster/main.jsp">Java Enterprise Edition</a></li>		
	</ul>
	
	</div>
</body>
</html>
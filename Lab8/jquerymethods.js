$(document).ready(function(){
	$('.menu').click(function() { 
		$('.a_menu').toggle();
		console.log("click menu");
	});

	$('.a_menu a').click(function() { $('.a_menu').hide(); });

	$('.option0').click(function() {
		$('.article').show();
	});

	$('.option1').click(function() { 
		$(".article").hide();
		$('#firstArticle').show();
		console.log("show article 1");
		
	});

	$('.option2').click(function() { 
		$(".article").hide();
		$('#secondArticle').show();
		console.log("show article 2");
	});

	$("img")
	.mouseover(function() {
		$(this).css("opacity",1.0);
	})
	.mouseout(function(){
		$(this).css("opacity",0.7);
	});

	$(".readMore").click(function() {
		var txt = $(this).next('.detail').is(':visible') ? 'Read more' : 'Read less';
		console.log(txt);
		$(this).text(txt);
		$(this).next('.detail').slideToggle(200);
	});

	$(".a_nav").click(function(){
		$(".nav").slideToggle();

	})
});
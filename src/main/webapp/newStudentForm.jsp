<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="/TestIntBrowser/Test">
	<fieldset>
	<legend>Личная карточка студента</legend>
	
		Имя: <input type="text" name="name" accesskey="N" size="20"><br/>
		Фамилия: <input type="text" name="surname" accesskey="S" size="20"><br/>
		Отчество: <input type="text" name="patronimyc" accesskey="P" size="20"><br/>
		Телефон: <input type="text" name="phone" accesskey="P" size="20"><br/>
		e-mail: <input type="text" name="email" accesskey="P" size="20"><br/>
		skype: <input type="text" name="skype" accesskey="P" size="20"><br/>
		
		По каким ключевым словам нас нашли<br/>
		<textarea name="keywords" cols="45" rows="5" > </textarea><br/>

		Интересующие курсы: (выбор нескольких удерживая ctrl)
		<select name="cources" size="5" multiple="multiple">
			<option value="basic" > Начала программирования на Java </option>
			<option value="core" selected="selected"> Основной курс Java </option>
			<option value="db"> Работа с базами данных </option>
			<option value="web"> Разработка Web приложений </option>
			<option value="scjp"> Подготовка к сертификации </option>
		</select><br/><br/>

		<input type="submit" name="Submit" value="Сохранить данные"> 
	</fieldset>
	</form>
</body>
</html>
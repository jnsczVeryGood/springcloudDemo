<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
<head>
<meta charset="UTF-8">
<title>index</title>

<link rel="stylesheet" href="css/index.css">

<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>

</head>
<body><script src="/demos/googlegg.js"></script>
<div style="text-align:center;margin:10px 0; font:normal 14px/24px 'MicroSoft YaHei';">

</div>
<div class="cotn_principal">
  <div class="cont_centrar">
    <div class="cont_login">
      <div class="cont_info_log_sign_up">
        <div class="col_md_login">
          <div class="cont_ba_opcitiy">
            <h2>LOGIN</h2>
            <p>Lorem ipsum dolor sit amet, consectetur.</p>
            <button class="btn_login" onClick="cambiar_login()" >LOGIN</button>
          </div>
        </div>
        <div class="col_md_sign_up">
          <div class="cont_ba_opcitiy">
            <h2>SIGN UP</h2>
            <p>Lorem ipsum dolor sit amet, consectetur.</p>
            <button class="btn_sign_up" onClick="cambiar_sign_up()">SIGN UP</button>
          </div>
        </div>
      </div>
      <div class="cont_back_info">
        <div class="cont_img_back_grey"> <img src="images/po.jpg" alt="" /> </div>
      </div>
      <div class="cont_forms" >
        <div class="cont_img_back_"> <img src="images/po.jpg" alt="" /> </div>
        <div class="cont_form_login"> <a href="#" onClick="ocultar_login_sign_up()">
        <i class="material-icons">&#xE5C4;</i></a>
          <h2>LOGIN</h2>
          <form action="login" method="post">
          <input type="text" placeholder="UserId" name="username" 
          style="padding:15px 5px;margin-left:10px;margin-top:20px;width:260px;border: none;text-align: left;color:#757575;"/>
          <input type="password" placeholder="Password" name="password"
          style="padding:15px 5px;margin-left:10px;margin-top:20px;width:260px;border: none;text-align: left;color:#757575;"/>
          <input class="btn_login" type="submit" value="LOGIN" />
         </form>
        </div>
        <div class="cont_form_sign_up"> <a href="#" onClick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
          <h2>SIGN UP</h2>
          <form action="/regisit" method="post">
          <input type="text" placeholder="UserId" 
          style="text-align: left;padding: 15px 5px;margin-left: 10px;margin-top: 20px;width: 260px;border: none;color: #757575;"/>
          <input type="text" placeholder="UserName" 
          style="text-align: left;padding: 15px 5px;margin-left: 10px;margin-top: 20px;width: 260px;border: none;color: #757575;"/>
          <input type="password" placeholder="Password" 
          style="text-align: left;padding: 15px 5px;margin-left: 10px;margin-top: 20px;width: 260px;border: none;color: #757575;"/>
          <input type="password" placeholder="Confirm Password" 
          style="text-align: left;padding: 15px 5px;margin-left: 10px;margin-top: 20px;width: 260px;border: none;color: #757575;"/>
          <input class="btn_sign_up" type="submit" value="SIGN UP"/>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

<script src="js/index.js"></script>

</body>
</html>


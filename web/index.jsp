<%--
  Created by IntelliJ IDEA.
  User: oliviaaaaa
  Date: 5/21/22
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="description" content="Item Recommendation">
  <meta name="author" content="Your Name">
  <title>Recommendation</title>
  <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="styles/main.css">
</head>
<body>
<header class="top-header">
  <nav class="top-nav">
    <a href="#">Home</a>
    <a href="#">Contact</a>
    <a href="#">About</a>
  </nav>
  <span id="welcome-msg"></span>
  <i id="avatar" class="avatar fa fa-user fa-2x"></i>
</header>

<div class="container">
  <header>
    <p>
      <span>Item</span>
      <br /> Recommendation
    </p>
  </header>

  <section class="main-section">
    <aside id="item-nav">
      <div class="nav-icon">
        <i class="fa fa-sitemap fa-2x"></i>
      </div>
      <nav class="main-nav">
        <a href="#" id="nearby-btn" class="main-nav-btn active">
          <i class="fa fa-map-marker"></i> Nearby
        </a>
        <a href="#" id="fav-btn" class="main-nav-btn">
          <i class="fa fa-heart"></i> My Favorites
        </a>
        <a href="#" id="recommend-btn" class="main-nav-btn">
          <i class="fa fa-thumbs-up"></i> Recommendation
        </a>
      </nav>
    </aside>

    <ul id="item-list">
      <li class="item">
        <img alt="item image" src="https://s3-media3.fl.yelpcdn.com/bphoto/EmBj4qlyQaGd9Q4oXEhEeQ/ms.jpg" />
        <div>
          <a class="item-name" href="#">Item</a>
          <p class="item-category">Vegetarian</p>
          <div class="stars">
            <i class="fa fa-star"></i>
            <i class="fa fa-star"></i>
            <i class="fa fa-star"></i>
          </div>
        </div>
        <p class="item-address">699 Calderon Ave<br/>Mountain View<br/> CA</p>
        <div class="fav-link">
          <i class="fa fa-heart"></i>
        </div>
      </li>
    </ul>
  </section>
</div>

<footer>
  <p class="title">What We Do</p>
  <p>"Help you find the best place around."</p>
  <ul>
    <li>
      <p><i class="fa fa-map-o fa-2x"></i></p>
      <p>LaiOffer office, CA</p>
    </li>
    <li>
      <p><i class="fa fa-envelope-o fa-2x"></i></p>
      <p>info@laioffer.com</p>
    </li>
    <li>
      <p><i class="fa fa-phone fa-2x"></i></p>
      <p>+1 800 123 456</p>
    </li>
  </ul>
</footer>

<script src="https://rawgit.com/emn178/js-md5/master/build/md5.min.js"></script>
<script src="scripts/main.js"></script>
</body>
</html>
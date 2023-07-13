<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>

<body>

    <br><b>ADD AN ALIEN TO THE MOB</b><br>
    <form action="addAlien" , method="post">
        <input type="text" name="aid" id=""><br>
        <input type="text" name="aname" id=""><br>
        <input type="text" name="tech" id=""><br>
        <input type="submit"><br>
    </form>

    <br><b>FETCH AN ALIEN FROM THE MOB</b><br>
    <form action="getAlien" , method="post">
        <input type="text" name="aid" id=""><br>
        <input type="submit"><br>
    </form>

</body>

</html>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Strona powitalna</title>
</head>
<body>
    <?php
    // Określenie daty ostatnich odwiedzin
    $visit_date_cookie = "last_visit_date";
    $visit_date_expiry = time() + (30 * 24 * 60 * 60); // 30 dni

    if (isset($_COOKIE[$visit_date_cookie])) {
        $last_visit_date = $_COOKIE[$visit_date_cookie];
        echo "<p>Witamy ponownie! Ostatni raz odwiedziłeś nas: " . $last_visit_date . "</p>";
    } else {
        echo "<p>Witamy na naszej stronie po raz pierwszy!</p>";
    }

    $current_date = date("Y-m-d H:i:s");
    setcookie($visit_date_cookie, $current_date, $visit_date_expiry);

    // Przechowywanie danych użytkownika (imię i nazwisko)
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $first_name = $_POST['first_name'];
        $last_name = $_POST['last_name'];

        if (!empty($first_name) && !empty($last_name)) {
            $user_data = $first_name . " " . $last_name;
            setcookie("user_data", $user_data, time() + (30 * 24 * 60 * 60)); // 30 dni
            echo "<p>$user_data, Witamy po raz kolejny!</p>";
        }
    } elseif (isset($_COOKIE['user_data'])) {
        $user_data = $_COOKIE['user_data'];
        echo "<p>$user_data, Witamy po raz kolejny!</p>";
    }
    ?>

    <form method="post" action="">
        <label for="first_name">Imię:</label>
        <input type="text" id="first_name" name="first_name">
        <br>
        <label for="last_name">Nazwisko:</label>
        <input type="text" id="last_name" name="last_name">
        <br>
        <input type="submit" value="Zapisz">
    </form>

    <?php
    // Zliczanie liczby odwiedzin w ciągu ostatniego roku
    $visits_cookie = "visits";
    $visits_expiry = time() + (365 * 24 * 60 * 60); // 1 rok

    if (isset($_COOKIE[$visits_cookie])) {
        $visits = $_COOKIE[$visits_cookie];
        $visits++;
    } else {
        $visits = 1;
    }

    setcookie($visits_cookie, $visits, $visits_expiry);

    echo "<p>W ciągu ostatniego roku odwiedziłeś naszą stronę $visits razy.</p>";
    ?>
</body>
</html>

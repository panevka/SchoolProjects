<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "wedkarstwo";

$conn = mysqli_connect($servername, $username, $password, $dbname);

if(!$conn){
  die("Brak połączenia: " . mysqli_connect_error());
}

mysqli_select_db($conn, $dbname);



 {

  $lowisko = mysqli_real_escape_string($conn, $_POST['lowisko']);
  $data = mysqli_real_escape_string($conn, $_POST['data']);
  $sedzia = mysqli_real_escape_string($conn, $_POST['sedzia']);

    $sql = "INSERT INTO zawody_wedkarskie (Karty_wedkarskie_id, Lowisko_id, data_zawodow, sedzia) VALUES(0, '$lowisko','$data','$sedzia')";
    

    if(mysqli_query($conn, $sql)){
        echo "Dodano rekord";
    } else{
      echo "Error: " . mysqli_error($conn);
    }
  }

  mysqli_close($conn);
?>

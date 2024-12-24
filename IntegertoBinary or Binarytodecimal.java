<?php
$servername = "localhost";
$username = "root";
$password = "";
$database = "myDB";
$con = mysqli_connect($servername, $username, $password, $database);
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
} else {
    echo "<script>alert('Database connected')</script>";
}
$sql = "CREATE TABLE STU (ID VARCHAR(10), MARKS INT(3))";

if (mysqli_query($con, $sql)) {
    echo "Table STU created successfully";
} else {
    echo "Error creating table: " . mysqli_error($con);
}
$sql_insert1 = "INSERT INTO STU (ID, MARKS) VALUES ('21121A0538', 999)";
$sql_insert2 = "INSERT INTO STU (ID, MARKS) VALUES ('21121A0503', 999)";

if (mysqli_query($con, $sql_insert1)) {
    echo "Record inserted successfully";
} else {
    echo "Error inserting record: " . mysqli_error($con);
}

if (mysqli_query($con, $sql_insert2)) {
    echo "Record inserted successfully";
} else {
    echo "Error inserting record: " . mysqli_error($con);
}wq
mysqli_close($con);
?>

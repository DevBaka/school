<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

?>
<h1>While- und do-while-schleife</h1>
<h2>While Schleife:</h2>

<?php
    $c = 0;
    while($c <= 5){
        echo($c . "<br>");
        $c++;
    }
    
    
?>
<h2>Do-While-Loop:</h2>
<?php
    $i =0;
    do{
        $i++;
        echo($i . "<br>");
        
    }
    while($i < 5);

?>

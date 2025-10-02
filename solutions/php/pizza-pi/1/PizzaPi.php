<?php

class PizzaPi
{
    public function calculateDoughRequirement($pizzas,$persons)
    {
        return $pizzas * (($persons * 20) + 200);
    }

    public function calculateSauceRequirement($pizzas,$sauce)
    {
        return $pizzas * 125 / $sauce;
    }

    public function calculateCheeseCubeCoverage($sideLength,$thickness,$diameter)
    {
        return (int) (pow($sideLength,3) / ($thickness * pi() * $diameter)) ;
    }

    public function calculateLeftOverSlices($pizzas,$friends)
    {
        return $pizzas * 8 % $friends;
    }
}

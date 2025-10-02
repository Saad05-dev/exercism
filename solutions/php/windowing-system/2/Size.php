<?php

class Size
{
    public int  $height,$width;
    public function __construct($height,$width)
    {
        $this->height = $height;
        $this->width = $width;
    }
}
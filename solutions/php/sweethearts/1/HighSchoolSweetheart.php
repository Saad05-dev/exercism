<?php

class HighSchoolSweetheart
{
    public function firstLetter(string $name): string
    {
        $trimmed = trim($name);
        return $trimmed !== '' ? $trimmed[0] : null;
    }

    public function initial(string $name): string
    {
        return strtoupper($this->firstLetter($name)) . ".";
    }
/**
 * Returns initials for exactly two-part names (first + last).
 * Not suitable for single names or middle names.
 */
    public function initials(string $name): string
    {
        $fullNameItnitials = trim($name);
        $split = strpos($fullNameItnitials,' ');
        $fullNameItnitials = substr($fullNameItnitials,$split + 1 ,1);
        return $this->initial($name) . " " . $fullNameItnitials . ".";
    }

    public function pair(string $sweetheart_a, string $sweetheart_b): string
    {
        $sweethearts = $this->initials($sweetheart_a) . "  +  " . $this->initials($sweetheart_b);
         $heart = <<<HEART
     ******       ******
   **      **   **      **
 **         ** **         **
**            *            **
**                         **
**     $sweethearts     **
 **                       **
   **                   **
     **               **
       **           **
         **       **
           **   **
             ***
              *
HEART;
        return $heart;
    }
}

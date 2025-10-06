<?php

function language_list(...$args)
{
    return $args;
}

function add_to_language_list($list,...$args)
{
    return array_merge($list,$args);
}

function prune_language_list($list)
{
    return array_slice($list,1);
}

function current_language($list)
{
    return $list[0];
}

function language_list_length($list)
{
    return count($list);
}
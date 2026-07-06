
EXPECTED_BAKE_TIME = 40;
PREPARATION_TIME = 2;


def bake_time_remaining(elapsed):
    """Calculate the bake time remaining.

    Parameters:
        elapsed_bake_time (int): The baking time already elapsed.

    Returns:
        int: The remaining bake time (in minutes).

    This function takes the number of minutes the lasagna has been
    baking and returns the remaining bake time based on the
    EXPECTED_BAKE_TIME constant.
    """
    return EXPECTED_BAKE_TIME - elapsed;

    
def preparation_time_in_minutes(preparation):
    """Calculate preparation time in minutes.

    Parameters:
        number_of_layers (int): The number of layers in the lasagna.

    Returns:
        int: Total preparation time (in minutes).

    This function calculates the preparation time by multiplying
    the number of layers by the PREPARATION_TIME constant.
    """
    return preparation * PREPARATION_TIME;





def elapsed_time_in_minutes(num_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.
    
    Parameters:
        number_of_layers (int): The number of layers in the lasagna.
        elapsed_bake_time (int): Time the lasagna has been baking in the oven.
    
    Returns:
        int: The total time elapsed (in minutes) preparing and baking.

    This function takes two integers representing the number of lasagna 
    layers and the time already spent baking the lasagna. It calculates 
    the total elapsed minutes spent cooking (preparing + baking).
    """
    return preparation_time_in_minutes(num_layers) + (40 - bake_time_remaining(elapsed_bake_time));

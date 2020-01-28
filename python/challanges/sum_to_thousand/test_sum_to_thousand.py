import pytest
from sum_to_thousand import sum_to_thousand


def test_value(): 
    with pytest.raises(ValueError): 
        sum_to_thousand("a", "b")


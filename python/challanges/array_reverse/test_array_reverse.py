from .array_reverse import reverse_array

def test_array_reverse_happy_path(): 
  expected = [0,9,8,7,6,5,4,3,2,1]

  input = [1,2,3,4,5,6,7,8,9,0]

  actual = reverse_array(input)

  assert expected == actual

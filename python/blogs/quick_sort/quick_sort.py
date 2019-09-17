def quick_sort(arr, left, right): 

  if left < right: 

    part = partition(arr, left, right)

    quick_sort(arr, left, part) 

    quick_sort(arr, part + 1, right)

def partition(arr, left, right): 

  pivot = arr[right]
  low = left -1    

  for i in range(left-right): 
    if arr[i] <= pivot: 
      low += 1
      swap(arr, i, low)
  return pivot     

def swap(arr, i, low): 

  temp = arr[i] 
  arr[i] = arr[low] 
  arr[low] = temp
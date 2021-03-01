def BinarySearch_iterative(array, key):
    left = 0
    middle =0
    right = len(array) -1

    while left <= right:
        middle = (left + right) // 2

        if array[middle] > key:
            right = middle -1
        elif array[middle] < key:
            left = middle +1
        else:
            return middle

    return -1

array = [2, 3, 4, 5 , 6, 7, 8, 9]
key = 8

result = BinarySearch_iterative(array, key)
print("The index of key is", result)

def BinarySearch_recursive(array, left, right, key):

    if right >= left:

        middle = (left + right) // 2

        if array[middle] == key:
            return middle

        elif array[middle] > key:
            return BinarySearch_recursive(array, left, middle, key)

        else:
            return BinarySearch_recursive(array, middle, right, key)

    else:
        return -1


array = [ 2, 3, 4, 10, 40]
key = 10

result = BinarySearch_recursive(array, 0, len(array)-1, key)

print("Index is ", str(result))

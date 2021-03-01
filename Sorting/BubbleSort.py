def BubbleSort(array):
    length = len(array)

    for i in range(length):
        for j in range(i, length):
            if array[i] > array[j]:
                array[j], array[i] = array[i], array[j]

array = [-72, 232134, -1, 33, 55555, 234, 20000]
for i in range(len(array)):
    print(array[i], end=" ")

BubbleSort(array)
print(" ")
for i in range(len(array)):
    print(array[i], end=" ")

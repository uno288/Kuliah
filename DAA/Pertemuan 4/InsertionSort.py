def InsertionSort(list):
    for i in range (1, len(list)):
        j = i - 1
        next = list[i]          # compare the current element with next one 

        while (list[j] > next) and (j >= 0):
            list [j + 1] = list[j]
            j = j - 1
            list [j + 1] = next

    return list

#list = [25,32,45,76,10,78,84]
list = [89,12,57,16,25,11,75]

print(InsertionSort(list))